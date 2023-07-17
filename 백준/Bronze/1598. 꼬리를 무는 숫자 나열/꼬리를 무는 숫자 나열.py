a, b = map(int, input().split())  # a와 b를 입력받아서 변수에 할당합니다.

# a와 b의 좌표를 계산합니다.
# 각 숫자를 좌표로 생각하고, 행과 열로 변환합니다.
# 행은 (a-1) // 4 + 1로 계산하고, 열은 (a-1) % 4 + 1로 계산합니다.
a_row = (a - 1) // 4 + 1
a_col = (a - 1) % 4 + 1

b_row = (b - 1) // 4 + 1
b_col = (b - 1) % 4 + 1

# a와 b의 좌표 간의 거리를 계산합니다.
# 행 간의 거리는 abs(a_row - b_row)로 계산하고, 열 간의 거리는 abs(a_col - b_col)로 계산합니다.
distance = abs(a_row - b_row) + abs(a_col - b_col)

print(distance)  # 거리를 출력합니다.
