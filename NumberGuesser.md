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

### Scoring System
- **Round Points**: 4 points per round
- **Attempt Points**: 2 points per remaining attempt
- **Scoring Calculation**:
  - Successfully guessing the number reduces round and allows you to earn points
  - The Formula for your Score: (4 * number of rounds) + (2 * number of attempts)

### Game Ending Conditions
- 
- Player completes or fails all 3 rounds
- Message "You are out of rounds" displays when no rounds remain

## Example Gameplay

```
Round 1 (Attempts: 4)
Guess a number between 1-100: 50
Your Guess Is Too High
Remaining Attempts: 3

Guess a number between 1-100: 25
Your Guess Is Too Low
Remaining Attempts: 2

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
