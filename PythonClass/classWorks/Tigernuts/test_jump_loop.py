from unittest import TestCase
import jumploop



class TestJumpLoopFunction(TestCase):
	def test_that_function_exist(self):
		jumploop.jump_loop([1,2,3,4,5])

	def test_that_function_returns_correct_value(self):
		actual = jumploop.jump_loop([1,2,3,4,5])
		expected = 60
		self.assertEqual(actual, expected)

	def test_that_function_raises_error_for_non_list(self):
		self.assertRaises(TypeError, jumploop.jump_loop, "Rose")

	
	def test_that_function_works_for_negative(self):
		actual = jumploop.jump_loop([1,2,-3,4])
		expected = 12
		self.assertEqual(actual, expected)