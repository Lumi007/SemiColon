from unittest import TestCase
import newtestcase


class TestCubeFunction(TestCase):
	def test_that_multiply_function_exists(self):
		newtestcase.multiply_without_star(8,8)

	def test_that_multiplier_function_returns_correct_value(self):
		actual = newtestcase.multiply_without_star(8,8)
		expected = 64
		self.assertEqual(actual, expected)
		actual = newtestcase.multiply_without_star(5,6)
		expected = 30
		self.assertEqual(actual, expected)
	
	def test_that_the_multiplier_function_raises_exception_with_invalid_inpu(self):
		self.assertRaises(TypeError, newtestcase.multiply_without_star, "rose")

	def test_that_the_multiplier_function_returns_correct_values_with_float(self):
		actual = newtestcase.multiply_without_star(5.5,6)
		expected = 33
		self.assertEqual(actual, expected)
	
	def test_that_the_multiplier_function_