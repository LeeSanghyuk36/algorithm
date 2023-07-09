N = input()
F = int(input())

# 뒤에서 두 자리를 00으로 만듦
N = N[:-2] + "00"

# N을 F로 나눈 나머지를 구함
remainder = int(N) % F

# 나머지가 0보다 크면 F에서 나머지를 뺀 값이 정답
if remainder != 0:
    result = F - remainder

else:
    result = 0

# 결과가 한 자리 수일 경우 앞에 0을 붙여 출력
if result < 10:
    result = "0" + str(result)

print(result)