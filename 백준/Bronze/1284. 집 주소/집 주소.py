# wl 집 주소'''
'''
최초에 str으로 받은 다음에 idx로 구분합시다.
1. 각 숫자 사이 1cm 여백
    숫자 수 - 1 만큼 더하기.
2. 1은 2cm의 너비 차지. 0은 4cm 너비. 나머지는 모두 3 너비
    for 돌면서 n의


3. 호수 경계와 숫자 사이는 1cm의 여백이 들어간다.
    무조건 2cm 더하고 시작.
'''
n = 1
while n > 0:
    n = int(input())
    str_n = str(n)
    if str_n == '0':
        break
    binary = 2 + int(len(str_n) - 1)

    # print(type(str_n))
    # print(n)
    for i in str_n:
        if i == '0':
            binary += 4
        elif i == '1':
            binary += 2
        else:
            binary += 3

    print(binary)


