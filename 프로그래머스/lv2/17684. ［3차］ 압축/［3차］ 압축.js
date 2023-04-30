function solution(msg, dict = {}, alp = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', idx = 1) {
    const answer = [];
    for(const a of [ ...alp ]) dict[a] = idx++;
    for(let i = 0; i < msg.length;) {
        let word = msg[i], j = i + 1;
        while(dict[word + msg[j]]) word += msg[j++];
        dict[word + msg[j]] = idx++;
        answer.push(dict[word]);
        i = j;
    }
    return answer;
}