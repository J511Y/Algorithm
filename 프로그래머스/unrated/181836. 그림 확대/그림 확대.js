function solution(picture, k) {
    return picture.map(x => Array(k).fill([...x].map(y => y.repeat(k)).join(''))).flat(1);
}