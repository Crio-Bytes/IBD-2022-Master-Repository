# Introduction
GUI means Graphically User Interface. Basically, GUI is a frame on which we place the buttons, labels, text fields, panels and change the background colors of these items.

These are three concepts of GUI Programming:
- AWT 
- Swing 
- Javafx 

>GUI can only be used on Desktop Applications. Swing is present in `Javax.Swing package` 

**GUI Programming follows the steps:-** 
1. Create a container
2. visible a frame
3. Place the Buttons on the frame
4. Place the Labels on the frame
5. Set the background color of the Frame and buttons

<br>

# Pre-Requisite

Before we start the activities there are some pre-requisite to this micro-byte: 

- Knowledge of Core Java
- JDK 8 installed in your system
- Eclipse editor 

---
# Activity 1 - Create a Frame

Frame is a container which store the element like button, text fields etc, so now we wil make an object of a Frame so that we can put elements on the frame.
## What is an Object ? 

> In real point of view, everything is called an object.

**Each Object is based on three characteristic:**
- State
- Behaviour
- Identity

`State:` The State of an object is stored in variables

`Behavior:` The Behavior of an object is stored in methods

`Identity:` The Program has a single Identity


**Example of an Object:**
- A car is an object which has a state `red color`,  behaviour `running` and identity `engine number`


> In swing JFrame class is used. It inherits the AbstractFrame class. 

**Object of Jframe is given below:**

![Untitled - Paint 23-12-2022 22_59_27](https://user-images.githubusercontent.com/104218088/209376726-f8ecb07f-b865-42e8-b3c6-7e44d0037d04.png)

## Visible a Frame:

- To make a frame visible,  check the image below

![Captures 23-12-2022 23_15_39](https://user-images.githubusercontent.com/104218088/209391488-b274b44f-bab0-4dae-88ed-7732ade998bb.png)

<br>

- To Set size of a frame Use the snippet `frame.setsize(true);`

<br>

---
# Activity 2 - Create a Button

Button is the main part of frame. In swing if you want to create a button then for aht `JButton class` is usedIt  and it inherits the `AbstractButton` class. 
- Object of JButton is shown below: 

![Editing IBD-2022-Master-Repository_README md at Mohit_Supolia_Create_Calculator_Using_Swing_#16 · mohitsupolia_IBD-2022-Master-Repository - Brave 23-12-2022 23_43_21](https://user-images.githubusercontent.com/104218088/209391376-f992900e-3cda-4503-b022-423d3a27ccc7.png)

- Add the button of frame: 
To add the button to the frame use the following syntax `frame.add();` Pass the  button name inside the `add()` method.

<br>

--- 
# Activity 3 - Create a Label

Label is just like a name that we write on the frame. In swing `JLabel` is used to create the labbel, It inherits the `AbstractLabel class`. 
- Object of JLabel is shown below:

![Captures 24-12-2022 00_08_14](https://user-images.githubusercontent.com/104218088/209392815-a5bdddac-cd83-4e7c-aaba-75031736b3c3.png)

## Activity 3 - Task

> Try to create label of your choice

<br>

---
# Activity 4 - Create a Text field

Text field is the main part of calculator, without a text field result will not be displayed. In swing `JTextField is used` to create a `TextField` and it inherits the `AbstractTextField class`.
- Object of JTextField is shown below:

![Captures 24-12-2022 00_23_57](https://user-images.githubusercontent.com/104218088/209394293-210cd30b-92ef-4802-ba01-d3c4697d95bd.png)

---
# Activity 5 - Set a Background color
Background color is important because it help us to change the color of the frame, button, Label and Text field. 
- There are two ways to change the background color: 
1. Using AWT
> Syntax: `frame.setBackground(color.black);`
2. Using swing
> Syntax: `frame.getContentPane().setBackground(Color.black);`


- The commonly used method to set background color is shown below:

![Untitled - Paint 24-12-2022 01_08_35](https://user-images.githubusercontent.com/104218088/209399153-76b2113c-6f63-49d1-8c4b-8e37b635936c.png)
 
# Activity 5 -Task
> Like I have set the blackground color as a black color, now you try set a different color

---
# Activity 6 - Use Action Listener

Action Listener is an `interface`. The Listener interface for receiving action events. The class that is interested in processing an action event implements this interface, and the object created with that class is registered with a component's `addActionListener` method. When the action event occurs, that object's `actionPerformed method` is invoked. 

Implement the ActionListener interface and override the `ActionPerformed(ActionEvent e)` method to write the logic inside that method and then we register the code.  
- Implementation of ActionListener Interface in the following code:

```java
Class A implements ActionListener
{
//override the ActionPerformed method
public void actionPerformed(ActionEvent e)
{
logic will write inside the method
}
}
```
# Activity 6 -Task
Create a logic for square root and deleting single number inside the actionPerformed method
> Hint: Create the logic as I have created for multiplication 

<br>

# Conclusion

Finally we have  came to the end of the activities. Now you will be able to create your own calculator and with more features. By following the activities you should have learned about the Swings, hope you will learn more about the swings.

# Reference

1. [Oracle Java Documentation](https://docs.oracle.com/en/java/)
2. [Java Swing](https://www.javatpoint.com/java-swing)