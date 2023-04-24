function solution(strArr, cnt = Array(31).fill(0)) {
    strArr.forEach(x => cnt[x.length]++);
    return Math.max(...cnt);
}