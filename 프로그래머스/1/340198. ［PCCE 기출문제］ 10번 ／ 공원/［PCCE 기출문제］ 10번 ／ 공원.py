def solution(mats, park):
    i, j = len(park), len(park[0])
    answer = -1
    map = [[0] * j for _ in range(i)]
    for x in range(i):
        for y in range(j):
            if park[x][y] == "-1":
                map[x][y] = min(map[x-1][y], map[x][y-1], map[x-1][y-1]) + 1
            answer = max(answer, map[x][y]) if map[x][y] in mats else answer
    return answer