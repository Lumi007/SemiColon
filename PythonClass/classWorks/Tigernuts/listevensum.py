def sum_of_list(numbers:list)->float:
	sum = 0
	for number in numbers:
		if number % 2 == 0:
			sum += number
	return sum



print(sum_of_list([1,2,3,4,6]))

print(sum_of_list([1,-2,3,4,6]))

print(sum_of_list([1,-2,3,4.4,6]))