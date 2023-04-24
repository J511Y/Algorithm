function solution(arr, n = arr.length, flag = true) {
    for(let i = 0; i < n; i++) {
        for(let j = 0; j < n; j++) {
            flag &= arr[i][j] === arr[j][i];
        }
    }
    return flag;
}