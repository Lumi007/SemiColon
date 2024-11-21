from unittest import TestCase
import numofvowels



class TestNumberOfVowelFunction(TestCase):
	def test_that_function_exists(self):
		numofvowels.number_of_vowels("Python is sweet")

	def test_that_function_returns_correct_value(self):
		actual = numofvowels.number_of_vowels("Python is sweet")
		expected = 4
		self.assertEqual(actual, expected)
	
	def test_that_function_work_for_non_string(self):
		self.assertRaises(TypeError,numofvowels.number_of_vowels, 123) 
		
		