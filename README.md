Project 1 - Math Helper

Author
Benjamin Bever  

---

Description:
This program is an interactive Math Helper tool that presents a menu of math-related options.  
The user can perform addition, subtraction, multiplication, division, check odd/even numbers, or choose from other calculations such as:
- Area of a rectangle
- Perimeter of a rectangle
- Simple interest
- GPA calculation  

The menu repeats until the user chooses to exit.

---

Purpose:
This project was created to practice:
- Using `if` statements and loops
- Reading user input with `Scanner`
- Performing arithmetic operations
- Building menu-driven programs

---

How It Works:
1. Displays a main menu with options:
   - A: Addition
   - B: Subtraction
   - C: Multiplication
   - D: Division
   - E: Odd/Even number listing
   - F: Other Calculations (area, perimeter, interest, GPA)
   - X: Exit
2. The user chooses an option and provides necessary input.
3. The program performs the calculation and displays the result.
4. Returns to the menu until the user selects **X** to quit.

---

Input:
- Menu choice (`A`–`F`, `X` to exit)
- Numbers required for the chosen operation
- For **Other Calculations**, a sub-menu choice (1–4) is provided

Output:
- Result of the chosen math operation
- Lists of odd and even numbers for a given range
- Messages for invalid inputs or errors (like division by zero)

---

Notes:
- Input is case-insensitive for menu choices.
- Division by zero is handled with an error message.
- Loops until the user explicitly chooses to exit.
