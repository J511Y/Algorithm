function solution(arr, stk = []) {
    for(const v of arr) {
        if (stk.at(-1) === v) stk.pop();
        else stk.push(v);
    }
    if (!stk.length) stk.push(-1);
    return stk;
}