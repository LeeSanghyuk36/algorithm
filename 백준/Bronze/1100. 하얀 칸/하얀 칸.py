count = 0
for i in range(8):
    row = input()
    if i % 2 == 0:  # 짝수 번째 줄
        for j in range(0, 8, 2):
            if row[j] == 'F':
                count += 1
    else:  # 홀수 번째 줄
        for j in range(1, 8, 2):
            if row[j] == 'F':
                count += 1
print(count)
