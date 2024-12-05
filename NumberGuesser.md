# Number Guessing Game

## Game Description

Number Guessing Game is an interactive console-based Java game where players attempt to guess a randomly generated number within a specified range.

## Game Mechanics

### Objective
Guess the randomly generated number between 1 and 100 within the given attempts and rounds.

### Rules
- **Number Range**: 1-100
- **Attempts per Round**: 4 attempts
- **Total Rounds**: 3 rounds

### Gameplay
1. A random number is generated at the start of each round.
2. The player has 4 attempts to guess the correct number.
3. After each guess, the game provides feedback:
   - "Your Guess Is Too High" (if guess is higher than the number)
   - "Your Guess Is Too Low" (if guess is lower than the number)
   - "Your Guess is Correct" (if guess matches the number)


### Game Ending Conditions
- Message "You are out of rounds" displays when no rounds remain

## Example Gameplay

```
Guess a random number between 1 to 100. You will have 3 roudns and 4 attempts each to guess the number
User Enters Number 90
You are on Round:3 Attempt 3
Your Guess Is Too High

User Enters Number 20
You are on Round:3 Attempt 2
Your Guess Is Too Low


...
```

## Strategies
- Start with middle-range guesses
- Use process of elimination
- Pay attention to "Too High" or "Too Low" feedback

## Technical Details
- **Language**: Java
- **Input**: Console-based user input
- **Random Number Generation**: Using Java's random number generation
- **Game Logic**: Nested conditional statements for guess evaluation

## Potential Improvements
- Add input validation
- Create a more robust scoring system

## How to Run
1. Ensure you have Java Development Kit (JDK) installed
2. Compile the Java file:
   ```
   javac NumberGuesserGame.java
   ```
3. Run the compiled program:
   ```
   java NumberGuesserGame
   ```

## Contributing
Contributions are welcome! Feel free to:
- Fork the repository
- Create a feature branch
- Submit pull requests with improvements

## License
[Specify your license here - e.g., MIT License]
