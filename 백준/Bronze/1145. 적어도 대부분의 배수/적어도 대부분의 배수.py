def gcd(a, b):
    # 최대공약수를 구하는 함수
    while b != 0:
        a, b = b, a % b
    return a

numbers = list(map(int, input().split()))

# 다섯 개의 수 중에서 가능한 모든 세 수의 조합을 구합니다.
combinations = []
for i in range(5):
    for j in range(i+1, 5):
        for k in range(j+1, 5):
            combinations.append((numbers[i], numbers[j], numbers[k]))

# 가능한 모든 조합의 최소공배수를 계산합니다.
min_lcm = float('inf')
for a, b, c in combinations:
    # 세 수의 최소공배수는 두 수의 최소공배수를 계산하여 구할 수 있습니다.
    lcm_ab = a * b // gcd(a, b)
    lcm_abc = lcm_ab * c // gcd(lcm_ab, c)
    min_lcm = min(min_lcm, lcm_abc)

print(min_lcm)