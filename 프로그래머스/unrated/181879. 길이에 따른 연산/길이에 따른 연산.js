function solution(arr) {
    return arr.length > 10 ? arr.reduce((p, c) => p + c) : arr.reduce((p, c) => p * c);
}