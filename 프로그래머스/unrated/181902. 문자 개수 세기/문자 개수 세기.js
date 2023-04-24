function solution(str, dict = {}, arr = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz') {
    [...str].forEach(x => (dict[x] ??= 0, dict[x]++));
    return [...arr].map(x => dict[x] ?? 0);
}