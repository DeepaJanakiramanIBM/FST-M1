import pandas as pd

data = {

    "Usernames":["admin","Charles","Deku"],
    "Password":["password", "Charl13","AllMight"]
}

dataframe = pd.DataFrame(data)

print(dataframe)

dataframe.to_csv("example.csv", index=False)