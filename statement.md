# Hotel Management System – CSE Project

**Institution:** VIT Bhopal University  
**Department:** Computer Science and Engineering  
**Student Name:** Rahul Priyadarshi  
**Registration Number:** 25BAI11101  
**Submitted To:** Dr. Vipin Jain  
**Course:** CSE Project  
**Academic Year:** 2026-2027  

---

## 1. Project Title

**Hotel Management System: A Java-Based Console Application for Room and Booking Management**  

---

## 2. Introduction

The Hotel Management System is a Java console application developed to handle basic hotel management activities. The system allows a user to view rooms, book a room, cancel a booking, search for a guest, modify a booking, and view booking details.

The project is divided into different Java classes so that each class handles a particular part of the system. This makes the program easier to understand and maintain.

---

## 3. Problem Statement

Managing hotel rooms and guest bookings manually can become difficult when the number of bookings increases. It can also lead to mistakes while checking room availability, calculating bills, or maintaining guest information.

This project provides a simple computerized solution for managing these basic hotel operations through a menu-driven Java application.

---

## 4. Objectives

The main objectives of the project are:

- To create a basic hotel management system using Java.
- To display available and booked rooms.
- To allow users to book and cancel rooms.
- To store guest and booking information.
- To calculate the total room bill.
- To generate a booking ID.
- To search and modify bookings.
- To validate important user inputs.
- To provide basic hotel statistics.
- To test important functions of the application.

---

## 5. Scope of the Project

The project covers the basic operations of a small hotel booking system.

The application can:

- Display all rooms and their status.
- Book an available room.
- Cancel an existing booking.
- Display all current bookings.
- Print booking details.
- Search for a guest.
- Change the number of nights in a booking.
- Calculate room charges and tax.
- Display basic hotel statistics.
- Run simple validation and calculation tests.

The current version is a console-based academic project. It does not use a database, online payment system, login system, or real hotel API.

---

## 6. Functional Requirements

### 6.1 Room Management

The system displays room numbers, room types, prices, and whether each room is available or booked.

### 6.2 Room Booking

The user enters guest details, selects an available room, and enters the number of nights. The system checks the information and creates the booking.

### 6.3 Booking Cancellation

The user can enter a booking ID to cancel a booking. Once cancelled, the room becomes available again.

### 6.4 Guest Search

The user can search for a guest by name and view the related booking.

### 6.5 Booking Modification

The number of nights for an existing booking can be changed. The bill is then calculated again.  

### 6.6 Bill Calculation

The system calculates the room cost according to the room price and number of nights. A 12% tax is also added to the room bill.

### 6.7 Booking ID

A booking ID is generated automatically in the format:

`HTL + six digits`

---

## 7. Non-Functional Requirements

### 7.1 Usability

The program uses a simple menu so the user can easily select an operation.

### 7.2 Reliability

The system checks room availability before completing a booking.

### 7.3 Maintainability

Different functions are divided into separate classes, making the code easier to update.

### 7.4 Error Handling

The program checks invalid numbers and important user inputs and displays an error message when required.

### 7.5 Resource Efficiency

The application is a lightweight console program and does not require external libraries.

---

## 8. System Design

The basic workflow is:

```text
Start
  |
  v
Display Main Menu
  |
  +--> Display Rooms
  |
  +--> Book Room
  |       |
  |       +--> Enter Guest Details
  |       +--> Validate Details
  |       +--> Check Room
  |       +--> Calculate Bill
  |       +--> Generate Booking ID
  |       +--> Save Booking
  |
  +--> Display Bookings
  |
  +--> Cancel Booking
  |
  +--> Print Booking
  |
  +--> Search Guest
  |
  +--> Modify Booking
  |
  +--> Hotel Statistics
  |
  +--> Run Tests
  |
  +--> Exit
  |
  v
End
```

---

## 9. Project Structure

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

---

## 10. Class Description

### Guest.java

Stores guest details such as name, age, gender, and phone number.

### Room.java

Stores room number, room type, price per night, and booking status.

### Hotel.java

Maintains the list of rooms and provides room searching and display functions.

### Booking.java

Stores the booking ID, guest, room, number of nights, and total bill.

### BookingManager.java

Handles booking, cancellation, searching, displaying, and modifying bookings.

### BillCalculator.java

Calculates the room bill, tax, and final amount.

### Validator.java

