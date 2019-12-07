def dailyTemperatures1(T):
    ans = [0] * len(T)
    nxt = [float('inf')] * 102
    for i in range(len(T) - 1, -1, -1):
        warmer_index = min(nxt[t] for t in range(T[i] + 1, 102))
        if warmer_index < float('inf'):
            ans[i] = warmer_index - i
        nxt[T[i]] = i
    return ans
def dailyTemperatures2(T):
    ans=[0]*len(T)
    stack=[]
    for i in range (len(T)-1,-1,-1):
        while len(stack)!=0 and T[i]>=T[stack[-1]]:
            stack.pop()
        if len(stack)!=0:
            ans[i]=stack[-1]-i
        stack.append(i)
    return ans
print(dailyTemperatures2([89,62,70,58,47,47,46,76,100,70]))