def list_duplicate_checker(numbers:list):
	for numberOne in range(len(numbers)):
		for numberTwo in range(numberOne+1, len(numbers)):
			if numberOne == numberTwo:
				return True
			else:
				return False


print(list_duplicate_checker([1,2,3,2,3]))
print(list_duplicate_checker([1,2,3,4,5]))