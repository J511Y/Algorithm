function solution(a, b, score = [Math.abs(a - b), 2 * (a + b), a ** 2 + b ** 2]) {
    return score[a % 2 + b % 2];
}