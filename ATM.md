# ATM Interface Application

## Overview
A simple Java-based ATM interface that provides basic banking functionalities, allowing users to manage their bank account through core operations like deposit, withdrawal, and balance checking.

## Features
- Account Creation
- Deposit Funds
- Withdraw Funds
- Check Account Balance

## How to Use

### Account Creation
```java
// Initialize a new ATM object
ATM atmAccount = new ATM();
```

### Core Functionalities
```java
// Deposit Money
atmAccount.deposit(amount);

// Withdraw Money
atmAccount.withdraw(amount);

// Check Current Balance
atmAccount.checkBalance();
```

## Methods
- `deposit(double amount)`: Add funds to the account
- `withdraw(double amount)`: Remove funds from the account
- `checkBalance()`: View current account balance

## Usage Example
```java
ATM myAccount = new ATM();
myAccount.deposit(500.00);
myAccount.withdraw(100.00);
System.out.println*myAccount.checkBalance()); // Returns 400.00
```
## How to Run
1. Ensure you have Java Development Kit (JDK) installed
2. Compile the Java file:
   ```
   javac atm.java
   javac bank.java
   java bank
   ```
3. Run the compiled program:
   ```
   java NumberGuesserGame

## Potential Improvements
- Add PIN authentication
- Implement transaction history
- Create multiple account support
- Add overdraft protection
- Implement interest calculation

## Technical Details
- **Language**: Java
- **Type**: Console-based Banking Interface
- **Operations**: Basic financial transactions

## Contributing
Feel free to fork and enhance the ATM interface functionality.

## License
[Specify Your License]
