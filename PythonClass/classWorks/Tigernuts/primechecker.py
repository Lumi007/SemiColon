def prime_checker(number):
	if number // number == 1 and number % 2 or number % 3 == 1:
		return True
	else:
		return False

print(prime_checker(7))
print(prime_checker(8))


	