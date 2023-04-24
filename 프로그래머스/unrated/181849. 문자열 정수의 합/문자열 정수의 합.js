function solution(str) {
    return [ ...str ].map(Number).reduce((p, c) => p + c);
}