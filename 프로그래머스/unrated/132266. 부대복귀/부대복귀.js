function solution(n, roads, sources, destination, left = 0) {
    const dist = Array(n + 1), routes = Array(n + 1);
    dist.fill(-1);
    dist[destination] = 0;
    for(let [a, b] of roads) {
        (routes[a] ??= [], routes[a].push(b));
        (routes[b] ??= [], routes[b].push(a));
    }
    const q = [[destination, 0]];
    while(left < q.length) {
        const [a, cost] = q[left++];
        for(let b of routes[a]) {
            if (dist[b] === -1) {
                q.push([b, cost + 1]);
                dist[b] = cost + 1;
            }
        }
    }
    return sources.map(x => dist[x]);
}