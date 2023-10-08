def solution(s):
    tmp = []
    if len(s) != 1 :

        for k in s :
            if k == '(' :
                tmp.append(k)

            else :
                if tmp[-1:] == ['('] :
                    tmp.pop()
                else:
                    return False


    else :
        tmp.append(s[0])

    return not tmp