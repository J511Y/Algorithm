function solution(arr, ex) {
    return arr.filter(x => !x.includes(ex)).join('');
}