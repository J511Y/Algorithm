function solution(players, m, k) {
    const servers = Array.from({length: 24}, () => 0)
    const get_max_user = (index) => servers.filter((_, i) => i > index - k).reduce((p, v) => p + v * m, 0) + m
    for(let i = 0; i < 24; i++) {
        const max_user = get_max_user(i)
        if (players[i] >= max_user) {
            servers[i] = Math.ceil((players[i] - max_user + 1) / m)
        }
    }
    return servers.reduce((p, v) => p + v);
}