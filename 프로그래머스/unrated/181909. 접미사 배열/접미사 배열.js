function solution(my_string) {
    return [...my_string].map((_, i) => my_string.substring(i)).sort((a, b) => a.localeCompare(b));
}