
user_input = input("Enter numbers separated by space: ")

numbers = list(map(int, user_input.split()))

if numbers[0] == numbers[-1]:
   print("true")
else:
   print("false")   


