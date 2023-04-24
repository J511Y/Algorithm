function solution(arr, n = arr.length, m = arr[0].length, k = Math.max(n, m)) {
    for(let i = 0; i < n; i++) arr[i] = [...arr[i], ...Array(k - m).fill(0)];
    while(n++ < k) arr.push(Array(k).fill(0));
    return arr;
}