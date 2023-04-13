function solution(r1, r2, onLine = 0) {
    const count = (r, isR1, cnt = 0) => {
        for(let i = 1; i < r; i++) {
            const val = Math.sqrt(r ** 2 - i ** 2);
            cnt += parseInt(val);
            if (isR1 && val === parseInt(val)) onLine++;
        }
        return r * 4 + cnt * 4 + 1;
    };
    return count(r2) - count(r1, true) + onLine * 4 + 4;
}