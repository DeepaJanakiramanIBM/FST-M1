while True:
    # Get player names
    player1 = input("What is Player 1's name? ")
    player2 = input("What is Player 2's name? ")

    # Get choices
    user1_answer = input(f"{player1}, choose rock, paper or scissors: ").lower()
    user2_answer = input(f"{player2}, choose rock, paper or scissors: ").lower()

    # Game logic
    if user1_answer == user2_answer:
        print("It's a tie!")

    elif (user1_answer == "rock" and user2_answer == "scissors") or \
         (user1_answer == "scissors" and user2_answer == "paper") or \
         (user1_answer == "paper" and user2_answer == "rock"):
        print(f"{player1} wins!")

    else:
        print(f"{player2} wins!")

    # Ask if they want to play again
    play_again = input("Do you want to play again? (yes/no): ").lower()

    if play_again != "yes":
        print("Game Over!")
        break