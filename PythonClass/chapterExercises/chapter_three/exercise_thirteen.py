number = int(input("Enter a factorial number: "))   

if number == 0:
	print(1)

result = 1
for i in range(1, number + 1):
        result *= i
print(result)