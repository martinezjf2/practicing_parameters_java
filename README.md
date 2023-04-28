# Parameters vs. Arguments

## Learning Goals
- Understand the differences between arguments and parameters
- How to implement parameters as well as arguments
- Identify when and where can we use this concepts
- Understand the concept through a real-life analogy

### Introduction

One of the most confusing concepts that developers struggle to understand is what are arguments and what are parameters? There may be times where developers may confuse them. We will help you understand what both these concepts are and how and when to use them.

### Real-Life Analogy

Have you ever observed cones and signs indicating reserved valet parking spots at luxurious hotels? Although these cones and signs do not represent actual cars, they serve as placeholders for the upcoming parked vehicles. Similarly, in programming, parameters serve as placeholders for input values, which are like the real cars in this analogy. In Java, the input values are the actual strings that are passed as arguments when a method is called.

### Let's Backtrace

Let's go back a couple steps back to see what we remember. Lets just say we have a class that has a method called name. This method should output a string of "Hello, my name is Josh!" Here is an example of how this would look:

```
public class Person {
    public static String name() {
        return "Hello, my name is Josh!";
    }
}
```

Great! How would we be able to invoke this method? Well, we would first have to create an instance of the Main class, then call the method. For example: 

```
new_object = new Person();
new_object.name();
```

This would give us an output of "Hello, my name is Josh!" But, what if we didn't just want Josh to be used every single time we use this method. Is this method flexible for any name? Not really. We have to figure out a way to use any name instead of just hardcoding in Josh. That is where parameters come into play.

### Parameters and Arguments

As mentioned in the previous analogy, parameters serve as mere placeholders that represent any upcoming data when a method is utilized. In contrast, arguments refer to the actual values or data that are passed when a method is called. For instance, when creating a new person instance, one would want to instantiate it with an actual name, which would look like the following:

```
new_object = new Person();
new_object.name("Josh Rivera");
```

"Josh Rivera" is the argument because it is being inputted when the method is being used. When I use the method name() to this new_object, I would expect it to be "Hello, my name is Josh Rivera." To do this, we must refractor our code to use the argument. Let's adjust our method a bit:

```
public class Person {
    public static String name(String name) {
        return "Hello, my name is " + name + "!;
    }
}
```

WOOO! What is going on here? Well, lets break it down line by line. We first created a Person class. It will have a method called name. Inside of the parenthesis we see String name. This will let us know what data type will be passed in, and name will just be a representation of "Josh Rivera." Is it exactly Josh Rivera? No! It is a representation of Josh Rivera. Finally, we are giving it a return statement that will use the name placeholder, so the outcome would be "Hello, my name is Josh Rivera!"

### Instructions

This lab is a test-driven lab. You will read various methods within the class and will return a string. Read each test very carefully and check what is being expected within the tests.

### Resources:

[W3schools Java Method Parameters](https://www.w3schools.com/java/java_methods_param.asp#:~:text=Parameters%20act%20as%20variables%20inside,separate%20them%20with%20a%20comma.)

[GeeksForGeeks Java Parameters](https://www.geeksforgeeks.org/argument-vs-parameter-in-java/)