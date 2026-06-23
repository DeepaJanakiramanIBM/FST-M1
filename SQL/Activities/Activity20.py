import pandas as pd

dataframe =pd.read_excel("sample2.xlsx")


print (dataframe)

print("Number of rows and columns:", dataframe.shape)
	
print("Emails: ", dataframe['Email'])

print("Sorted Data:")
print(dataframe.sort_values('FirstName'))
 
