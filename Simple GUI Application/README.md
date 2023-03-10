# Introduction 
Qt is a cross-platform application development framework for desktop, embedded and mobile. Supported Platforms include Linux, OS X, Windows, VxWorks, QNX, Android, iOS, BlackBerry, Sailfish OS and others.Qt is not a programming language on its own. It is a framework written in C++. A preprocessor, the MOC (Meta-Object Compiler), is used to extend the C++ language with features like signals and slots. Before the compilation step, the MOC parses the source files written in Qt-extended C++ and generates standard compliant C++ sources from them. Thus the framework itself and applications/libraries using it can be compiled by any standard compliant C++ compiler like Clang, GCC, ICC, MinGW and MSVC.
# OverView
In this microbyte you will learn how to use QSettiong to save color in button of widget. Once you open the widget  click any button to save color any color,close the widget. Again open it click on load  button you will regain the saved color.
* **First View of Widget**

![image](https://user-images.githubusercontent.com/120928669/209430794-12356762-8ab3-45b5-93f5-7689e4d7b3c8.png)
* **Click on one ```button```**

![image](https://user-images.githubusercontent.com/120928669/209430954-aba26a37-9885-4665-9103-c0302eaa8e49.png)

* **Choose color from colorpicker**

![image](https://user-images.githubusercontent.com/120928669/209431037-9f567ee6-04f1-4311-8e5a-5892f032600d.png)

* **Click on save button**

![image](https://user-images.githubusercontent.com/120928669/209431378-c3893ba3-afa0-4c3a-9370-1aca14aeb7cb.png)

* **Click on load button.Widget fill with save color or default color with black**

![image](https://user-images.githubusercontent.com/120928669/209431513-012a2c03-7a3c-4515-889d-5ec8a4c896b6.png)
# Prerequisites
* **Basic knowledge of c++**
* **[How to install Qt](https://courses.qt.io/how-to-install-qt/index.html#/lessons/ptxZnFe71ghVgm7j-4V95TrBxp25gi6X)**
# Activities
## Activity 1: Play wih widget
**Steps to create demo project folder**
*  **Click on create project**
*  **Choose of templates**
*  **Click on Application(Qt)->Qt Widgets Application**
*  **Click on choose Button**
*  **Save project name**
*  **Inside form folder open widget.ui**

![image](https://user-images.githubusercontent.com/120928669/209432581-a13ae8ab-77ca-49ff-b837-2290234b8b3b.png) 
* **Drag and drop the label in form,pushButton ,write Hello World in label**


**Output of demo project**

![image](https://user-images.githubusercontent.com/120928669/209432706-f1c82c06-5036-448b-892e-953357528f09.png)
### Task
**Create Widget with push button like this**
<br>
![image](https://user-images.githubusercontent.com/120928669/209433055-774e07a3-7033-4c1c-9e2e-fd8c2a997019.png)
## Activity 2: Working with singals and slots
Signals and slots are used for communication with object.In GUI programming, when we change one widget, we often want another widget to be notified. More generally, we want objects of any kind to be able to communicate with one another. For example, if a user clicks a Close button, we probably want the window's close() function to be called.

**Connection of pushButton with widget**
```
#include "mainwindow.h"
#include "ui_mainwindow.h"
#include<QPushButton>

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    connect(ui->pushButton,&QPushButton::clicked,[=](){
        qDebug("Button is clicked");
    });

}
MainWindow::~MainWindow()
{
    delete ui;
}

```
**Another Method to create Signal and slot**
![Singalandslot](https://user-images.githubusercontent.com/120928669/209438440-85d880bc-ef6b-4769-baba-767d5ddc20c2.png)
**In widget.cpp file your slot is created now you can perform your action with pushButton.**
**Change text in Label after clicking pushButtton**

```
#include "widget.h"
#include "ui_widget.h"
#include<QPushButton>
#include<QDebug>
Widget::Widget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::Widget)
{
    ui->setupUi(this);

}
Widget::~Widget()
{
    delete ui;
}
void Widget::on_pushButton_clicked()
{
    //Here you write code and  which action you want to perform
    //Take example you want change text in Label after clicking pushButton
    QString text="Qt World";
    ui->label->setText(text);
}
```
### Task:
**Add images in label after clicking pushButton**
<br>
# Activity 3: Working with QColorDialog
The color dialog's function is to allow users to choose colors. For example, you might use this in a drawing program to allow the user to set the brush color.**Here You will set background color in text edit using pushButton**
```#include "widget.h"
#include "ui_widget.h"
#include<QColorDialog>
#include<QPushButton>
#include<QPalette>

Widget::Widget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::Widget)
{
    ui->setupUi(this);

}
Widget::~Widget()
{
    delete ui;
}
void Widget::on_pushButton_clicked()
{
    QColor color=QColorDialog::getColor(Qt::white,this,tr("selected color"));
    qDebug()<<color;
    QPalette p=ui->textEdit->palette();
    p.setColor(QPalette::Base,color);
    ui->textEdit->setPalette(p);
}
```
**Output**

![image](https://user-images.githubusercontent.com/120928669/209439723-e3c455a2-a846-4170-b1e7-868cc825a3b2.png)
### Task:
**Create two textedit,two pushButton and set different color in background**
<br>
# Activity 4: Working with Setting
QSetting  help to save and restore Data in a ini file.Users normally expect an application to remember its settings (window sizes and positions, options, etc.) across sessions. This information is often stored in the system registry on Windows, and in property list files on macOS and iOS. On Unix systems, in the absence of a standard, many applications (including the KDE applications) use INI text files.
**Using saveButton to saveColor**
```
void Widget::savecolor(QString key, QColor color)
{
    int red=color.red();
    int green=color.green();
    int blue=color.blue();
    QSettings settings("Limit","settingsDemo");
    settings.beginGroup("ButtonGroup");
    settings.setValue(key+"r",red);
    settings.setValue(key+"g",green);
    settings.setValue(key+"b",blue);
            settings.endGroup();

}
```
**Using loadButton to loadColor**
```
void Widget::on_LoadButton_clicked()
{
    setloader("oneButton",0,ui->oneButton);
        setloader("twoButton",1,ui->twoButton);
        setloader("threeButton",2,ui->threeButton);
        setloader("fourButton",3,ui->fourButton);
        setloader("fiveButton",4,ui->fiveButton);
       setloader("sixButton",5,ui->sixButton);
        setloader("sevenButton",6,ui->sevenButton);
        setloader("eightButton",7,ui->eightButton);
        setloader("nineButton",8,ui->nineButton);

}
```
# Summary
After completing this module you will able to create normal gui application and now try to savecolor project by yourself.
# Reference:
. [About Qt](https://wiki.qt.io/About_Qt)

. [About QColorDialog](https://doc.qt.io/qt-6/qcolordialog.html#details)

. [About QSetting](https://doc.qt.io/qt-6/qsettings.html)














