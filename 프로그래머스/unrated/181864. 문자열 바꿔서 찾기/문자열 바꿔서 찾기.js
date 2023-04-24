function solution(str, pat) {
    return Number(str.replaceAll('B','C').replaceAll('A','B').replaceAll('C','A').includes(pat));
}