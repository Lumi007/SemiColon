def merge_two_array(numbersOne:list, numbersTwo:list):
	merged_array = []	
	for numberOne in numbersOne:
		for numberTwo in numbersTwo:
			if numberOne < numberTwo:
				merged_array.append(numberOne)
			else:
				merged_array.append(numberTwo)

	return merged_array


print(merge_two_array([1,3,5], [2,4,6]))