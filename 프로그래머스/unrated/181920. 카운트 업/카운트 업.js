function solution(start, end, arr = []) {
    while(start <= end) arr.push(start++);
    return arr;
}