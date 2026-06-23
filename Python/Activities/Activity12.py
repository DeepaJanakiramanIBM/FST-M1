
def recursive_sum(n):
   if n == 0:
      return 0
   else:
      return n + recursive_sum(n - 1)
result = recursive_sum(20)
print("Sum from 0 to 20 is:", result)

