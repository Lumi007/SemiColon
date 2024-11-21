def anagram_checker(str1, str2):
	for char1 in sorted(str1):
		for char2 in sorted(str2):
			if char1 == char2:
				return True
			else:
				return False



print(anagram_checker("listen","silent"))
			
			
		 