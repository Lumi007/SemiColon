from unittest import TestCase
import vestcalculator


class TestVestCalculatorFunction(TestCase):
	def test_that_vest_calculator_function_exist(self):
		vestcalculator.future_investment_amount(10000, 12, 25)

	def test_that_function_return_correct_value(self):
		actual = vestcalculator.future_investment_amount(10000, 12, 25)
		expected = 12663.03
		self.assertEqual(actual, expected)
	
	def test_that_function_works_for_large_investment_amount(self):
		actual = vestcalculator.future_investment_amount(100000000, 12, 25)
		expected = 126630274.19
		self.assertEqual(actual, expected)

	def test_that_function_raises_error_for_invalid_input(self):
		self.assertRaises(TypeError, vestcalculator.future_investment_amount, "Rose",12, 3)
	
	def test_that_function_raises_error_for_negative_input(self):
		self.assertRaises(ValueError, vestcalculator.future_investment_amount, -10000, 12, -20)

	def test_that_function_works_for_float(self):
		actual = actual = vestcalculator.future_investment_amount(10000.50, 12.1, 25.5)
		expected = 12747.75
		self.assertEqual(actual, expected)
	
	def test_that_function_returns_zero_for_zero_input(self):
		actual = vestcalculator.future_investment_amount(0, 12.1, 25.5)
		expected = 0