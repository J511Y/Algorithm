// 열린 괄호 판단 함수
const isOpen = (c) => c === '(' ? 1 : -1;

// 인수 문자열이 '올바른 괄호 문자열'인지 판단하는 함수
const isCorrect = (w) => {
    let cnt = 0;
    for(const c of [ ...w]) {
        cnt += isOpen(c);
        if (cnt < 0) return false; // 중간에 cnt가 음수라면 닫힌 괄호가 더 많은 경우
    }
    return cnt === 0; // 반복을 마쳤을 때 cnt가 0이여야 올바른 괄호 문자열임
}
// 문제에 나온 함수 구현
const recursion = (w) => {
    if (!w) return ''; // 1
    let cnt = isOpen(w[0]), idx = 1;
    while(cnt !== 0) cnt += isOpen(w[idx++]); // 2를 구하기 위한 idx 찾기
    
    let u = w.substring(0, idx), v = w.substring(idx, w.length); // 2
    
    if (isCorrect(u)) { // 3
        return u + recursion(v); // 3-1
    } else { // 4
        v = '(' + recursion(v) + ')'; // 4-1 ~ 4-3
        u = [...u.substring(1, u.length - 1)].map(x => x === '(' ? ')' : '(').join(''); // 4-4
        return v + u; // 4-5
    }
}
function solution(p) {
    return recursion(p);
}