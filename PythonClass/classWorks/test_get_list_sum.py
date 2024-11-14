from unittest import TestCase
import getlistsum


class TestGetListSumFunction(TestCase):
	def test_that_get_list_function_exist(self):
		getlistsum.get_sum([1,2,3])

	def test_that_function_return_correct_value(self):
		actual = getlistsum.get_sum([1,2,3])
		expected = 6
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_negative(self):
		actual = getlistsum.get_sum([1,-2,3])
		expected = 2
		self.assertEqual(actual, expected)

	def test_that_function_raises_error_for_invalid_input(self):
		self.assertRaises(TypeError, getlistsum.get_sum, "Rose")

	def test_that_function_works_for_float(self):
		actual = getlistsum.get_sum([1.1,2.2,3.3])
		expected = 6.6
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_zero_input(self):
		actual = getlistsum.get_sum([0,0,0])
		expected = 0
		self.assertEqual(actual, expected)