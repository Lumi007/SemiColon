def switched_array(numbers:list, element):
	for number in range(len(numbers)):
		while numbers[number] != element:
			numbers.append(numbers.pop(number));
		return numbers
	




def get_boolean_even_odd(numbers:list):
	boolean_array = []
	for number in numbers:
		if number % 2 == 0:
			boolean_array.append(True)
		else:
			boolean_array.append(False)
	return boolean_array	
		



print(switched_array([1,2,3,4,5],3))

print(get_boolean_even_odd([1,2,3,4,5]))



