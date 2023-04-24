function solution(arr, n) {
    return arr.filter((_, i) => i % n === 0);
}