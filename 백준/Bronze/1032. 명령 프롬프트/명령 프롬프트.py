n = int(input())  # 파일명의 개수를 입력받습니다.

file_names = []  # 파일명을 저장할 리스트를 생성합니다.

# 파일명을 입력받아 리스트에 저장합니다.
for _ in range(n):
    file_name = input()
    file_names.append(file_name)

pattern = file_names[0]  # 첫 번째 파일명을 패턴으로 설정합니다.

answer = ""  # 변환된 파일명을 저장할 변수를 생성합니다.

# 각 파일명의 문자를 비교하여 패턴을 만듭니다.
for i in range(len(pattern)):
    same_char = True  # 해당 위치의 문자가 모두 같은지 확인하기 위한 변수입니다.
    for j in range(1, n):
        if pattern[i] != file_names[j][i]:
            same_char = False
            break
    if same_char:
        answer += pattern[i]
    else:
        answer += "?"

print(answer)  # 변환된 파일명을 출력합니다.
