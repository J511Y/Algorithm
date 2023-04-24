function solution(arr, k, set = [ ...new Set(arr) ]) {
    const rtn = new Array(k).fill(-1);
    for(let i = 0; i < Math.min(k, set.length); i++) rtn[i] = set[i];
    return rtn;
}