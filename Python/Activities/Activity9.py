# Input lists
list1 = [10, 4, 86, 22, 66, 93]
list2 = [11, 22, 33, 44, 55, 66]

# Get odd numbers from list1
odd_numbers = [x for x in list1 if x % 2 != 0]

# Get even numbers from list2
even_numbers = [x for x in list2 if x % 2 == 0]

# Combine both
new_list = odd_numbers + even_numbers

print("New List:", new_list)
