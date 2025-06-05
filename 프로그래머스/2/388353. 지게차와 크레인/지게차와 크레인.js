const coordMap = {}
const initMap = (n, m, v = -1) => Array.from({length: n}, (_) => Array.from({length: m}, () => v));
const fill = (map, n, m, v = 0) => {
    const wh = [[-1, 0, 1, 0], [0, -1, 0, 1]];
    const visit = initMap(n, m, false);
    const q = [[0, 0]];
    const mem = [[0, 0]];
    visit[0][0] = true;
    while(q.length) {
        let [x, y] = q.shift();
        map[x][y] = -1;
        for(let i = 0; i < 4; i++) {
            let nx = x + wh[0][i];
            let ny = y + wh[1][i];
            if (0 <= nx && 0 <= ny && nx < n && ny < m && !visit[nx][ny]) {
                if (map[nx][ny] === -1 || map[nx][ny] === 0) {
                    q.push([nx, ny]);
                    mem.push([nx, ny]);
                    visit[nx][ny] = true;
                }
            }
        }
    }
    
    // 저장된 좌표들 근처의 v가 위치한 곳 모두 -1 처리
    for(let [x, y] of mem) {
        for(let i = 0; i < 4; i++) {
            let nx = x + wh[0][i];
            let ny = y + wh[1][i];
            if (0 <= nx && 0 <= ny && nx < n && ny < m && map[nx][ny] === v) {
                map[nx][ny] = -1;
            }
        }
    }
}
const popAll = (map, n, m, request) => {
    // 미리 저장해둔 좌표들을 모두 0으로 만든다.
    coordMap[request.charAt(0)]?.forEach(([i, j]) => map[i][j] = 0)
    fill(map, n, m)
}
const popOutside = (map, n, m, request) => {
    fill(map, n, m, request)
}
function solution(storages, requests) {
    // 외곽선을 위해 2칸 크게 설정
    const [n, m] = [storages.length + 2, storages[0].length + 2];
    const map = initMap(n, m);
    storages.forEach((storage, i) => {
        storage.split("").forEach((char, j) =>{
            // 빠른 추출을 위해 위치 정보 dictionary 화
            (coordMap[char] ??= []).push([i + 1, j + 1])
            map[i + 1][j + 1] = char
        })
    })

    for (request of requests) {
        const func = request.length > 1 ? popAll : popOutside;
        func(map, n, m, request);
    }

    return map.reduce((p, row) => p + row.filter(v => !Number.isInteger(v)).length, 0);
}