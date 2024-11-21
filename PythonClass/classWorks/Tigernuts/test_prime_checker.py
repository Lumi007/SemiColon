from unittest import TestCase
import primechecker


class TestPrimeCheckerFunction(TestCase):
	def test_that_function_exist(self):
		primechecker.prime_checker(7)

	def that_function_works_correctly(self):
		actual = primechecker.prime_checker(7)
		expected = True
		self.assertEqual(actual, expected)

	def that_function_raise_error_for_non_int(self):
		self.assertRaises(TypeError, primechecker.prime_checker, "Rose")