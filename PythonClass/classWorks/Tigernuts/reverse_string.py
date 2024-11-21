def reverse_string(phrase):
	reversed_string = ""
	for char in phrase:
		reversed_string = char + reversed_string
	return reversed_string

print(reverse_string("hello"))