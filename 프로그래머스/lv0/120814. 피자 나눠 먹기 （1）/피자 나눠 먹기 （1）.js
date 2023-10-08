function solution(n) {
    let a = 0;
    for (let i = 1; 7 * (i - 1) < n ; i++) {
        a = i;
    }
    return a;
}