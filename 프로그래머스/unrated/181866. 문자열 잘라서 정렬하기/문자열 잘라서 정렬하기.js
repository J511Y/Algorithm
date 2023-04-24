function solution(arr) {
    return arr.split('x').filter(Boolean).sort((a, b) => a.localeCompare(b));
}