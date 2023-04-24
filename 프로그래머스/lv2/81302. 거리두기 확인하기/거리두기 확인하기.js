// 특정 사람과 최대 2 맨해튼 거리 이내에 사람이 있는지 체크
// 방문 체크용 vst는 includes 쓰려고 그냥 이차원 배열을 플랫하게 만들었을 경우의 index로 채워넣음
const bfs = (place, i, j, vst = [i * 5 + j]) => {
    const queue = [[i, j, 0]], wh = [[0, 1, 0, -1], [1, 0, -1, 0]];
    while(queue.length) {
        const [a, b, d] = queue.shift();
        for(let k = 0; k < 4; k++) {
            const x = a + wh[0][k], y = b + wh[1][k], idx = x * 5 + y;
            // x y 좌표에 값이 있고, 방문하지 않았으며, 아직 2 맨해튼 거리를 채우지 않은 경우
            if (place[x]?.[y] && !vst.includes(idx) && d < 2) {
                // 사람을 만났다면 거리두기 지키지 않은 것
                // 파티션인 경우는 그냥 넘기기 (가려진 뒤 쪽은 어차피 상관 없음)
                if (place[x][y] === 'P') return 0;
                if (place[x][y] === 'X') continue;
                vst.push(idx);
                queue.push([x, y, d + 1]);
            }
        }
    }
    return 1;
}

// 대기실에 대하여 거리두기를 모두 지키고 있는지 확인하는 메서드
const check = (place, rtn = 1) => {
    for(let i = 0; i < 5; i++) {
        for(let j = 0; j < 5; j++) {
            //모든 사람에 대해 거리두기를 지키고 있는지 확인
            if (place[i][j] === 'P') rtn &= bfs(place, i, j);
        }
    }
    return rtn;
}

function solution(places) {
    // 모든 대기실에 대해 check를 수행한 결과값을 모아 리턴
    return places.map((place) => check([...place.map(x => [...x])]));
}
