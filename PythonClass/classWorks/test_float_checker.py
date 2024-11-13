from unittest import TestCase
import floatchecker


class TestFloatCheckerFunction(TestCase):
	def test_that_float_checker_function_exist(self):
		floatchecker.only_floats(10, 12)

	def test_that_function_return_correct_value(self):
		actual = floatchecker.only_floats(10, 12)
		expected = 0
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_negative(self):
		actual = floatchecker.only_floats(-2, 0.5)
		expected = 1
		self.assertEqual(actual, expected)

	def test_that_function_raises_error_for_invalid_input(self):
		self.assertRaises(TypeError, floatchecker.only_floats, "Rose", 3)

	def test_that_function_works_for_float(self):
		actual = floatchecker.only_floats (2.3, 4.6)
		expected = 2
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_zero_input(self):
		actual = floatchecker.only_floats(0, 0)
		expected = 0
		self.assertEqual(actual, expected)