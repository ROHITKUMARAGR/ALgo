# creating List
numberList=[1,12,44,21,64,28,87,45,34,63]
#---------------------------LINEAR SORT--------------------------------------------#
# function for linear search
def linearSearch(x):
if x in numberList:
return 1
else:
return -1
x=int(input("enter element to search "))
#calling function
result=linearSearch(x)

2

if (result == 1):
y=numberList.index(x)
print('element found at index',str(y))
else:
print('element not present in array')
