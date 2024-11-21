def anagram_checker(phraseOne, phraseTwo):
	for char1 in sorted(phraseOne):
		for char2 in sorted(phraseTwo):
			if char1 == char2:
				return True
			else:
				return False



print(anagram_checker("listen","silent"))
			
			
		 