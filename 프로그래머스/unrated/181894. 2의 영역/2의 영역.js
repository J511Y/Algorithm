function solution(arr, s = arr.indexOf(2), e = arr.lastIndexOf(2)) {
    return s < 0 ? [-1] : arr.slice(s, e + 1);
}