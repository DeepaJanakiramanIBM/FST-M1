# Ask user for number of Fibonacci terms
n = int(input("How many Fibonacci numbers to generate? "))

# First two numbers
a, b = 1, 1


print("Fibonacci sequence:")
for i in range(n):
    print(a, end=" ")
    a, b = b, a + b