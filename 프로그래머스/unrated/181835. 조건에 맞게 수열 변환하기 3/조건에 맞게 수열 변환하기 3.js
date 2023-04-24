function solution(arr, k) {
    return arr.map(x => k % 2 === 0 ? x + k : x * k);
}