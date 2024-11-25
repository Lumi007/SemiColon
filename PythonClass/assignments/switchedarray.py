def switched_array(numbers:list, element):
	for number in range(len(numbers)):
		while numbers[number] != element+1:
			numbers.append(numbers.pop(number));
		return numbers
	

def split_array(numbers:list):
	element = len(numbers) // 2
	splited_array = [numbers[:element], numbers[element:]]
	return splited_array
	
	

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

print(split_array([1,2,3,4,5,6]))



