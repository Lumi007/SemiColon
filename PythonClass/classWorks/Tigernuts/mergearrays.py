def merge_two_array(numbersOne:list, numbersTwo:list):
	merged_array = []	
	i = 0 
	j = 0 
	k = 0
		
	while (i < len(numbersOne) and j < len(numbersTwo)):
		if (numbersOne[i] <= numbersTwo[j]):
			merged_array[k += 1] = numbersOne[i += 1]
		else:
			merged_array[k += 1] = numbersTwo[j += 1]
		
		while (i < len(numbersOne)):
			mergedArray[k += 1] = numbersOne[i += 1]
	
		while (j < len(numbersTwo)):
			mergedArray[k += 1] = numbersTwo[j += 1]

	return merged_array


print(merge_two_array([1,3,5], [2,4,6]))