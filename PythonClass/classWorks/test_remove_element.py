from unittest import TestCase
import removeelement


class TestRemoveElementFunction(TestCase):
	def test_function_exist(self):
		removeelement.remove_element([1,2,3])

	def test_that_function_return_correct_value(self):
		actual = removeelement.remove_element([1, 2, 3])
		expected = [1, 3]
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_negative(self):
		actual = removeelement.remove_element([1, -2, 3])
		expected = [1, 3]
		self.assertEqual(actual, expected)

	def test_that_function_works_for_float(self):
		actual = removeelement.remove_element([1.1, 2.2, 3.3])
		expected = [1.1, 3.3]
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_list_less_than_length_two(self):
		actual = removeelement.remove_element([1])
		expected = 0
		self.assertEqual(actual, expected)