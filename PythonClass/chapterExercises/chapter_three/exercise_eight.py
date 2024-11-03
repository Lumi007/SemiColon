import math


numbers = []
for i in range(4):
	num = int(input(f'Enter integer {i+1}: '))
	numbers.append(num)
    
print(f'Sum is {sum(numbers)}')
print(f'Average is {sum(numbers)/len(numbers)}')
print(f'Product is {math.prod(numbers)}')
print(f'Smallest is {min(numbers)}')
print(f'Largest is {max(numbers)}')