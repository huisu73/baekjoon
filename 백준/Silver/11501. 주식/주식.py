import sys
input = sys.stdin.readline

## 아래에 코드 작성
def get_max_profit(prices):
    total = 0
    max_price = 0      #현재까지 찾은 주가 최고점
    for price in reversed(prices):
        if price > max_price:     #미래의 촤고점 갱신
            max_price = price
        else:
            profit = max_price - price
            total += profit
    return total
    

def solution():   
    n = int(input().strip())
    for i in range(n):
        size = int(input().strip())
        prices = list(map(int, input().strip().split()))
        print(get_max_profit(prices))
            
solution()