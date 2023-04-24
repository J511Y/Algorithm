function solution(intStrs, k, s, l) {
    return intStrs.map(x => [...x].slice(s, s + l).join('')).map(Number).filter(x => x > k);
}