function solution(a, b, n = Math.max(a.length, b.length)) {
    a = [...a];
    b = [...b];
    const arr = Array(n + 1).fill(0);
    for(let i = 0, up = 0; i <= n; i++) {
        const A = Number(a.at(-1 - i)) | 0, B = Number(b.at(-1 - i)) | 0
        const next = A + B + up;
        up = next >= 10 ? 1 : 0;
        arr[n - i] = next % 10;
    }
    return arr.slice(arr[0] ? 0 : 1).join('');
}