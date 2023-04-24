function solution(n, m = 0, arr = []) {
    for(let i = 0; i < n; i++) arr.push(Array(n).fill(0));
    let wh = [[0, 1, 0, -1], [1, 0, -1, 0]], d = 0, i = 0, j = 0, k = 1;
    while(m++ < n ** 2) {
        arr[i][j] = k++;
        if (arr[i + wh[0][d]]?.[j + wh[1][d]] ?? 1) d = (d + 1) % 4;
        [i, j] = [i + wh[0][d], j + wh[1][d]];
    }
    return arr;
}