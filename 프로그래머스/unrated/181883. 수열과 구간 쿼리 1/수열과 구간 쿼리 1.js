function solution(arr, queries) {
    for(let [s, e] of queries) {
        while(s <= e) arr[s++]++;
    }
    return arr;
}