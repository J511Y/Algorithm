function solution(l, r, arr = []) {
    for(let i = l; i <= r; i++) {
        if (i.toString().replaceAll(/[05]/g, '') === '') arr.push(i);
    }
    return arr.length ? arr : [-1];
}