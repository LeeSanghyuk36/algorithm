n = int(input())
members = []
for _ in range(0,n):
    age, name = input().split()
    members.append((int(age), name))

# print(members)
#     for i in range(len(members):
#         members[i][0] = str(members[i][0])

members.sort(key=lambda x: x[0])

for member in members:
    print(member[0], member[1])