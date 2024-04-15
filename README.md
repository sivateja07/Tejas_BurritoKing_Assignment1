# Tejas_BurritoKing_Assignment1
# Summary
A digital simulation of a restaurant's daily activities is provided by the Burrito King Restaurant Program. Customers may easily order a range of delicious foods, like burritos, fries, and sodas, with this Java application. The application also gives restaurant managers the power to easily create comprehensive sales data and update prices on the fly. Using the strong principles of object-oriented programming, the application gracefully divides its features into discrete classes, each with a unique function.

# Functionalities 
Ordering: Customers can choose to manually select individual dishes or get a handy meal package that comes with a delicious burrito, fries, and a Coke at enticingly low prices.
Price Update : Restaurant management may easily adjust menu prices to reflect changes in the market or special deals.
Generating Sales Reports: The application streamlines record-keeping by automatically creating thorough sales reports that offer information on both the performance of each individual item and overall income.

# Class Design:
FoodItem: Serves as the blueprint for any food item on the menu, encapsulating crucial details such as name and price.
Meal: A specialized class tailored to represent a complete meal offering, comprising a burrito, fries, and a soda, complete with discounted pricing for added value.
Restaurant: The heart of the application, housing all core functionalities including order processing, price management, and report generation.

# Introduction to Class Design:

The class design of the Burrito King Restaurant Program is the fundamental principles of object-oriented programming (OOP), ensuring clarity, flexibility, and ease of maintenance. Within the program, three key classes play pivotal roles, each contributing to the seamless operation of the restaurant management system:

# FoodItem Class:
The FoodItem class serves as the cornerstone of the program, embodying the characteristics and behaviors of individual menu items available at the restaurant.
Each instance of the FoodItem class represents a specific menu item, characterized by its unique name and corresponding price.
By encapsulating essential attributes and functionalities, the FoodItem class facilitates streamlined order processing and menu management operations.
# Meal Class:
Introducing a specialized abstraction, the Meal class embodies the concept of bundled meal packages offered by the restaurant.
Designed to encompass a combination of a burrito, fries, and a soda at discounted rates, the Meal class enhances the program's versatility and user experience.
By consolidating meal-specific logic and pricing details, the Meal class promotes code clarity and fosters code reuse, contributing to the overall robustness of the system.
# Restaurant Class:
Positioned at the core of the program, the Restaurant class serves as the central hub for orchestrating various aspects of restaurant management.
From processing customer orders and managing menu items to updating prices and generating sales reports, the Restaurant class embodies the holistic functionality of the system.
By modularizing distinct operational components into coherent methods and properties, the Restaurant class ensures maintainability and scalability, empowering developers to extend and enhance the program effortlessly.


# How to RUN
Begin by compiling the Java files using a Java compiler. Execute the command javac BurritoKing.java Restaurant.java FoodItem.java Meal.java.
Once compilation is complete, launch the program by invoking the Java interpreter with the command java BurritoKing.

# Usage
Upon initiation, the program will present users with a clear and intuitive menu interface.
Navigate through the menu by selecting options corresponding to the desired action (e.g., ordering, updating prices, generating reports).
Follow the on-screen prompts to seamlessly interact with the program and fulfill various tasks.

$ javac BurritoKing.java Restaurant.java FoodItem.java Meal.java
$ java BurritoKing
