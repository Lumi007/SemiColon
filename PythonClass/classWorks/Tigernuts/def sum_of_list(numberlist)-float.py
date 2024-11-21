def sum_of_list(numbers:list)->float:
	sum = 0
	for number in range(numbers):
		if number % 2 == 0:
			sum =sum + number
	return sum



sum_of_list([1,2,3,4,6])