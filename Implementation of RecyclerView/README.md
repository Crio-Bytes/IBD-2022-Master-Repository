# Overview
By this learner will learn how to install Android Studio, make project in Android Studio,  implement RecyclerView with CustomeAdapter,run an android app and build an apk of your android application

# What is Android Studio?
Android Studio is a IDE(Integreated Development Environment), which provides an environment to develop android applications. Androind Studio has features that enchances the productivity while building Android apps
# Some Features of Android Studio
  - It has a user-friendly environment to develop android application
  - It has Gradle build system which automates the compilation,testing,linking of libraries files and do many more tasks
  - It provides various tools for testing your android applications
  - It also provide a emulator on which you can run your apps and test your apps

  # What is RecyclerView in Android?
  RecyclerView id a view group in Android that is used to display a collection of items in a list or a grid. It is the successor of [ListView](https://www.javatpoint.com/android-listview-example) and the [GridView](https://www.tutorialspoint.com/android/android_grid_view.htm)
  The RecyclerView Widgets is more flexible and efficient than its predecessors 
  ## Features of RecyclerView
  - It reuses view holders when scrolling and can display larger collection of data with better performance
  - One of the main benefit of using RecyclerView by many android applications is that it allows for efficient display of larger lists of data by recycling views
  ......[click to know more](https://www.javatpoint.com/android-recyclerview-list-example)


# Pre-requisite
   - You should have good knowledge of core java and collections framework.
   - Minimum Specifications of the system as follows :
     - RAM : 8GB or above
     - CPU: 2nd gen Intel CPU or above, AMD CPU (Windows Hypervisor)
     - Free storage: 8 GB
     - Screen resolution: 1280 x 800
   - Although android studio comes with it's build in JDK but it is recommend to install JDK 8 or above, to install click below link
      - Link : https://www.educba.com/install-jdk/


# Activity 1: Install and Setup Android studio
- To download android studio visit official website, click below link
   - Link :- https://developer.android.com/studio
   - Then you will see this screen 
    ![Screenshot (42)](https://user-images.githubusercontent.com/72004239/208305090-c90c50d4-81ee-4a69-aa42-1f841ccf7816.png)
     Now click download button and it will begin download
 - After download start installing android studio,for that just follow below steps :-
   - Now click on android studio setup , you will see this screen
     ![Screenshot (43)](https://user-images.githubusercontent.com/72004239/208439572-908ddfcc-a514-46eb-99fa-f928f8905548.png)
   - After that click on "Next option" and keep clicking "Next" until it gets started installing.
   - After successful installation you will see this screen as given below
       ![Screenshot (51)](https://user-images.githubusercontent.com/72004239/208440250-dcbadbd5-8f2b-46f4-9f4c-67ab775c8657.png)

# Activity 2: How to create project in Android Studio
Now, we will learn how to create project in android studio, this is gonna be very simple you just need to follow the steps given follow:
 - Click on Android Studio launcher then you will able to see 
 "New Project" option 
![Screenshot (51)](https://user-images.githubusercontent.com/72004239/208440250-dcbadbd5-8f2b-46f4-9f4c-67ab775c8657.png)
 - Now click on "New Project" 
   - just scroll little a bit and you will see "Empty Activity" select it
 ![Screenshot (53)](https://user-images.githubusercontent.com/72004239/208448273-b12fb4c1-7622-44b4-8c83-9e27001b7f04.png)
   - And click the next button
 - Now give name to your project, you can give any name
   ![Screenshot (54)](https://user-images.githubusercontent.com/72004239/208449719-c5c54bd9-79b7-4154-93c1-6df37c2bb3b8.png)
   - But select "Java" in Language section.
 - Then just click on "finish" button, and it will take some time to build project, it just depends on your system 

-  After finishing you wil see this below screen, that means you have successfully created your project
  ![Screenshot (56)](https://user-images.githubusercontent.com/72004239/208704289-a5f9690b-87b5-4bed-ae5f-5316fbcc8b28.png)

  # Activity 3: Creating a Activity or Interface for RecyclerView
  - Now in this microbyte, we will learn how to add recycler view to the activity where we will show our list of images which will look like below image
![Screenshot (61)](https://user-images.githubusercontent.com/72004239/208870863-e4b07069-74cb-41f2-9533-15428e0adf69.png)
 **To create list of we need images first, so follow below instructions to copy images**
    ## 3.1 Copy Images into Drawble folder
  Firstly we need some images to show in our list of images, 
    copy some picutres into "drawble" folder
  - Download images from "images/list images" folder download all images p1.png to p9.png, [click here to download](https://github.com/HimanshuSinghNegi/IBD-2022-Master-Repository/tree/HimanshuSinghNegi/Implementation_of_RecyclerView_%2318/Implementation%20of%20RecyclerView/images/list%20images) 
    - Now, to copy images into your project refer to this link
     - Link :https://www.geeksforgeeks.org/how-to-add-image-to-drawable-folder-in-android-studio
    

   - ## 3.2 Creating a layout file for each item of our RecyclerView
   
      **To create layout file follow these steps:**
      - Right click on "Layout", then follow the below path
        - Layout ->New ->Layout Resource File
      - After that, it will show you a screen where it wil ask you for name of the Layout resource file, you can give any name, but here giving "list_item"
       - Then, click "ok", and your Layout Resource file is ready
    If you get any problem to follow these instructions just refer to this [images/Screen/]

    - Just double click on that file 
    - After that on right side of screen you will see "Code" option, just click on that

  - if you are facing any issues with the instructions,Then please refer to ["images/Screenshot (59).png"](https://raw.githubusercontent.com/HimanshuSinghNegi/IBD-2022-Master-Repository/1d6d7886733e4278be774f6316589e6846def014/Implementation%20of%20RecyclerView/images/Screenshot%20(59).png)


 **After that, you will see the below screen**
 ![Screenshot (60)](https://user-images.githubusercontent.com/72004239/208835547-389559b1-2f3b-4307-ac5d-953f041ff574.png)


- Now, copy code from "src" folder , the path is  ["src/activity_main.xml"]()


 


 - For that we have to move to "activity_main.xml" file, follow these instructions
    - On your left in "project" panel we have a folder called "res", click on that folder 
    - Then, inside that folder click on "Layout", there you will able to see "activity_main.xml"
  
  
  