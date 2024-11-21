def list_duplicate_checker(numbers:list):
	for numberOne in range(len(numbers)):
		for numberTwo in range(numberOne + 1, len(numbers)):
			if numbers[numberOne] == numbers[numberTwo]:
				return True
			
	return False


print(list_duplicate_checker([1,2,3,2,3]))
print(list_duplicate_checker([1,2,3,4,5]))