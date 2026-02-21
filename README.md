# Wayang Elektronik - Automation Testing

## About
This repository contains automated test scripts for the Wayang Elektronik Sales & Inventory System.
The tests are created using Katalon Studio to validate core features such as login, product management, sales data recording, and report generation.

This project serves as part of my learning process and portfolio for Junior Quality Assurance / QA Automation roles.


## Tools
- Katalon Studio
- Selenium (via Katalon)
- Groovy
- XAMPP (Local server environment)
- Git & GitHub

## Test Coverage

This project includes test cases covering:
- Login & Logout
- Product Management (Add, Edit, Delete, View)
- Sales Data Recording
- Stock Transfer Between Stores
- Sales Reports
- Revenue Calculation

## Documentation

📂 **[Full Portfolio Folder (Google Drive)](https://drive.google.com/drive/folders/1i6knuoiktq5J7yIIVOLdpra1wyKbxwiD?usp=drive_link)**

*(Includes: Project Overview, Bug Reports, Issue Screenshots)*

📊 **[View Complete Test Cases (Google Sheets)](https://docs.google.com/spreadsheets/d/1mQqKiFXlSC_fhGgEZ3IKQZuxo-E-1pcmBO3vdUuRdb8/edit?usp=sharing)**

*The spreadsheet contains detailed test documentation for different user roles (Owner, Admin 1-3).*

📄 **[Test Plan](./docs/test-plan.md)** - Testing approach and methodology

*Individual CSV files are also available in the [docs](./docs) folder.*

## Project Structure
```
Include/
Object Repository/
Profiles/
Scripts/
Test Cases/
Test Suites/
docs/
  ├── Manual Test Case - Test Case Owner.csv
  ├── Manual Test Case - Test Case Admin 1.csv
  ├── Manual Test Case - Test Case Admin 2.csv
  ├── Manual Test Case - Test Case Admin 3.csv
  └── test-plan.md
```


## How to Run
1. Start XAMPP (Apache & MySQL)
2. Run the Wayang Elektronik Laravel application
3. Install Katalon Studio
4. Clone this repository:
   ```bash
   git clone https://github.com/dikadzikrii/wayang-elektronik-automation.git
   ```
5. Open the project in Katalon Studio
6. Run any Test Suite

## Execution Notes
This automation project is designed to run locally using Katalon Studio.
The application under test is a Laravel-based system developed as a final project (TA). 
The system runs in a local development environment using XAMPP (Apache & MySQL).

