## Java Classes and Object-Oriented Programming (OOP)

### Classes and Objects

In Java, a **class** is a blueprint for creating objects. An object is an instance of a class. For example, consider the class `Book`. This class can be thought of as a blueprint for what a book is and what operations can be performed on it. An actual book, like "Pride and Prejudice by Jane Austen", is an instance or an object of the `Book` class.

### Attributes and Methods

**Attributes** (also known as fields or properties) represent the data or state of an object. For the `Book` class, attributes might include `title`, `author`, and `ISBN`.

**Methods** represent the actions that can be performed on or by the object. For example, the `Book` class might have methods to `checkout` a book or `return` it.

### Constructors

A **constructor** in Java is a special method that is used to initialize objects. It's called when an object of the class is created.

### Encapsulation

**Encapsulation** is one of the fundamental principles of OOP. It means that the internal representation of an object is hidden from the outside. In Java, this is achieved using private attributes and public methods (getters and setters) to access and modify those attributes.

### Inheritance

While not directly covered in this assignment, it's worth noting that **inheritance** is a mechanism where you can create a new class based on an existing class. The new class inherits attributes and methods from the existing class.

### Literature Classes: Book and Library

The `Book` class represents individual books with attributes such as `title`, `author`, and `ISBN`. Methods in this class can manage the book's check-out status or fetch its details.

The `Library` class represents a collection of books. It can have methods to add books, remove books, or search for a book by its ISBN, ensuring an organized system for book management.

### Travel Classes: Flight and Passenger

The `Flight` class could represent an airline flight, having attributes like `flightNumber`, `destination`, and `departureTime`. It might also have methods to manage passengers or check flight status.

The `Passenger` class represents a traveler with attributes like `name`, `passportNumber`, and `ticketNumber`. Methods in this class could handle actions like checking in for a flight or choosing a seat.

### Business Classes: Employee and Department

These classes represent entities in a business environment. An `Employee` might have attributes like `name`, `id`, and `salary`. The `Department` class could represent a department in a company, having multiple employees and methods to manage them.

### Shopping Classes: Product and ShoppingCart

These classes model a simple shopping system. A `Product` has details like a name and price. A `ShoppingCart` can hold multiple products and might have methods to add or remove products and calculate the total price.
