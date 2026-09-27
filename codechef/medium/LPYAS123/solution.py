n = int(input())
# Update the code below this line
def fibona(n):
    if(n<=0):
        return []
    elif n==1:
        return [0]
    se=[0,1]
    for i in range(2,n):
        n=se[-1]+se[-2]
        se.append(n)
    for i in se:
        print(i,end=" ")
    return False
    
fibona(n)