import math

def check(i,j):
	first = []
	second = []

	print i,j

	first.append(i%10)
	i=i/10
	first.append(i%10)

	second.append(j%10)
	j=j/10
	second.append(j%10)

	print first,second

	res = []

	for k in range(0,len(first)):
		if first[k]!= second[0] and first[k]!=second[1]:
			res.append(first[k])

	for k in range(0,len(second)):
		if second[k]!=first[0] and second[k]!=first[1]:
			res.append(second[k])

	print len(res)
	print res

	if len(res)==2 and i*res[1] == res[0]*j:
		return True
	else:
		return False	

def gcd(a,b):
	if b == 0:
		return a
	else:
		return gcd(b,a%b)

def calc():
	prod = 1
	numerator = 1
	denominator = 1
	for i in range(10,100):
		for j in range(i+1,100):
			if  i%10==0 and  j%10==0:
				print "\n"		 
			else: 
			  if check(i,j):
				print i,j
				numerator = numerator * i
				denominator = denominator * j
			
	x = gcd(numerator,denominator)
	return denominator/x						

if __name__ == "__main__":
	print calc()
