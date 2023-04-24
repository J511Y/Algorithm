function solution(arr, flag, rst = []) {
    flag.forEach((x, i) => {
        if (x) rst = [ ...rst, ...Array(arr[i] * 2).fill(arr[i])]
        else {
            while(arr[i]--) rst.pop();
        }
    })
    return rst;
}