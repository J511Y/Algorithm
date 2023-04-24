function solution(str, pat) {
    return str.substring(0, str.lastIndexOf(pat) + pat.length);
}