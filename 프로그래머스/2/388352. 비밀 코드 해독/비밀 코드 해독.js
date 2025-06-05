const answers = []
const isPossible = (bit, queries, ans) => {
    return queries.every((query, i) => query.map(q => (1 << q) & bit).filter(Boolean).length === ans[i]);
}
const bt = (bit, i, size, n, q, ans) => {
    // 조건 충족 체크
    if (i > n + 1) return;
    if (size > 0) {
        bt(bit | (1 << i), i + 1, size - 1, n, q, ans);
        bt(bit, i + 1, size, n, q, ans);
    } else if(isPossible(bit, q, ans)) {
        answers.push(bit);
    }
}
function solution(n, q, ans) {
    bt(0, 1, 5, n, q, ans);
    return answers.length;
}