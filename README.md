# Hotel Management System - CSE Project
**VIT Bhopal University**  
**Course:** Computer Science and Engineering  
**Submitted To:** Dr. Vipin Jain  
**Student Name:** Rahul Priyadarshi  
**Registration Number:** 25BAI11101  
**Academic Year:** 2026-2027
## Overview

The **Hotel Management System** is a Java console application for managing basic hotel room and guest booking operations.
The system allows users to view rooms, book a room, display bookings, cancel bookings, print booking details, search for guests, modify bookings, view statistics, and run basic tests.
The project uses multiple Java classes so that different responsibilities are separated. It is designed as an academic project to demonstrate Java, Object-Oriented Programming, validation, collections, error handling, and testing.
## Project Objectives

- Develop a hotel management application using Java.
- Apply Object-Oriented Programming concepts.
- Manage room and guest information.
- Check room availability before booking.
- Generate booking IDs automatically.
- Calculate room bills and tax.
- Support booking cancellation and modification.
- Search for guests and display bookings.
- Validate user input.
- Include basic testing.
- Maintain a clean project structure.
## Features

### 1. Room Management
The system stores room number, room type, price per night, and booking status.
### 2. Guest Management
Guest name, age, gender, and phone number are stored with the booking.
### 3. Room Booking
The user enters guest details, selects an available room, and enters the number of nights.
### 4. Booking ID
A booking ID is generated in the format `HTL + six digits`.
### 5. Bill Calculation
The room charge is calculated as:
```text
Room Price × Number of Nights
```
A 12% tax is added to the room charge.
### 6. Cancellation
A booking can be cancelled using its booking ID and the room becomes available again.
### 7. Guest Search
Bookings can be searched using the guest name.
### 8. Booking Modification
The number of nights can be changed and the bill is recalculated.
### 9. Statistics
The system displays total rooms, booked rooms, available rooms, and current revenue.
### 10. Testing
`TestModule.java` checks billing and validation functions.
## Technical Stack

| Component | Details |
|---|---|
| Language | Java |
| Programming Style | Object-Oriented Programming |
| Interface | Console / Command Prompt |
| Data Storage | In-memory |
| Collection | ArrayList |
| Validation | Validator class |
| Testing | TestModule |
| Version Control | Git / GitHub |
| Package | `hotelmanagement` |
No external libraries are required.
## System Architecture

```text
                 Main.java
                    |
          +---------+---------+
          |                   |
          v                   v
   BookingManager         Validator
          |
     +----+----+--------+
     |         |        |
     v         v        v
   Guest     Room    Booking
                       |
                       v
                BillCalculator
       Hotel ----> Room Management
       Statistics -> Hotel Statistics
```
`Main.java` handles the menu and user interaction. `BookingManager` handles booking operations, while the other classes perform specific tasks.
## Project Structure

```text
Hotel-Management-System-Java/
├── .gitignore
├── README.md
├── statement.md
└── src/
    └── hotelmanagement/
        ├── Main.java
        ├── Guest.java
        ├── Room.java
        ├── Hotel.java
        ├── Booking.java
        ├── BookingManager.java
        ├── BillCalculator.java
        ├── Validator.java
        ├── BookingIdGenerator.java
        ├── Statistics.java
        └── TestModule.java
```
All Java files use the `hotelmanagement` package.
## Class Description

### Guest.java
Stores guest name, age, gender, and phone number.
### Room.java
Stores room number, type, price, and booking status.
### Hotel.java
Maintains the list of rooms and provides room searching and display.
### Booking.java
Stores booking ID, guest, room, number of nights, and total amount.
### BookingManager.java
Handles booking, cancellation, search, display, and modification.
### BillCalculator.java
Calculates room charges, tax, and final amount.
### Validator.java
Checks guest details and number of nights.
### BookingIdGenerator.java
Generates a booking ID automatically.
### Statistics.java
Displays room and revenue statistics.
### TestModule.java
Runs basic tests.
### Main.java
Starts the application and displays the main menu.
## Main Menu

```text
===== HOTEL MANAGEMENT SYSTEM =====
1. Display Rooms
2. Book a Room
3. Display Bookings
4. Cancel Booking
5. Print Booking
6. Search Guest
7. Modify Booking
8. Hotel Statistics
9. Run Tests
10. Exit
Enter your choice:
```
## Working of the System

### Display Rooms
Option 1 displays all predefined rooms with their type, price, and status.
### Book a Room
Option 2 takes guest details, validates them, checks the selected room, calculates the bill, generates a booking ID, and saves the booking.
### Display Bookings
Option 3 displays all current bookings.
### Cancel Booking
Option 4 finds a booking using its ID, removes it, and makes the room available again.
### Print Booking
Option 5 displays the details of a selected booking.
### Search Guest
Option 6 searches current bookings by guest name.
### Modify Booking
Option 7 changes the number of nights and recalculates the total bill.
### Hotel Statistics
Option 8 displays current room and revenue information.
### Run Tests
Option 9 runs the test module.
### Exit
Option 10 closes the application.
## Booking Flow

```text
Enter Guest Details
        |
        v
Validate Input
        |
        v
Enter Room Number
        |
        v
Check Availability
        |
        v
Enter Number of Nights
        |
        v
Calculate Bill
        |
        v
Generate Booking ID
        |
        v
Save Booking
        |
        v
Display Confirmation
```
## Pseudocode

### Book Room
```text
ALGORITHM bookRoom(guest, roomNumber, nights)
    room ← find room
    IF room does not exist
        PRINT "Room not found"
        RETURN
    END IF
    IF room is booked
        PRINT "Room is already booked"
        RETURN
    END IF
    validate nights
    total ← calculate total bill
    id ← generate booking ID
    mark room as booked
    create booking
    save booking
    display confirmation
END ALGORITHM
```
### Bill Calculation
```text
roomBill ← room price × nights
tax ← roomBill × 0.12
total ← roomBill + tax
RETURN total
```
### Cancellation
```text
booking ← find booking
IF booking exists
    mark room available
    remove booking
ELSE
    PRINT "Booking not found"
END IF
```
## Input Validation

The `Validator` class checks important input values.
- Guest name must not be empty.
- Age must be between 1 and 100.
- Phone number must contain 10 digits.
- Number of nights must be between 1 and 30.
- A room must exist before it can be booked.
- A room cannot be booked if it is already booked.
## Testing

The project contains a separate `TestModule.java`.
The tests check:
| Test | Expected |
|---|---|
| Room bill for ₹1500 × 2 | ₹3000 |
| Tax on ₹1000 | ₹120 |
| Valid age 25 | PASS |
| Invalid age 150 | PASS |
| Valid 10-digit phone | PASS |
| Invalid phone | PASS |
Expected output:
```text
[PASS] Room bill for 2 nights
[PASS] Tax calculation
[PASS] Valid age
[PASS] Invalid age
[PASS] Valid phone
[PASS] Invalid phone
Tests Passed: 6
Tests Failed: 0
```
## Error Handling

The application handles common errors such as:
- Invalid menu choices.
- Invalid numeric input.
- Empty guest name.
- Invalid age.
- Invalid phone number.
- Invalid number of nights.
- Room not found.
- Already booked room.
- Booking not found.
Invalid numeric input is handled using exception handling so that the program does not stop unexpectedly.
## How to Run

Open CMD in the project folder.
### Compile
```cmd
javac -d out src\hotelmanagement\*.java
```
### Run
```cmd
java -cp out hotelmanagement.Main
```
Whenever Java source code is changed, compile it again before running.
The `out` folder contains compiled files and should not be uploaded to GitHub.
## Advantages

- Simple menu-driven interface.
