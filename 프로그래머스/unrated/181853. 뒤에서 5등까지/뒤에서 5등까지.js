function solution(arr) {
    return arr.sort((a, b) => a - b).slice(0, 5);
}