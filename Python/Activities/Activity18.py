import pandas as pd

dataframe =pd.read_csv("example.csv")

print("Full data: ")
print (dataframe)

	
print("Usernames:")
print(dataframe["Usernames"])
	
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Password"][1])
 

print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))
 

print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Password', ascending=False))

