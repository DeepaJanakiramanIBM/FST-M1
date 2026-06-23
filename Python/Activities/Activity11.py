Fruits ={
    "banana": 120,
    "apple": 230,
    "grapes": 220,
    "orange": 180,
    "litchi": 400
}

Store = input("Enter a fruit: ").lower()

if (Store in Fruits):
    print("Fruit is available")
else:
    print("Fruit is not available")
 