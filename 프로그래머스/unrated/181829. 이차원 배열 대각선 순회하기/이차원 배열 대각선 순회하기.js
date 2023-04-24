function solution(board, k) {
    return board.map((x, i) => x.filter((_, j) => i + j <= k)).flat(1).reduce((p, c) => p + c);
}