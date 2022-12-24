# Introduction
As a developer, you constantly have more work to do than hours in the day. Time-sensitive, significant, or blocking issues should be given priority, although they typically take longer to complete than other items on your list.

<img src="./images/introduction.jpg" alt="array">

## what is Python? 
In the technology industry, Python is a very versatile and powerful open-source language that is used at all levels of the application stack, from processing real-time data feeds to serverless applications that take commands from your personal assistant to serving as a reliable general-purpose language for traditional applications.

## why we Use python here?
As I mentioned before, there are always more jobs for developers to perform than they have time for in a day. Additionally, attempting to divide larger jobs into smaller ones just serves to lengthen the list of things that still need to be done. 

What if, though, you could do some of these subtasks really quickly? Python is useful in this situation.

## what is Python scripts?
A Python file meant to be executed immediately is referred to as a script. When you run it, it ought to take action. As a result, scripts frequently have code that was written outside the parameters of any classes or functions.

## what is an Automation scripts?
Small, focused chunks of code known as automation scripts can be used to enhance the product. A launch point, variables with associated binding values, and the source code make up an automation script.

# Pre-Requisites
1. Install Python 3+

    https://www.python.org/downloads/

2. You should have a Python code editor such as Pycharm, Vscode, and so on.
I am using Jupyter notenook there.



# Activities

<hr/>

## Activity 1 - Convert your incredible photos into a pencil drawing

<hr/> 
This script is amazing. With a few lines of code, you can use it to turn your incredible photographs into pencil sketches. This script may be used to impress someone by giving them your pencil sketch.


***OpenCV*** will be used to develop this script.

## what is ***Opencv***?
A Python package called **Opencv** is made to help with computer vision issues. It contains numerous built-in methods that enable it to complete the most difficult tasks with little code.



Run the following command in **cmd** or **command prompt** to instal opencv:
    
    pip install opencv-python

    
Copy the file from **[Incredible Photos into a Pencil Drawing](./src/Activity-1/incredible_photos_into_a_pencil_drawing.ipynb)** 

fill the required data as mentioned

- Add the path of your Image
- Use the run button in Jupyter Notebook or the keys **Ctrl + Enter** to run the file.

## ***Output***:
<img src="./images/activity-1.jpg" alt="array" width="500">

we use ***Gaussian Blurring*** Technique because Gaussian noise can be effectively removed from an image using gaussian blurring.

## Script Application: 
- building ocr software
- detecting number plate
- detecting edges , creating funky images

## Micro-Challenge:-
- Instead of using GaussianBlur(), try out other blurring methods.
<details>

<summary>Hint</summary>
    
Visit this website to learn a new method for image blurring.
https://docs.opencv.org/4.x/d4/d13/tutorial_py_filtering.html   
</details>



<hr/>

## Activity 2 - PDF To Audio File Conversion

<hr/> 
One of my favourite automation tasks is this one. I virtually always use it. Writing a Python script to convert PDFs into audio files is the challenge at hand.



***PyPDF*** and ***Pyttsx3*** will be used to develop this script.



Python's ***PyPDF*** package is used to read text from a pdf file.

Run the following command in cmd or command prompt to instal PyPDF:

    pip install pypdf



A text-to-speech conversion library is called ***Pyttsx3***.

Run the following command in cmd or command prompt to instal Pyttsx3:
    
    pip install Pyttsx3


    
Copy the file from **[PDF To Audio File Conversion](./src/Activity-2/PDF_To_Audio_File_Conversion.ipynb)** 

fill the required data as mentioned there.


## Applications for the script: 
- audiobooks.
- Storyteller.
- The very same script can be used to read the articles from websites like Medium and WordPress by adding a small amount of web scraping.

## Micro-Challenge:-
- Your objective is to convert one folder that is full of PDFs at a time rather than one PDF to audio book at a time.
<details>

<summary>Hint</summary>
 
- Visit this website to learn a new method for Directory Listing in Python.

https://realpython.com/working-with-files-in-python/#:~:text=To%20get%20a%20list%20of,scandir()%20in%20Python%203. 

- Then, while iterating through all the files, use this method to convert it. Each PDF file in the folder will be converted individually.
</details>

&nbsp;

<hr/>

## Activity 3 - Downloading Videos from YouTube

<hr/> 
I spend two to three hours per day—sometimes even more—on YouTube. YouTube is where I learn the majority of what I know because it is free and has a tonne of knowledge. There are some videos that stand out from the rest that I want to carry around so I can watch them when I don't have access to the internet. By downloading the YouTube video for me, this script takes care of my work. It does the task via an external API.

&nbsp;

***pytube*** and ***Tkinter*** will be used to develop this script.

&nbsp;

- A little Python library for obtaining YouTube videos is called ***pytube***.


- One of the most well-known and practical GUI development libraries is ***Tkinter***, which makes it incredibly simple to create great GUIs with little effort.

## Why Tkinter?

The script's overall goal is to develop a user interface that allows you to download YouTube videos by simply entering a URL. We are going to develop a straightforward GUI for our script since that Interface cannot be our CLI.

Run the following command in **cmd** or **command prompt** to instal opencv:
    
    pip install tkinter

    
copy the file from **[Downloading Videos from YouTube](./src/Activity-3/Downloading_Videos_from_YouTube.ipynb)**

- fill the required data as mentioned there.

- Use the run button in Jupyter Notebook or the keys Ctrl + Enter to run the file.


## Script Application: 
- By doing this, you can save yourself the hassle of searching for a website or programme to download your chosen video to your local storage.

- Additionally, it spares you from having to disclose your personal information on a phishing website or link in order to save a YouTube movie to your local storage.

## Micro-Challenge:-
- Create a programme that downloads Facebook videos or Instagram Reels to your local computer.

<hr/>

# Conclusion

Congratulations! You have finished all of the tasks. I hope you enjoyed it and took away something new. You can now create new automation scripts based on your own concepts. Learn how to use more Python libraries to create new things, such as sending mass emails or reading Excel and Word files.

***#Learnbydoing*** is the best method for stimulating your mind and fostering creativity. Additionally, you learn new things, new Python libraries, and many other things as you create new programmes.

# Reference

https://www.activestate.com/blog/top-10-tasks-to-automate-with-python/

https://www.kdnuggets.com/2022/11/3-useful-python-automation-scripts.html
