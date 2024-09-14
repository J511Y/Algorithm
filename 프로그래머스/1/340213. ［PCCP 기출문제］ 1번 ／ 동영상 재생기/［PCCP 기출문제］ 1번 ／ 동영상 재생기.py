def stt(time): return sum([ int(t) * [60, 1][i] for i, t in enumerate(time.split(':'))])
def tts(time): return "{:02d}:{:02d}".format(time // 60, time % 60)
def solution(video_len, pos, op_start, op_end, commands):
    video_len, pos, op_start, op_end = [ stt(v) for v in [video_len, pos, op_start, op_end]]
    def move(time, plus):
        return op_end if op_start <= time + plus <= op_end else min(max(time + plus, 0), video_len)
    
    for com in commands:
        pos = move(pos, 0)
        pos = move(pos, 10 if com == 'next' else -10)
    return tts(pos)