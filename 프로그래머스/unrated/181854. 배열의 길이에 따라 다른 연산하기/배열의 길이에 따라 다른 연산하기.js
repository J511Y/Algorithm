function solution(arr, n) {
    return arr.map((x, i) => i % 2 != arr.length % 2 ? x + n : x);
}