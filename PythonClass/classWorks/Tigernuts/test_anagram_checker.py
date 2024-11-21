from unittest import TestCase
import anagramchecker


class TestAnagramCheckerFunction(TestCase):
	def test_that_function_exist(self):
		anagramchecker.anagram_checker("listen","silent")


	def test_that_function_return_correct_value(self):
		actual = anagramchecker.anagram_checker("listen","silent")
		expected = True
		self.assertEqual(actual, expected)

	def test_that_raises_error_for_non_string(self):
		self.assertRaises(TypeError, anagramchecker.anagram_checker, 123,)