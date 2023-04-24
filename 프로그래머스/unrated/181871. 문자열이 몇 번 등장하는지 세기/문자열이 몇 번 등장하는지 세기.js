function solution(str, pat) {
    return [ ...str ].map((x, i) => str.substring(i).startsWith(pat) ? 1 : 0).reduce((p, c) => p + c);
}