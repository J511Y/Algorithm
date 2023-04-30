function solution(expression, max = 0) {
    const priority = [ '+-*', '+*-', '-+*', '-*+', '*-+', '*+-'];
    const tokens = expression.match(/([0-9]+|[\+\-\*])/g);
    for(const p of priority) {
        let sub = [ ...tokens ];
        for(const oper of [ ...p ]) {
            let idx = -1;
            while((idx = sub.indexOf(oper)) > 0) {
                sub = [
                    ...sub.slice(0, idx - 1),
                    eval(sub.slice(idx - 1, idx + 2).join('')),
                    ...sub.slice(idx + 2),
                ];
            }
        }
        max = Math.max(max, Math.abs(Number(sub[0])));
    }
    return max;
}