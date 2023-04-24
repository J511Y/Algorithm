function solution(my_strings, parts) {
    return my_strings.map((x, i) => [...x].slice(parts[i][0], parts[i][1] + 1).join('')).reduce((p, c) => p + c, '');
}