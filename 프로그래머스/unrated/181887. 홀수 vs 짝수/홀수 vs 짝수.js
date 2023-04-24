function solution(arr) {
    const sum = (arr, n) => arr.filter((_, i) => i % 2 === n).reduce((p, c) => p + c);
    return Math.max(sum(arr, 0), sum(arr, 1));
}