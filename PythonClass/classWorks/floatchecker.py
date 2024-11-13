first_number = int(input("Enter your first number: "))
second_number = int(input("Enter your first number: "))

def only_floats(first_number,second_number):
	if isinstance(first_number, float) and isinstance(second_number, float):
        	return 2
	elif isinstance(first_number, float) or isinstance(second_number, float):
        	return 1
	else:
        	return 0
	raise TypeError

print(only_floats(first_number,second_number))
print(only_floats(2.3, 5))
print(only_floats(2.3, 5.9))
print(only_floats(-2, 2.5))
		