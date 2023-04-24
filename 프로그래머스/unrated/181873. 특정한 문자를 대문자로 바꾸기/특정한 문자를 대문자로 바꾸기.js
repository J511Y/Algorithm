function solution(str, alp) {
    return [ ...str ].map(x => x === alp ? x.toUpperCase() : x).join('');
}