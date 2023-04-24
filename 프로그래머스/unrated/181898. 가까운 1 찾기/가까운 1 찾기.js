function solution(arr, i, rst = -1) {
    for(; i < arr.length; i++) {
        if (arr[i]) {
            rst = i;
            break;
        }
    }
    return rst;
}