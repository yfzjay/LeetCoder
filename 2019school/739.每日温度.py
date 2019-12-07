
def dailyTemperatures1(T):#维护一个next数组 next[T[i]]=i 用时间换空间
    ans = [0] * len(T)
    nxt = [float('inf')] * 102
    for i in range(len(T) - 1, -1, -1):
        warmer_index = min(nxt[t] for t in range(T[i] + 1, 102))
        if warmer_index < float('inf'):
            ans[i] = warmer_index - i
        nxt[T[i]] = i
    return ans
def dailyTemperatures2(T):#用栈来解决 其实就是之前小的元素无用了
    ans=[0]*len(T)
    stack=[]
    for i in range (len(T)-1,-1,-1):
        while len(stack)!=0 and T[i]>=T[stack[-1]]:
            stack.pop()
        if len(stack)!=0:
            ans[i]=stack[-1]-i
        stack.append(i)
    return ans
def dailyTemperatures3(T):#一般解法，超时
    ans=[0]*len(T)
    for i in range (len(T)-2,-1,-1):
        for j in range(i+1,len(T)):
            if T[j]>T[i]:
                ans[i]=j-i
                break
    return ans
print(dailyTemperatures3([89,62,70,58,47,47,46,76,100,70]))