// time to int
const tti = (time) => {
    const split = time.split(':').map(Number);
    return split[0] * 60 + split[1];
}
function solution(fees, records, answer = []) {
    const cars = {};
    const times = {};
    for(const record of records) {
        const split = record.split(' ');
        const time = tti(split[0]), num = split[1], type = split[2];
        // 들어온 경우 시간 저장
        if (type === 'IN') {
            cars[num] = time;
        } else {
            // 나간 경우 times에 diff 값 더해주기
            const diff = time - cars[num];
            times[num] = (times[num] ?? 0) + diff; //optional operator
            cars[num] = 1439; // without out 처리
        }
    }
    // get keys
    const keys = Object.keys(cars).sort((a, b) => Number(a) - Number(b));
    const [dt, dp, at, ap] = fees;
    // default time, default pay, addtional time, addtional pay
    for(const num of keys) {
        // 아웃 로그 없는 차인 경우 default 1439
        const time = (times[num] ?? 0) + (1439 - cars[num]);
        const val = dp + Math.ceil(Math.max((time - dt), 0) / at) * ap; // calc
        answer.push(val);
    }
    return answer;
}