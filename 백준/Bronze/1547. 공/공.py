'''
컵 3개. 공 1개
1번 컵에 공. 이거 야바위네.

고른 컵이 1,2면 1에 2를 이동. 2에 1을 이동.

'''
cups = [0,1,2,3]
# 초기 컵 위치 [1, 2, 3]

m = int(input())

for tc in range(m):
    x, y = map(int, input().split())
    
    cups[x], cups[y] = cups[y], cups[x]
    # 1번 공의 위치를 찾음

print(cups.index(1))