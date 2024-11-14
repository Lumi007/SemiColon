def remove_element(numbers:list)->list:
	if len(numbers) < 2:
		return 0	
	numbers.pop(1)
	return numbers
	raise TypeError

print(remove_element([1,2,3]))
print(remove_element([1]))