package CalculatorProject;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener
{
	JFrame f;
	JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonoff,buttonon,add,subtract,multiply,divide,modulus,decimal,equalto,clear;
	JTextField tf1;
	String s1,s2,s3,s4,s5,s6;
	char operator;
	double result;
	public Calculator(String Title)
	 {
		f=new JFrame(Title);
		
		 button1=new JButton("1");
		 button2=new JButton("2");
		 button3=new JButton("3");
		 button4=new JButton("4");
		 button5=new JButton("5");
		 button6=new JButton("6");
		 button7=new JButton("7");
		 button8=new JButton("8");
		 button9=new JButton("9");
		 button0=new JButton("0");
	
		 add=new JButton("+");
		 subtract=new JButton("-");
		 multiply=new JButton("*");
		 divide=new JButton("/");
		 modulus=new JButton("%");
		 decimal=new JButton(".");
		 equalto=new JButton("=");
		 clear=new JButton("C");
		 
		 tf1=new JTextField(26);
		 
		 f.setVisible(true);
		 f.setSize(300,200);
		 f.setLocation(300,190);
		System.out.println(f.getLocation());
		
		//In AWT frame background color change only below:
		//f.setBackground(Color.black);
		
		f.getContentPane().setBackground(Color.black);
		
		// Using Swing exiting the window closing code
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 f.setLayout(new FlowLayout());
		 
		 
		 f.add(tf1);
		 f.add(button1);
		 f.add(button2);
		 f.add(button3);
		 f.add(button4);
		 f.add(button5);
		 f.add(button6);
		 f.add(button7);
		 f.add(button8);
		 f.add(button9);
		 f.add(button0);
		 f.add(add);
		 f.add(subtract);
		 f.add(multiply);
		 f.add(divide);
		 f.add(modulus);
		 f.add(decimal);
		 f.add(equalto);
		 f.add(clear);
		//Registration code 
		 button1.addActionListener(this);
		 button2.addActionListener(this);
		 button3.addActionListener(this);
		 button4.addActionListener(this);
		 button5.addActionListener(this);
		 button6.addActionListener(this);
		 button7.addActionListener(this);
		 button8.addActionListener(this);
		 button9.addActionListener(this);
		 button0.addActionListener(this);
		 add.addActionListener(this);
		 subtract.addActionListener(this);   
		 multiply.addActionListener(this);
		 divide.addActionListener(this);
		 modulus.addActionListener(this);
		 decimal.addActionListener(this);
		 equalto.addActionListener(this);
		 clear.addActionListener(this);
		 
		 // Registration WindowAdopter.
		// f.addWindowListener(new MyWindowAdoptor());
		 
		 button1.setBackground(Color.cyan);
		 button2.setBackground(Color.cyan);
		 button3.setBackground(Color.cyan);
		 button4.setBackground(Color.cyan);
		 button5.setBackground(Color.cyan);
		 button6.setBackground(Color.cyan);
		 button7.setBackground(Color.cyan);
		 button8.setBackground(Color.cyan);
		 button9.setBackground(Color.cyan);
		 button0.setBackground(Color.cyan);
		
		 add.setBackground(Color.LIGHT_GRAY);
		 subtract.setBackground(Color.LIGHT_GRAY);
		 multiply.setBackground(Color.LIGHT_GRAY);
		 divide.setBackground(Color.LIGHT_GRAY);
		 modulus.setBackground(Color.LIGHT_GRAY);
		 decimal.setBackground(Color.LIGHT_GRAY);
		 equalto.setBackground(Color.PINK);
	
	 }
	
	public static void main(String[] args) 
	{
		Calculator calculator=new Calculator("Basic Calculator");
	}
	
//	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//Upcaste the Button.
		try {
		JButton b1=(JButton)e.getSource();
		if(b1==button1)
		{
			s1=tf1.getText();
			s2="1";
			s3=s1+s2;
			tf1.setText(s3);
		}
			else if(b1==button2)
			{
				s1=tf1.getText();
				s2="2";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==button3)
			{
				s1=tf1.getText();
				s2="3";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==button4)
			{
				s1=tf1.getText();
				s2="4";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==button5)
			{
				s1=tf1.getText();
				s2="5";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==button6)
			{
				s1=tf1.getText();
				s2="6";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==button7)
			{
				s1=tf1.getText();
				s2="7";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==button8)
			{
				s1=tf1.getText();
				s2="8";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==button9)
			{
				s1=tf1.getText();
				s2="9";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==button0)
			{
				s1=tf1.getText();
				s2="0";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==add)
			{
				s4=tf1.getText();
				tf1.setText("");
				 operator='+';
			}
			else if(b1==subtract)
			{
				s4=tf1.getText();
				tf1.setText("");
				operator='-';
			}
			else if(b1==multiply)
			{
				s4=tf1.getText();
				tf1.setText("");
				operator='*';
			}
			else if(b1==divide)
			{
				s4=tf1.getText();
				tf1.setText("");
				operator='/';
			}
			else if(b1==modulus)
			{
				s4=tf1.getText();
				tf1.setText("");
				operator='%';
				
			}
			
			else if(b1==decimal)
			{
				s1=tf1.getText();
				s2=".";
				s3=s1+s2;
				tf1.setText(s3);
			}
			else if(b1==equalto)
			{
				 s5=tf1.getText();
				 switch(operator)
				 {
				 case '+':
					  result=Double.parseDouble(s4)+Double.parseDouble(s5);
					 tf1.setText(String.valueOf(result));
					 break;
				 case '-':
					  result=Double.parseDouble(s4)-Double.parseDouble(s5);
					 tf1.setText(String.valueOf(result));
					 break;
				 case '*':
					  result=Double.parseDouble(s4)*Double.parseDouble(s5);
					 tf1.setText(String.valueOf(result));
					 break;
				 case '/':
					 try {
						 int i=Integer.parseInt(s5);
						 if(i!=0)
						 {
					  result=Double.parseDouble(s4)/Double.parseDouble(s5);
					 tf1.setText(String.valueOf(result));
						 }
						 else
						 {
							 tf1.setText("Cannot divide by zero");
						 }
					 }
					 catch(Exception e1)
					 {
						System.out.println(e1); 
					 }
					 break;
				 case '%':
					  result=Double.parseDouble(s4)%Double.parseDouble(s5)/(100);
					 tf1.setText(String.valueOf(result));
					 break;
					 
					 default:
						 tf1.setText(String.valueOf(s3));
						 return;
						 
					 
				 }
			}
			else if(b1==clear)
			{
				tf1.setText("");
			}
		}
		catch(Exception e1) {
		System.out.println(e1);}
		
	}
}

//Exiting window closeing code in AWT
/*class MyWindowAdoptor extends WindowAdapter
{
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}*/
