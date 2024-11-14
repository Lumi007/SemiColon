
def get_sum(numbers:list)->float:
	result = 0.0
	for num in numbers:
		if type(num) in numbers not in [int, float]:
			raise ValueError
		result += num
	return result
	raise TypeError

		
print(get_sum([1,2,3]))
print(get_sum([1,2]))