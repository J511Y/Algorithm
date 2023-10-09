function solution(today, terms, privacies) {
  var answer = [];
  let rules = [];
  let todayNum = Math.floor(today.split(".").join(""));
  for (let i = 0; i < terms.length; i++) {
    let rule = terms[i].split(" ");
    rules.push(...rule);
  }
  for (let j = 0; j < privacies.length; j++) {
    let date = Math.floor(privacies[j].split(" ")[0].split(".").join(""));
    let index = rules.indexOf(privacies[j].split(" ")[1]);
    let rule = rules[index + 1];
    let month = rule * 100;
    date= date + Math.floor(month/1200)*10000 + month%1200;

    if (date % 10000 >= 1300) {
      date = date - 1200 + 10000;
    }
    if (date % 100 === 1) date = date - 100 + 27;
    else date--;
    if (todayNum > date) answer.push(j + 1);
  }
    return answer
}