function solution(a, b, c, d, arr = [a, b, c, d], n = new Set(arr).size) {
    arr.sort((x, y) => {
        const xc = arr.filter(z => z === x).length, yc = arr.filter(z => z === y).length;
        return xc - yc === 0 ? x - y : yc - xc;
    });
    if (n === 1) return 1111 * a;
    if (n === 2) {
        if (arr[2] !== arr[3]) return (10 * arr[0] + arr[3]) ** 2;
        return (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
    }
    if (n === 3) return arr[2] * arr[3];
    return Math.min(...arr);
}