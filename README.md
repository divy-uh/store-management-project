# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](uml.png)

## Description

Write a description of your project here. Include what your store you made, and why you chose this topic. In your description, include as many vocab words from our class to explain how you represented the item/service from your store. If you have user input, explain how the user will interact with your store such as which questions are prompted to the user, what response is your program expecting, and how that is used to output information for your store in the console.

For my project, I created a Taco Bell store management system using object oriented programming concepts like classes, inheritance, and encapsulation. The super class, TacoBell, represents a general product with instance variables for name, calories, and price. Two subclasses, Burrito and Water, each extend the superclass and add unique attributes, hasMeat and salsa for Burrito, and bottled and size for Water. 

I chose Taco Bell because it's my favorite restaurant, and I wanted to represent foods I actually love while showing inheritance in code. In the StoreRunner class, multiple objects are created to show how data is stored and displayed. The program could also include user input using the Scanner class, prompting the user for details like food name, calorie count, or size, and then outputting a customized menu item in the console, simulating a order from Taco Bell. 