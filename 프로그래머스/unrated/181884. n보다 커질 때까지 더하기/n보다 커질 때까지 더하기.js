function solution(numbers, n) {
    return numbers.reduce((p, c) => p > n ? p : (p + c));
}