function solution(arr, n = 1) {
    while(n < arr.length) n <<= 1;
    return [ ...arr, Array(n - arr.length).fill(0) ].flat(1);
}