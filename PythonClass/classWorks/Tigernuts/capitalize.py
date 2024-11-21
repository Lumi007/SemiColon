def capitalize_first(phrases:list):
	capitalized_array =[]
	for phrase in phrases:
		capitalized_array.append(phrase.capitalize())
	return capitalized_array


print(capitalize_first(["olumide","daniel","fakorede"]))