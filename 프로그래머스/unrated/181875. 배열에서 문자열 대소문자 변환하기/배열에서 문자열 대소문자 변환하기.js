function solution(arr) {
    return arr.map((x, i) => i % 2 === 0 ? x.toLowerCase() : x.toUpperCase());
}