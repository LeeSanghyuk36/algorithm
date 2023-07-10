import sys
aa= int(input())
divisors = list(map(int, sys.stdin.readline().split()))
mn_divisor = min(divisors)
mx_divisor = max(divisors)

answer = mn_divisor * mx_divisor

print(answer)