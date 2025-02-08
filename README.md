![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Object_Oriented_Programming-FF6F00?style=for-the-badge&logo=java&logoColor=white)
![CLI](https://img.shields.io/badge/CLI-Console_Application-4EAA25?style=for-the-badge&logo=gnu-bash&logoColor=white)
---

# Cinema Room Manager

A simple Kotlin-based cinema room management system that allows users to view the seating arrangement, buy tickets, and check statistics like the number of tickets sold, current income, and total possible income.

## Features

- **Show the seats**: Displays the current seating arrangement of the cinema.
- **Buy a ticket**: Allows users to buy a ticket for a specific seat, with dynamic ticket pricing based on the cinema size.
- **Statistics**: Shows the number of purchased tickets, percentage of seats sold, current income, and total possible income.
- **Exit**: Allows the user to exit the program.

## How to Use

1. **Run the program**: Launch the Kotlin application.
2. **Choose an option**:
   - **1**: Show the seating arrangement.
   - **2**: Buy a ticket.
   - **3**: View statistics (purchased tickets, percentage sold, current and total income).
   - **0**: Exit the program.

### Example Interaction:

```plaintext
Menu:
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit

Enter the number of rows:
5
Enter the number of seats in each row:
5
```

After selecting an option, the program will respond accordingly.

## How It Works

- The cinema room is represented as a **2D array** with seats marked as "S" (available) or "B" (booked).
- The program dynamically calculates the total income based on the number of seats in the cinema.
- Ticket prices are set based on the size of the cinema:
  - **$10** for the front half of the cinema or for small cinemas (60 seats or less).
  - **$8** for the back half of the cinema.
- Users can interact with the program by choosing from the menu options to view available seats, purchase tickets, or see statistics.

---
