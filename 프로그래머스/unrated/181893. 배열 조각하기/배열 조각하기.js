function solution(arr, query) {
    query.forEach((x, i) => arr = i % 2 ? arr.slice(x) : arr.slice(0, x + 1));
    return arr;
}