const flip = (arr, s, e) => {
    return [
        arr.slice(0, s),
        arr.slice(s, e).sort((a, b) => -1),
        arr.slice(e),
    ].flat(1);
}
function solution(my_string, queries, arr = [...my_string]) {
    for(const [s, e] of queries) arr = flip(arr, s, e + 1);
    return arr.join('');
}