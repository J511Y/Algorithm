function solution(arr, del) {
    return arr.filter(x => !del.includes(x));
}