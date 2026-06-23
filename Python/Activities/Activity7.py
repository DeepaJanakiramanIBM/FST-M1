
user_input = input("Enter numbers separated by space: ")

numbers = list(map(int, user_input.split()))


total = sum(numbers)


print("Sum of list elements:", total)
