function solution(n, slicer, arr) {
    const [a, b, c] = slicer;
    if (n === 1) return arr.slice(0, b + 1);
    if (n === 2) return arr.slice(a);
    if (n === 3) return arr.slice(a, b + 1);
    return arr.slice(a, b + 1).filter((_, i) => i % c === 0);
}