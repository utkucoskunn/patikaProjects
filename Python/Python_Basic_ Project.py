"""
Case 1

"""

arr1=[[1,'a',['cat'],2],[[[3]],'dog'],4,5]
newArr = []
def Flatten(arr):
    for i in arr:
        if type(i) == list:
            Flatten(i)
        else:
            newArr.append(i)
Flatten(arr1)
print(newArr)

"""
Case 2

"""

arr2=[[1, 2], [3, 4], [5, 6, 7]]
newList=list()
for i in sorted(arr2,reverse=True):
    newList.append(sorted(i, reverse=True))
print(newList)
