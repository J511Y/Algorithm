function solution(arr1, arr2, ) {
    const compare = (a, b, s = a - b) => s ? s < 0 ? -1 : 1 : 0;
    const sum1 = arr1.reduce((p, c) => p + c), sum2 = arr2.reduce((p, c) => p + c);
    const len1 = arr1.length, len2 = arr2.length;
    if (len1 !== len2) return compare(len1, len2);
    return compare(sum1, sum2);
}