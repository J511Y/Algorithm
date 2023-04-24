function solution(n, arr = [n]) {
    while(n > 1) arr.push(n = n % 2 == 0 ? n / 2 : (3 * n + 1));
    return arr;
}