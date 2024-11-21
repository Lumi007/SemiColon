from unittest import TestCase
import listevensum


class TestEvenSumFunction(TestCase):
	def test_that_list_even_sum_function_exist(self):
		listevensum.sum_of_list([1,2,3])

	def test_that_function_return_correct_value(self):
		actual = listevensum.sum_of_list([1,2,3,4])
		expected = 6
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_negative(self):
		actual = listevensum.sum_of_list([1,-2,3,4])
		expected = 2
		self.assertEqual(actual, expected)

	def test_that_function_raises_error_for_invalid_input(self):
		self.assertRaises(TypeError, listevensum.sum_of_list, "Rose")

	def test_that_function_works_for_float(self):
		actual = listevensum.sum_of_list([1,-2,3,4.4,6])
		expected = 4
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_zero_input(self):
		actual = listevensum.sum_of_list([0,0,0])
		expected = 0
		self.assertEqual(actual, expected)