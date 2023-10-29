def check_order(difficulty_ratings):
    for i in range(1, len(difficulty_ratings)):
        if difficulty_ratings[i] < difficulty_ratings[i - 1]:
            return "No"
    return "Yes"
T = int(input())
for _ in range(T):
    N = int(input())
    difficulty_ratings = list(map(int, input().split()))
    result = check_order(difficulty_ratings)
    print(result)
