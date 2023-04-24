function solution(arr, n) {
    return [ ...arr.slice(n), ...arr.slice(0, n) ];
}