Checks guest name, age, phone number, and number of nights.

### BookingIdGenerator.java

Generates a booking ID automatically.

### Statistics.java

Displays total rooms, booked rooms, available rooms, and total revenue.

### TestModule.java

Runs basic tests for bill calculation, tax calculation, age validation, and phone validation.

### Main.java

Contains the main menu and controls the interaction between the user and the other classes.

---

## 11. Technical Implementation

The project is written in Java and uses basic Object-Oriented Programming concepts.

The main concepts used are:

- Classes and objects
- Encapsulation
- Constructors
- Methods
- Lists
- Loops
- Conditional statements
- Input validation
- Exception handling
- Modular programming

All classes are placed inside the `hotelmanagement` package.

---

## 12. Booking Process

The booking process works as follows:

1. The user selects **Book a Room**.
2. Guest details are entered.
3. The system validates the details.
4. The user enters the room number.
5. The system checks whether the room exists and is available.
6. The number of nights is entered.
7. The room bill and tax are calculated.
8. A booking ID is generated.
9. The room is marked as booked.
10. Booking details are displayed.

---

## 13. Testing

A separate `TestModule.java` is included.

The current tests check:

| Test | Expected Result |
|---|---|
| Room bill for 2 nights at ₹1500 | ₹3000 |
| Tax on ₹1000 | ₹120 |
| Valid age 25 | PASS |
| Invalid age 150 | PASS |
| Valid phone number | PASS |
| Invalid phone number | PASS |

The test option is available from the main menu.

---

## 14. Error Handling

The program handles common errors such as:

- Invalid menu choice.
- Entering text where a number is expected.
- Invalid age.
- Invalid phone number.
- Invalid number of nights.
- Room number that does not exist.
- Trying to book an already booked room.
- Searching for a booking that does not exist.

---

## 15. Methodology

### Phase 1: Requirement Analysis

The basic hotel booking requirements were identified, including room management, guest information, booking, cancellation, and bill calculation.

### Phase 2: Design

The program was divided into different classes based on their responsibilities.

### Phase 3: Implementation

The classes for guests, rooms, bookings, billing, validation, booking management, statistics, and testing were implemented.

### Phase 4: Validation

Input checks were added for important fields and room availability.

### Phase 5: Testing

The calculation and validation functions were tested using `TestModule.java`.

### Phase 6: Version Control

The project can be maintained and submitted using GitHub with a proper folder and package structure.

---

## 16. Expected Outcomes

The project demonstrates how Java can be used to build a simple real-world management application.

After completing the project, the main concepts demonstrated are:

- Object-Oriented Programming.
- Modular Java programming.
- Data handling using classes and lists.
- Input validation.
- Error handling.
- Basic software testing.
- Menu-driven application development.

---

## 17. Limitations

The current project has some limitations:

- It does not use a database.
- Booking information is stored only while the program is running.
- There is no online payment system.
- There is no login or authentication.
- It does not have a graphical interface.
- It is not connected to a real hotel system.

---

## 18. Future Enhancements

The project can be improved by adding:

- MySQL or another database.
- User login and authentication.
- Online payment.
- Multiple hotels and branches.
- More room categories.
- Food and service billing.
- Check-in and check-out dates.
- A graphical or web interface.
- Permanent booking history.

---

## 19. Learning from the Project

This project provides practical experience in Java programming and Object-Oriented Programming.

While working on it, I learned how to divide a program into multiple classes and how these classes can work together. I also learned about input validation, exception handling, collections, testing, and organizing a project for GitHub.

---

## 20. Deliverables

The project contains:

1. Java source code.
2. `README.md`.
3. `statement.md`.
4. `.gitignore`.
5. Multiple Java classes.
6. Test module.
7. Project folder and package structure.

---

## 21. Conclusion

The Hotel Management System is a simple Java console application that manages basic hotel room and booking operations.

It allows users to view rooms, make bookings, cancel bookings, search guests, modify bookings, calculate bills, and view statistics.

The project demonstrates important Java concepts such as classes, objects, methods, lists, validation, exception handling, and modular programming. It can later be expanded into a larger hotel management application by adding a database, login system, payment features, and a graphical or web interface.

---

## Author 

**Rahul Priyadarshi**  
**Registration Number:** 25BAI11101  
**B.Tech CSE (AIML)**  
**VIT Bhopal University**  
**Submitted To:** Dr. Vipin Jain
