import (
  "strings"
)
func setNnumCount(str string) map[string]int {
    var mpNCnt map[string]int = make(map[string]int)

    for i := 0; i < len(str); i++ {
        ch := str[i : i+1]
        mpNCnt[ch]++
    }

    return mpNCnt
}

func solution(X string, Y string) string {

    mpx := setNnumCount(X)
    mpy := setNnumCount(Y)

    mySlice := []string{}
    var strrst string = ""
    var numstr string = "9876543210"

    for _, i := range numstr {
        key := string(i)
        cnt := mpx[key]
        if mpx[key] > mpy[key] {
            cnt = mpy[key]
        }
        for k := 0; k < cnt; k++ {
            mySlice = append(mySlice, key)
        }
    }
    strrst = strings.Join(mySlice, "")
    if len(strrst) == 0 {
        strrst = "-1"

    } else if strrst[0:1] == "0" {
        strrst = "0"

    }

    return strrst
}