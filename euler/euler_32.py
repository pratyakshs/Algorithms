import math
import os

def check(i,j,k):
 	res = str(i) + str(j) + str(k)
	a = []
	for i in range(0,10):
		a.append(0)

	for x in res:
		a[int(x)]=1

	flag = 0
	for p in a:
		if p == 0:
			flag = 1
			break
	if flag == 1:
		return False
	else:
		return True

sum = 0
for i in range(1,1000):
	for j in range(i,1000):
		if check(i,j,(i*j)):
			sum = sum + (i*j)

print sum