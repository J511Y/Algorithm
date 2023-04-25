let min = 1 << 30;
const wh = [[0, 1, 0, -1, 0], [1, 0, -1, 0, 0]];
const isSolved = (arr) => arr.flat(1).every(x => x === 0);
const rotate = (arr, a, b, c, n = arr.length) => {
    for(let i = 0; i < 5; i++) {
        let [x, y] = [a + wh[0][i], b + wh[1][i]];
        if (0 <= x && 0 <= y && x < n && y < n) arr[x][y] = (arr[x][y] + c) % 4;
    }
}
const dfs = (arr, rotateArr, idx, n = arr.length) => {
    if (idx === n) {
        let tmp = arr.map(x => [...x]), cnt = rotateArr.reduce((p, c) => p + c);
        // 상단
        for(let i = 0; i < n; i++) rotate(tmp, 0, i, rotateArr[i]);
        
        // 나머지
        for(let i = 1, bi = 0; i < n; i++, bi++) {
            for(let j = 0; j < n; j++) {
                if (tmp[bi][j]) {
                    const v = 4 - tmp[bi][j];
                    cnt += v;
                    rotate(tmp, i, j, v);
                }
            }
        }
        if (isSolved(tmp)) min = Math.min(min, cnt);
    } else {
        for(let i = 0; i < 4; i++) {
            const tmp = [ ...rotateArr ];
            tmp[idx] = i;
            dfs(arr, tmp, idx + 1);
        }
    }
}
function solution(clockHands, n = clockHands.length) {
    dfs(clockHands, Array(n).fill(0), 0);
    return min;
}