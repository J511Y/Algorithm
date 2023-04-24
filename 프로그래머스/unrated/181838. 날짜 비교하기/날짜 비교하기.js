function solution(date1, date2) {
    const toInt = (arr) => arr[0] * 365 + arr[1] * 31 + arr[2];
    return Number(toInt(date1) < toInt(date2));
}