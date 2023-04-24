function solution(arr) {
    return arr.map(x => Array(x).fill(x)).flat(1);
}