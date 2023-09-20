def is_good_turn(x,y):
    if(x+y)>6:
        return "Yes"
    else:
        return "No"
t=int(input())
for _ in range(t):
    x,y = map(int, input().split())
    result = is_good_turn(x,y)
    print(result)
