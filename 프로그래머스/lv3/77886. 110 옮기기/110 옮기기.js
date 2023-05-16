const is6 = (arr) => arr.at(-3) === 1 && arr.at(-2) === 1 && arr.at(-1) === 0;
const replace = (s) => {
    let stack = [], cnt = 0, i = 0;
    for(const c of [ ...s].map(Number)) {
        stack.push(c);
        if (is6(stack)) cnt += stack.splice(stack.length - 3) ? 1 : 0;
    }
    for(i = stack.length - 1; i >= 0 && stack[i] === 1; i--) {}
    return [ 
        ...stack.slice(0, i + 1), 
        ...Array(cnt).fill([1, 1, 0]).flat(1),
        ...stack.slice(i + 1),
   ].join('');
}
function solution(s) {
    return s.map(replace);
}