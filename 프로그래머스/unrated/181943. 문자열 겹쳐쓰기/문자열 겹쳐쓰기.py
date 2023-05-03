def solution(str, overwrite_string, s):
    n = len(overwrite_string) + s
    return str[0:s] + overwrite_string + str[n:]