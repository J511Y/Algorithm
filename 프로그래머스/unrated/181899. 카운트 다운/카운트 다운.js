function solution(s, e, arr = Array(s - e + 1).fill(0)) {
    return arr.map((_, i) => s - i);
}