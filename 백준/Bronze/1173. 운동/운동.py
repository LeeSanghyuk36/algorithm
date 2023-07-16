N, m, M, T, R = map(int, input().split())

# 초기화
time = 0  # 총 소요 시간
current_pulse = m  # 현재 맥박

while N > 0:  # 운동을 N번 수행할 때까지 반복
    if current_pulse + T > M:  # 운동을 할 수 없는 경우
        current_pulse = max(current_pulse - R, m)  # 휴식 후 현재 맥박을 갱신
    else:
        current_pulse += T  # 운동으로 맥박을 증가시킴
        N -= 1  # 운동을 한 번 수행하였으므로 N을 감소시킴
    time += 1  # 총 소요 시간을 증가시킴

    if current_pulse + T > M and current_pulse == m:  # 운동 및 휴식이 불가능한 경우
        time = -1  # -1로 설정하고 반복문 종료
        break

print(time)
