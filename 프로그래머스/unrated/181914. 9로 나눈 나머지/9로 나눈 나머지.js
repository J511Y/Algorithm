function solution(number) {
    return [...number].map(Number).reduce((p, c) => p + c) % 9;
}