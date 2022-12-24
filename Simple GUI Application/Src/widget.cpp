#include "widget.h"
#include "ui_widget.h"
#include<QColorDialog>
#include<QSettings>

Widget::Widget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::Widget)
{
    ui->setupUi(this);
    for(int i=0;i<9;i++){
        colorlist.append(Qt::black);
    }
}

Widget::~Widget()
{
    delete ui;
}


void Widget::on_oneButton_clicked()
{
    QColor color=QColorDialog::getColor(colorlist[0],this,"choose backgroud color");
    if(color.isValid()){
        colorlist[0]=color;
        QString css=QString ("background-color: %1").arg(color.name());
        ui->oneButton->setStyleSheet(css);
    }
}


void Widget::on_twoButton_clicked()
{
    QColor color=QColorDialog::getColor(colorlist[1],this,"chosse the backgrond color");
    if(color.isValid()){
        colorlist[1]=color;
        QString css=QString ("background-color :%1").arg(color.name());

        ui->twoButton->setStyleSheet(css);
    }
}


void Widget::on_threeButton_clicked()
{
    QColor color =QColorDialog::getColor(colorlist[2],this,"choose the background color");
    if(color.isValid()){
        colorlist[2]=color;
        QString css =QString ("background-color :%1").arg(color.name());
        ui->threeButton->setStyleSheet(css);
    }
}


void Widget::on_fourButton_clicked()
{
    QColor color =QColorDialog::getColor(colorlist[3],this,"choose the backgrond color");
   if(color.isValid()){
       colorlist[3]=color;
       QString css=QString ("backgoround-color :%1").arg(color.name());
       ui->fourButton->setStyleSheet(css);
   }
}


void Widget::on_fiveButton_clicked()
{
    QColor color =QColorDialog::getColor(colorlist[4],this,"choose the background color");
    if(color.isValid()){
        colorlist[4]=color;
        QString css=QString ("background-color :%1").arg(color.name());
        ui->fiveButton->setStyleSheet(css);
    }
}


void Widget::on_sixButton_clicked()
{
    QColor color=QColorDialog::getColor(colorlist[5],this,"chosoe the background");
    if(color.isValid()){
            colorlist[5]=color;
            QString css=QString("background-color :%1").arg(color.name());
            ui->sixButton->setStyleSheet(css);
}
}


void Widget::on_sevenButton_clicked()
{
    QColor color=QColorDialog::getColor(colorlist[6],this,"choose the background-color");
    if(color.isValid()){
        colorlist[6]=color;
        QString css=QString ("background-color :%1").arg(color.name());
        ui->sevenButton->setStyleSheet(css);
    }
}


void Widget::on_eightButton_clicked()
{
    QColor color =QColorDialog::getColor(colorlist[7],this,"choose the background-color");
    if(color.isValid()){
        colorlist[7]=color;
        QString css=QString ("background-color :%1").arg(color.name());
        ui->eightButton->setStyleSheet(css);
    }
}


void Widget::on_nineButton_clicked()
{
    QColor color=QColorDialog::getColor(colorlist[8],this,"choose the background color");
    if(color.isValid()){
        colorlist[8]=color;
        QString css=QString("background-color:%1").arg(color.name());
        ui->nineButton->setStyleSheet(css);
    }
}


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


void Widget::on_SaveButton_clicked()
{
savecolor("oneButton",colorlist[0]);
savecolor("twoButton",colorlist[1]);
savecolor("threeButton",colorlist[2]);
savecolor("fourButton",colorlist[3]);
savecolor("fiveButton",colorlist[4]);
savecolor("sixButton",colorlist[5]);
savecolor("sevenButton",colorlist[6]);
savecolor("eightButton",colorlist[7]);
savecolor("nineButton",colorlist[8]);
}

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

QColor Widget::loadcolor(QString key)
{
 int red;
 int green;
 int blue;
 QSettings settings("Limit","settingsDemo");
 settings.beginGroup("ButtonGroup");
 red=settings.value(key+"r",QVariant(0)).toInt();
 green=settings.value(key+"g",QVariant(0)).toInt();
 blue=settings.value(key+"b",QVariant(0)).toInt();
 settings.endGroup();
 return QColor(red,green,blue);
}

void Widget::setloader(QString key, int index, QPushButton *button)
{
    QColor color=loadcolor(key);
    colorlist[index]=color;
    QString css=QString("background-color :%1").arg(color.name());
    button->setStyleSheet(css);
}

