function solution(arr, intervals) {
    return intervals.map(([s, e]) => arr.slice(s, e + 1)).flat(1);
}