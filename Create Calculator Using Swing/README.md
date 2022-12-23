# Introduction
GUI means Graphically User Interface. Basically, GUI is a frame on which we place the buttons, labels, text fields, panels and change the background colors of these items.

These are three concepts of GUI Programming:
1. AWT 
2. Swing 
3. Javafx 

>GUI can use only on Desktop Applications. Swing found in Javax.Swing package. 

> GUI Programming follows the steps:- 
1. Create a container
2. visible a frame
3. Place the Buttons on the frame
4. Place the Labels on the frame
5. Set the background color of the Frame and buttons

# Activity 1 - Create a Frame
Firstly make the object of a Frame.
## What is Object:
In real point of view,everything is called an object.

Each Object is based on three steps:
1. State
2. Behavior
3. Identity

### State:
The State of an object is stored in variables

### Behavior:
The Behavior of an object is stored in methods

### Identity:
The Program has a single Identity

### Example of an Object:
1. A car is an object.
2. A table is an object.

# Frame:
In swing JFrame class is used. It inherits the AbstractFrame class. 
> Object of Jframe is given below:

![Untitled - Paint 23-12-2022 22_59_27](https://user-images.githubusercontent.com/104218088/209376726-f8ecb07f-b865-42e8-b3c6-7e44d0037d04.png)

## Visible a Frame:
> Step of visible a frame:

![Captures 23-12-2022 23_15_39](https://user-images.githubusercontent.com/104218088/209391488-b274b44f-bab0-4dae-88ed-7732ade998bb.png)


## Set size of a frame:
1. frame.setsize(true);

# Activity 2 - Create a Button
Button is the main part of frame. In swing JButton class is used. It inherits the AbstractButton class. 
>Object of JButton is given below: 

![Editing IBD-2022-Master-Repository_README md at Mohit_Supolia_Create_Calculator_Using_Swing_#16 · mohitsupolia_IBD-2022-Master-Repository - Brave 23-12-2022 23_43_21](https://user-images.githubusercontent.com/104218088/209391376-f992900e-3cda-4503-b022-423d3a27ccc7.png)

## Add the button of frame: 
frame.add(); (inner the add method to pass buuton name like one).

# Activity 3 - Create a Label
Label is just like a name that write on the frame. In swing JLabel is used. It inherits the AbstractLabel class. 
>Object of JLabel is given below:
![Captures 24-12-2022 00_08_14](https://user-images.githubusercontent.com/104218088/209392815-a5bdddac-cd83-4e7c-aaba-75031736b3c3.png)

# Activity 4 - Create a Text field
Text field is the main part of calculator. without text field result are not shown. It same as another object. In swing JTextField is used. It inherits the AbstractTextField class.
>Object of JTextField is given below:
![Captures 24-12-2022 00_23_57](https://user-images.githubusercontent.com/104218088/209394293-210cd30b-92ef-4802-ba01-d3c4697d95bd.png)

# Activity 4 - Create a Background color
Background color is important because to chage the color of frame, button, Label and Text field. 
#### There are two ways to change the background color: 
1. Using AWT(frame.setBackground(color.red));
2. Using swing(frame.getContentPane().setBackground(Color.black));

> We will explain commonly used method:
![Untitled - Paint 24-12-2022 01_08_35](https://user-images.githubusercontent.com/104218088/209399153-76b2113c-6f63-49d1-8c4b-8e37b635936c.png)

# Activity 5 - Use of Action Listener
Action Listener is a interface. The Listener interface for receiving action events. The class that is interested in processing an action event implements this interface, and the object created with that class is registered with a component's ** addActionListener ** method. When the action event occurs, that object's ** actionPerformed method ** is invoked. 

Implements the ActionListener interface and override the ** ActionPerformed(ActionEvent e) ** method to write the logic inside that method and then registration of that code.  
> Implementation of ActionListener Interface in the following diagram:

![Captures 24-12-2022 01_33_12](https://user-images.githubusercontent.com/104218088/209401098-54da3f83-68d0-4d0b-9efc-d16bf8f07450.png)
