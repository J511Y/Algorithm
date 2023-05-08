function solution(n, t, m, p, i = -1, result = []) {
    while(result.length < t * m) result.push(...[ ...(++i).toString(n).toUpperCase() ])
    return Array(t).fill(0).map((_, i) => result[i * m + (p - 1)]).join('').toUpperCase();
}