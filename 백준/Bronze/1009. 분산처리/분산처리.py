import sys

T = int(input())
for tc in range(1, T+1):
    a, b = map(int, sys.stdin.readline().split())
    result = pow(a, b, 10)  # a의 b제곱을 10으로 나눈 나머지를 계산
    if result == 0:  # 나머지가 0이면 결과를 10으로 출력
        result = 10
    print(result)
