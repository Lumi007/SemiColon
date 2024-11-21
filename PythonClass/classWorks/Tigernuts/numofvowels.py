def number_of_vowels(phrase)->int:
	count = 0
	if type(phrase) in [int,float]:
		raise TypeError
	for char in phrase:
		if char in "AEIOUaeiou":
			count += 1
	return count



print(number_of_vowels("Python is sweet"))
