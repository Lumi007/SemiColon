def jump_loop(numbers:list):
	total = 0
	for number in range(len(numbers)):
		total += sum(numbers) - numbers[number]
	return total	
		


print(jump_loop([1,2,3,4]))
		
	