function solution(arr, rst = -1) {
    for(let i in arr) {
        if (arr[i] < 0) {
            rst = i;
            break;
        }
    }
    return Number(rst);
}