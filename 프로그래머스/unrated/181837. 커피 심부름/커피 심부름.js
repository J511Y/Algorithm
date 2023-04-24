function solution(order) {
    return order.map(x => x.includes('cafelatte') ? 5000 : 4500).reduce((p, c) => p + c);
}