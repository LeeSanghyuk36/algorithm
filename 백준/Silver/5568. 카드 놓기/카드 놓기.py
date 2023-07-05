
def make_combinations(cards, selected, visited, k, nums):
    if len(selected) == k:  # k개의 숫자를 선택한 경우
        nums.add(''.join(selected))  # 선택한 숫자들을 문자열로 결합하여 집합에 추가
        return

    for i in range(len(cards)):
        if not visited[i]:
            visited[i] = True
            selected.append(cards[i])
            make_combinations(cards, selected, visited, k, nums)
            selected.pop()
            visited[i] = False


n = int(input())  # 카드의 개수
k = int(input())  # 선택할 숫자의 개수

cards = []  # 카드 리스트
for _ in range(n):
    card = input()
    cards.append(card)

selected = []  # 선택한 숫자들을 담을 리스트
visited = [False] * n  # 카드 방문 여부를 표시할 리스트
nums = set()  # 가능한 숫자 조합을 저장할 집합

make_combinations(cards, selected, visited, k, nums)  # 가능한 숫자 조합 생성

print(len(nums))  # 가능한 숫자 조합의 개수 출력