function solution(rank, attendance) {
    return rank
        .map((x, i) => [x, i])
        .filter((_, i) => attendance[i])
        .sort((a, b) => a[0] - b[0])
        .slice(0, 3)
        .map((x, i) => x[1] * (10 ** (4 - i * 2)))
        .reduce((p, c) => p + c);
}