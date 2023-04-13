function solution(targets) {
    var answer = 0, x = 0;
    targets.sort((a, b) => a[0] - b[0] ? a[0] - b[0] : a[1] - b[1])
        .forEach(([left, right]) => {
            if (x <= left) {
                x = right;
                answer++;
            } else if (x > right) {
                x = right;
            }
        });
    
    return answer;
}