# Java Swing Currency Converter

## Project Overview
A Java Swing-based Currency Converter GUI that enables real-time currency conversion across 35 different currencies using the exchangeRatesAPI.io service. The application provides a user-friendly interface for converting Euros to various global currencies.

## Features
- Real-time currency conversion
- Support for 35 different currencies
- Simple and intuitive Swing-based GUI
- Uses exchangeRatesAPI.io for up-to-date exchange rates

## Prerequisites
- Java Development Kit (JDK)
- Maven
- ExchangeRates API key

## Setup Instructions

### 1. API Key Configuration
1. Sign up for a free API key at [exchangeRatesAPI.io](https://exchangeratesapi.io/)
2. Create a `.env` file in the project root directory
3. Add your API key to the `.env` file:
   ```
   EXCHANGE_RATES_API_KEY=your_api_key_here
   ```

### 2. Running the Application

#### Using Maven
```bash
# Navigate to the project directory
cd currency-app

# Run the application
mvn javafx:run
```

## How to Use
1. Once you run mvn javafx:run, your should see this:
  ![Alt text](https://github.com/Crash105/CODSOFT/blob/main/Screenshot%20(291).png?raw=true)
2. Enter the amount in Euros you want to convert in the text box
3. Select the target currency from the dropdown menu
4. Click the "Submit" button. 
5. View the conversion result below the submit button. It should look like this
 ![Alt text](https://github.com/Crash105/CODSOFT/blob/main/Screenshot%20(292).png?raw=true)

### Example
- Input: 120 EUR
- Selected Currency: USD
- Result: Conversion: 120 EUR is equal to 126.13 USD

## Technical Details
- **Base Currency**: Euro (EUR)
- **API**: [exchangeRatesAPI.io](https://exchangeratesapi.io/)
- **Note**: The free version of the API only allows Euro as the base currency

## Limitations
- Requires an active internet connection
- Conversion rates are updated based on the API's refresh frequency
- Limited to Euro as the base currency in the free API version

## Dependencies
- Java Swing
- Maven
- ExchangeRates API

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Acknowledgments
- [exchangeRatesAPI.io](https://exchangeratesapi.io/) for providing exchange rate data
- For Ezema for the opensource code that connects the exchangeratesapi to the java application
- Repository I forked from: https://github.com/Ezema/Java-Currency-Converter-Exchange-Rates-API
