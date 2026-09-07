import pytest
from calculator import sum_numbers, difference, product, quotient


def test_sum_of_two_numbers():
    assert sum_numbers(10, 5) == 15


def test_difference_of_two_numbers():
    assert difference(10, 5) == 5


def test_product_of_two_numbers():
    assert product(10, 5) == 50


def test_quotient_of_two_numbers():
    assert quotient(10, 5) == 2