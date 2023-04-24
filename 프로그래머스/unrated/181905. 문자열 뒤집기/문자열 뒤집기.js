function solution(str, s, e, arr = [...str]) {
    return [
        arr.slice(0, s),
        arr.slice(s, e + 1).sort((a, b) => -1),
        arr.slice(e + 1),
    ].flat(1).join('');
}