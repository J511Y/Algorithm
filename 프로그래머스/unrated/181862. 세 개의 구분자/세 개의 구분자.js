function solution(str) {
    var arr = str.replaceAll(/[abc]/g, ' ').split(' ').filter(Boolean);
    if (!arr.length) arr.push('EMPTY');
    return arr;
}