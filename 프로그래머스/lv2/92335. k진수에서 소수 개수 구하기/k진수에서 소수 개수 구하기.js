const isPrime = (n) => {
    for(let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return n > 1;
}
function solution(n, k) {
    return n
        .toString(k) // n 을 k 진수로 변환
        .split('0') // 0을 기준으로 스플릿
        .filter(Number) // '' 와 같은 빈 값 제거를 위해
        .map(Number) // 숫자로 변환
        .filter(isPrime) // 소수 판단
        .length // 개수 리턴;
}