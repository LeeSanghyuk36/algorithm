colors = {
    'black': 0,
    'brown': 1,
    'red': 2,
    'orange': 3,
    'yellow': 4,
    'green': 5,
    'blue': 6,
    'violet':7,
    'grey': 8,
    'white': 9,
}
clst = []
for _ in range(3):
    # 삼색을 받는다.
    clst.append(input())
resistanse = (colors[clst[0]] * 10 + colors[clst[1]]) * (10 ** colors[clst[2]])
print(resistanse)