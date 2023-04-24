function solution(str, indices) {
    return [...str].filter((_, i) => !indices.includes(i)).join('');
}