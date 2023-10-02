t=int(input())
for i in range(t):
    X,H=map(int,input().split())
    if H<=X:
        print("YES")
    else:
        print("NO")
