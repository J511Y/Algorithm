function solution(n, w, num) {
    const rectHeight = Math.floor(n / w)
    const floor = Math.ceil(num / w)
    const isOver = Math.ceil(n / w) !== rectHeight
    let result = rectHeight - floor + 1
    if (isOver) {
        if ((rectHeight + 1) % 2 === floor % 2) {
            // 방향이 같다면 나머지가 같거나 크기만 하면 됨
            result += (num - 1) % w <= (n - 1) % w ? 1 : 0
        } else {
            // 방향이 다르다면 
            result += ((num - 1) % w + (n - 1) % w) >= (w - 1) ? 1 : 0
        }
    }
    
    return result;
}