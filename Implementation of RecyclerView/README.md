# Overview
Through this microbytes learner will learn how to install Android Studio, make projects in Android Studio,  implement RecyclerView with CustomeAdapter, run an android app and build an apk of your android application

# What is Android Studio?
Android Studio is an IDE(Integrated Development Environment), which provides an environment to develop android applications. Android Studio has features that enhance productivity while building Android apps
# Some Features of Android Studio
  - It has a user-friendly environment to develop an android application
  - It has Gradle build system which automates the compilation, testing, and linking of libraries files and do many more tasks
  - It provides various tools for testing your android applications
  - It also provides an emulator on which you can run your apps and test your apps

  # What is RecyclerView in Android?
  RecyclerView is a view group in Android that is used to display a collection of items in a list or a grid. It is the successor of [ListView](https://www.javatpoint.com/android-listview-example) and the [GridView](https://www.tutorialspoint.com/android/android_grid_view.htm)
  The RecyclerView Widgets are more flexible and efficient than their predecessors 
  ## Features of RecyclerView
  - It reuses view holders when scrolling and can display a larger collection of data with better performance
  - One of the main benefits of using RecyclerView by many android applications is that it allows for the efficient display of larger lists of data by recycling views
  ......[click to know more](https://www.javatpoint.com/android-recyclerview-list-example)


# Pre-requisite
   - You should have good knowledge of core java and collections framework
   - Minimum Specifications of the system are as follows:
     - RAM : 8GB or above
     - CPU: 2nd gen Intel CPU or above, AMD CPU (Windows Hypervisor)
     - Free storage: 8 GB
     - Screen resolution: 1280 x 800
   - Although android studio comes with its built JDK but it is recommended to install JDK 8 or above, to install click the below link
      - Link : https://www.educba.com/install-jdk/


# Activity 1: Install and Setup Android studio
- To download android studio visit official website, click below link
   - Link :- https://developer.android.com/studio
   - Then you will see this screen 
    ![Screenshot (42)](https://user-images.githubusercontent.com/72004239/208305090-c90c50d4-81ee-4a69-aa42-1f841ccf7816.png)
     Now click "download" button and it will begin to download
  - After download start installing android studio, for that just follow below steps:-
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
   - But select "Java" in the Language section.
 - Then just click on "finish" button, and it will take some time to build the project, it just depends on your system 

-  After finishing you wil see this below screen, which means you have successfully created your project
  ![Screenshot (56)](https://user-images.githubusercontent.com/72004239/208704289-a5f9690b-87b5-4bed-ae5f-5316fbcc8b28.png)

  # Activity 3: Creating an Activity or Interface for RecyclerView
  - Now in this microbyte, we will learn how to add a recycler view to the activity where we will show our list of images which will look like the below image<br>  ![Screenshot (61)](https://user-images.githubusercontent.com/72004239/208870863-e4b07069-74cb-41f2-9533-15428e0adf69.png)
 - **To create list  we need images first, so follow below instructions to copy images**
    ## 3.1 Copy Images into Drawble folder
  Firstly we need some images to show in our list of images, 
    copy some picutres into "drawble" folder
  - Download images from "images/list images" folder download all images p1.png to p9.png, [click here to download](https://github.com/HimanshuSinghNegi/IBD-2022-Master-Repository/tree/HimanshuSinghNegi/Implementation_of_RecyclerView_%2318/Implementation%20of%20RecyclerView/images/list%20images) 
    - Now, to copy images into your project refer to this link
     - Link : https://www.geeksforgeeks.org/how-to-add-image-to-drawable-folder-in-android-studio
    

   - ## 3.2 Creating a layout file for each item of our RecyclerView
     **To create layout file follow these steps:**
      - Right click on "Layout", then follow the below path
        - Layout ->New ->Layout Resource File
      - After that, it will show you a screen where it will ask you for name of the Layout resource file, you can give any name, but here giving "list_item"
      - Then, click "ok", and your Layout Resource file is ready<br>
    If you get any problem to follow these instructions just refer to this [click here](https://www.tutorialkart.com/kotlin-android/android-studio-create-new-layout-xml-file/#:~:text=Android%20%E2%80%93%20Create%20Layout%20File%20in%20Resources%20Layout,4%20Step%204%3A%20Configure%20Layout%20XML%20File%20)

  - Just double click on that file 
  - After that on right side of screen you will see "Code" option, just click on that

  - if you are facing any issues with the instructions,Then please refer to ["images/Screenshot (59).png"](https://raw.githubusercontent.com/HimanshuSinghNegi/IBD-2022-Master-Repository/1d6d7886733e4278be774f6316589e6846def014/Implementation%20of%20RecyclerView/images/Screenshot%20(59).png)

**After that, you will see the below screen**
 ![Screenshot (60)](https://user-images.githubusercontent.com/72004239/208835547-389559b1-2f3b-4307-ac5d-953f041ff574.png)

Here you have to do a task
 - As you can see in above screen, we have "constraintlayout" and "TextView" xml code
 - Your task is to delete the "TextView" xml code only,
 - For that just select the "TextView" xml and delete it
 - **Note** :- Remove all code from file first
- Now, copy code from ["src/list_item.xml"](https://github.com/HimanshuSinghNegi/IBD-2022-Master-Repository/blob/2c8b5f7b22efd6a27a069c89cfe25229839008fb/Implementation%20of%20RecyclerView/src/item_list.xml)

**After that you will a output like this**
![studio64_11NFnuoxNr](https://user-images.githubusercontent.com/72004239/208989780-641902b3-344e-4cc3-9c92-c37d72600dd0.png)
**It means you see this screen means you successfully created "list_item.xml"**

- ## 3.3 Add this below code to "activity_main.xml" file 
 - **Note** :- Remove all code from file first
 - For code move to ["src/activity_main.xml"](https://github.com/HimanshuSinghNegi/IBD-2022-Master-Repository/blob/6a1da81aa3a7133523f2f9adfae49ab5ddce3409/Implementation%20of%20RecyclerView/src/activity_main.xml) ,copy whole code from that file
 - And paste the copied code into "activity_main.xml" of your project

 **After that you will see this output**
 ![Screenshot (62)](https://user-images.githubusercontent.com/72004239/208992255-cb82ffba-b72f-4e0e-9a73-4fd297ca044f.png)


# Activity 4: Creating a CustomAdpater,POJO class etc
 Here in this microbyte we will create a custom  adapter to inflate our items into the recyclerview 

 Firstly, open package where is "MainActivity.java"
 file, for that follow instructions as show in figure
 ![java](https://user-images.githubusercontent.com/72004239/208996349-a8deb959-748b-419d-b20f-fe9d81a7c1cd.png)
 - ## 4.1 Creating POJO class
    - Now, right-click on "com.example.myrecyclerview" 
    - Then follow this path New->Java File
    - After you have to give name of POJO class here i giving "Item"
    - Then click "ok" , after you will see a file "Item.java" will be created in "com.example.myrecyclerview" package

    - Now copy code form file ["src/Item.java"](https://github.com/HimanshuSinghNegi/IBD-2022-Master-Repository/blob/6a1da81aa3a7133523f2f9adfae49ab5ddce3409/Implementation%20of%20RecyclerView/src/Item.java) to your "Item.java" file
    - **After copying your code will look like below screen**
    ![screenshot(100)](https://user-images.githubusercontent.com/72004239/209058926-4d1ce78d-3fdc-4828-8fb7-af0069a07f0e.png)

 - ## 4.2 Creating Custom Adapter for RecyclerView
    Now, here we will make a custome adapter that will inflate our items in our recycler view which we have created above in activity 3 <br>
    **For that **just follow **the below instructions:-****
      - At the same place where we have created "Item.java" file, we have to Create "MyCustomeAdapter.java" file.
      ![branch](https://user-images.githubusercontent.com/72004239/209063999-88d3af61-1058-44b0-ad30-6b9e3780cf31.png)
      - To make "MyCustomAdapter.java" , follow this path<br>
         - Right click ("com.example.myrecyclerview")
         - After that (New->Java File)
         - Now give file name "MyCustomAdapter"<br>
    **After that you see the below output**
    ![Screenshot (63)](https://user-images.githubusercontent.com/72004239/209064988-f0d3dc81-2c8a-4ab7-866f-2365cecfb4ce.png))
      - **Note :** 
         - Copy code carefully, it clearly mentioned in file from 
                   where you have to copy code
         - In case you get any error , to solve just **hover over that error 
          click"import" statement** or just put **your cursor over error and 
          press "Alt+Enter"**
      - Now copy code from ["src/MyCustomeAdapter](https://github.com/HimanshuSinghNegi/IBD-2022-Master-Repository/blob/ebf6fc23eb7ed13eb0769369851eecebc0690573/Implementation%20of%20RecyclerView/src/MyCustomAdapter.java)
 - ## 4.3 Add items in list , set Layout Manager and Adapter
    Now here we will write some code in "MainActivity.java" file<br>
    Firstly move to this place as show in figure
    ![branch](https://user-images.githubusercontent.com/72004239/209063999-88d3af61-1058-44b0-ad30-6b9e3780cf31.png)
    - Open "MainActivity.java" file
    - Now copy code ["src/MainActivity"](https://github.com/HimanshuSinghNegi/IBD-2022-Master-Repository/blob/ebf6fc23eb7ed13eb0769369851eecebc0690573/Implementation%20of%20RecyclerView/src/MainActivity.java) to your Mainactivity.java file
  
  Now you have successfully created your RecyclerView
  - ## 4.4 How to run project on "Android emulator"
    To create a virtual device just refer to this page
     Link : https://developer.android.com/studio/run/emulator#:~:text=To%20install%20the%20Android%20Emulator%2C%20select%20the%20Android,version%20and%20hardware%20characteristics%20of%20the%20simulated%20device.
  - ## 4.5 How to run project on Android emulator
    - Go to top-right corner there you will be seeing a "run" button press it
         ![Screenshot (64)](https://user-images.githubusercontent.com/72004239/209067322-0d1c5300-11ae-4d93-b2f7-a6e7c42baff6.png)
     - It will take some time to run 

# Activity 5: Build apk of your android application
APK stands for Android Package sometimes Android Package Kit or Android Application Package). It's the file format that Android uses to distribute and install apps. As a result, an APK contains all the elements that an app needs to install correctly on your device.

**To build "apk" **follow below instruction:-****
 - Move to top of your android studio 
 - There you will see "Build" click on that, then follow this path <br>
   - Build -> Build Bundle(s)/APK-> Build Apk
   ![apk]After some time you will get a pop up in you bottom-right corner
 ![locate](https://user-images.githubusercontent.com/72004239/209070632-47c6d67b-f326-4718-8e96-16a63eb90418.png)
 - Then, click on **"locate"**, and it will take you to where "apk" is located as show in below image
 ![apk1](https://user-images.githubusercontent.com/72004239/209071376-269cc3bc-6156-4fa3-b1ce-5dd0fb75ee42.png) 
 - That's it, this is your "apk" which you can copy and share with others
 
 # Summary
 By following these microbytes, you have learned about Android studio, Implemenatation of RecyclerView with Custom Adapter, how to create a list item for RecyclerView and how to build an apk
 # References
 - [javatpoint](https://www.javatpoint.com/android-tutorial)
 - [educba](https://www.educba.com/install-jdk/)
 - [android developer guide](https://developer.android.com/studio)
 - [GFG](https://www.geeksforgeeks.org/how-to-add-image-to-drawable-folder-in-android-studio)
 - [tutorialkart](https://www.tutorialkart.com/kotlin-android/android-studio-create-new-layout-xml-file/#:~:text=Android%20%E2%80%93%20Create%20Layout%20File%20in%20Resources%20Layout,4%20Step%204%3A%20Configure%20Layout%20XML%20File%20)
 
   

    

      



    
    
       
