from unittest import TestCase
import dividefive


class TestDivideFiveFunction(TestCase):
	def test_that_function_exist(self):
		dividefive.divisible_by_five(60)

	def test_that_funtion_returns_correct_value(self):
		actual = dividefive.divisible_by_five(50)
		expected = 7.07
		self.assertEqual(actual,expected)
	
	def test_that_function_returns_values_for_number_not_divisible_by_5(self):
		actual = dividefive.divisible_by_five(42)
		expected = 2
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_float(self):
		actual = dividefive.divisible_by_five(7.7)
		expected = 2.7
		self.assertEqual(actual, expected)

	def test_that_function_raises_error_with_invalid_type(self):
		self.assertRaises(TypeError, dividefive.divisible_by_five, "Rose")
	
	def test_that_functon_return_zero_for_zero_input(self):
		actual = dividefive.divisible_by_five(0)
		expected = 0
		self.assertEqual(actual, expected)
		
	def test_that_function_raises_error_for_negative_input(self):
		self.assertRaises(ValueError, dividefive.divisible_by_five, -9)
		

	