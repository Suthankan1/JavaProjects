# ✉️ Email Administrator — Java Projects

A lightweight collection of Java applications. This repository contains an Email Administrator app and a new Student Database App (studentdatabaseapp) that lets you enroll multiple students, record their courses and payments, and print summaries.

## Table of contents
- Email Administrator (existing)
- studentdatabaseapp (new)
- Build & Run
- Code notes & suggestions
- Author & Contact

---

# Email Administrator — Java Project

A lightweight Java application to create and manage employee email accounts. It generates company emails from a user's name and department, creates a secure random password, allows password changes, sets an alternate email, and displays the account details.

## Features
- Create email addresses from first and last name + department
- Department selection or auto-detection
- Secure random password generation (configurable length & complexity)
- Change password functionality with basic validation
- Define and store an alternate email
- Display user email account information in a clean format

## Quick Tech Details
- Language: Java (100%)
- Recommended Java: 11+

## How it works (brief)
1. Ask for user name and department (or determine department from input).
2. Compose email: firstname.lastname@{department}.company.com (falls back to company domain if none).
3. Generate a random password using letters, numbers, and symbols.
4. Allow the user to change password and set an alternate email.
5. Display the final account info.

---

# studentdatabaseapp (NEW)

Package name: `studentdatabaseapp`  
Example main class: `StudentDatabaseApp`

## Purpose
The Student Database App is a simple console program to enroll and manage multiple students during a run. It collects student information, records enrolled courses, calculates tuition per student, accepts payments, and prints a final summary including remaining balances.

## Core features added
- Prompt the user for how many students to add.
- For each student:
    - Get student name.
    - Get student year (e.g., Freshman, Sophomore, Junior, Senior, or numeric year).
    - Get courses the student is enrolling in (comma-separated or entered one-by-one).
    - Calculate course fee = number_of_courses × COURSE_FEE (COURSE_FEE is a constant in the code).
    - Accept a payment amount and calculate remaining balance (fee − payment).
- Print each student's summary: name, year, list of courses, total fee, paid amount, and balance.
- Simple input validation for numeric entries (counts, payments).

## Author & Contact
Maintainer: Suthankan1 (GitHub)  
Repository: https://github.com/Suthankan1/JavaProjects

---

