from unittest import TestCase
import mergearray



class TestMergeArrayFunction(TestCase):
	def test_that_function_exist(self):
		mergearray.merge_array([1,2,3],[3,5,6])


	def test_that_function_returns_correct_value(self):
		actual = mergearray.merge_array([1,3,5],[2,4,6])
		expected = [1,2,3,4,5,6]
		self.assertEqual(actual, expected)

	def test_that_function_works_for_negatives(self):
		actual = mergearray.merge_array([1,3,5],[-2,4,6])
		expected = [-2,1,3,4,5,6]
		self.assertEqual(actual, expected)

	def test_that_function_works_for_float(self):
		actual = mergearray.merge_array([1,3.3,5],[-2,4,6])
		expected = [-2,1,3.3,4,5,6]
		self.assertEqual(actual, expected)

	def test_that_function_raises_error_for_non_type(self):
		self.assertRaises(TypeError, mergearray.merge_array, "Rose")
