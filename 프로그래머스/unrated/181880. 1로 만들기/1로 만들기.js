function solution(arr) {
    const func = (n, c = 0) => {
        while(n > 1 && ++c) n = parseInt(n / 2);
        return c;
    };
    return arr.map(x => func(x)).reduce((p, c) => p + c);
}