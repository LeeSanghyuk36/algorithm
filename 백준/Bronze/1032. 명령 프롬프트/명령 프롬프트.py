import sys

T = int(input())

names = []
for tc in range(1, T+1):
    name = sys.stdin.readline()
    names.append(name)
pattern = names[0]
answer = ""

for i in range(len(pattern)):
    same_char = True
    for j in range(1, T):
        if pattern[i] != names[j][i]:
            same_char = False
            break
    if same_char:
        answer += pattern[i]
    else:
        answer += '?'

print(answer)
