function solution(arr, stk = [arr[0]]) {
    for(const v of arr) {
        while (stk.at(-1) >= v) stk.pop();
        stk.push(v);
    }
    return stk;
}