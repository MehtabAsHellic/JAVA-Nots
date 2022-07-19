
//////////////////////////////////<JAVA CONCEPTS AND UNDERSTANDING WITH EXAMPLE'S>//////////////////////////////////////
//                                                 <START>                                                          //

package com.learningjava;

import javax.swing.text.DefaultEditorKit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //write your code here
        System.out.println("Hello world!");
        /*
        variables are container which store data;
        byte<< 1    {-128 to 127}
        short<< 2
        int<< 4     1,2,3
        long<< 8
        string<< text
        len
        float<< 4   3.142
        char<< 2 a,b,c,d
        boolean<< 1 ture/false
         */

        /*
        how to declare variables,
        syntax<<  <datatype> <variableName> = <value>;
         */
        String box = "memories";
        System.out.println(box);

        int a =7; //we can store multiply value in single line like x=4 or x=6 and y=9
        float b =3.142F;
        boolean isSmart = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(isSmart);

        /*
        <<<types of datatype in java>>>>
        1.non-primitive or reference   <<objects>><<size is not defined>>

        2.primitive  <<which already size which cannot be increased>> like //
                                                                            byte<<1 bytes
                                                                            short<<2 bytes
                                                                            int<<4 bytes
                                                                            long<<8 bytes
                                                                            float<<4 bytes
                                                                            double<<8 bytes
                                                                            boolean<<2 bytes
                                                                                            //
        Example><
         */
        byte m=127;
        double f=14.00000003d;
        System.out.println(m);
        System.out.println(f);
        char grade='A';                 //single quote but in double quote is will be called as string.
        System.out.println(grade);

        /*
        <<operator is java>>

        example,
        operand, operator, operand,  =  result
          1         +         2      =    3

        <<<<<<types of operator in java>>>>>>>

        <Arithmetic>
        <Assignment>
        <Logical>
        <Comparison>
         */

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<EXAMPLE OF arithmetic operator;>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        int num1=30,num2=20;   //use <float> for decimal number,
                              // if you need it in case of modules<%> and divided </>.

        System.out.print("THE ADDITION OF num1 + num2=");
        System.out.println(num1+num2);

        System.out.print("THE ADDITION OF num1 - num2=");
        System.out.println(num1-num2);

        System.out.print("THE ADDITION OF num1 * num2=");
        System.out.println(num1*num2);

        System.out.print("THE ADDITION OF num1 / num2=");
        System.out.println(num1/num2);

        System.out.print("THE ADDITION OF num1 % num2=");
        System.out.println(num1%num2);

        System.out.println(num2++);

        System.out.println(++num2);

        System.out.println(num2--);

        System.out.println(--num2);

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<EXAMPLE OF assignment operator;>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        /*
        assingment value to any variable is called as assignment operator.

        int l=1;
        int k=0;
        int num7=4;
        num7=+7;
        num7-=3;

         */

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<EXAMPLE OF comparison operator;>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        /*

        1.==   <equal equal to>   it check the equality of values
        2.!=   <not equal to>     it check if two values are not equal to
        3.<                       greater
        4.>                       less
        5.<=                      greater equal
        6.>=                      less equal

         */

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<EXAMPLE OF logical operator;>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        /*

        1.Logical AND operator <<&&>>  return the values only if the both condition is true.
        2.Logical OR  operator <<||>>  return the values if any one condition is true.
        3.Logical NOt operator <<!>>>  reverse the result from true to false and vice versa.

         */

        //HOW TO TAKE VALUES IN JAVA AND PRINT IN OUT

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String input = scan.nextLine();
        System.out.println(input);


        // below are called as "<<<<<<escaped sequence character>>>>"
        // to print an " special use the << \"  >>>>>  after the word you wanted.
        //                               << \\  >>>>>  to print back/
        //                               << \t  >>>>>  to print big space
        //                                << \n  >>>>> to give a space

        // string game; method and logic <<<strings methods>>
        String hi = "hello";
        String yep = "game";
        System.out.println(hi.length());
        System.out.println(hi.toUpperCase());
        System.out.println(hi.toLowerCase());
        System.out.println(hi + "pc" + yep);
        System.out.println(hi.contains("llo"));   //contains() is an boolean which tell us
                                                 //the character he put in the brackets are their in that words or not.
        System.out.println(hi.endsWith("he"));
        System.out.println(hi.indexOf("hej"));

        //MATH CLASS IN JAVA <>

        int num6=11 , num9= 12;
        System.out.println(Math.max(num6,num9));    //to get highest values in all of them.
        System.out.println(Math.min(num6,num9));   //to get lowest values in all of them.
        System.out.println(Math.sqrt(36));        //to square too of any values.
        System.out.println(Math.abs(-78));       //conversion from negative to positive.
        System.out.println(Math.abs(78));       //conversion from positive to negative.
        System.out.println(Math.random());     //generate random number.

        System.out.println(11+(11-12)*Math.random());  //to generate random number of give between values like in see.
        System.out.println(11+(11-12)*Math.random());  //different each times in belows.
        System.out.println(11+(11-12)*Math.random());
        System.out.println(11+(11-12)*Math.random());
        System.out.println(11+(11-12)*Math.random());

        // IF ELSE IN JAVA<>//

        Scanner kook = new Scanner(System.in);
        System.out.println("enter you age");
        int age = kook.nextInt();
        if(age>5){

            System.out.println("you are eligible for gaming");
        }
        else if(age>2)  // IF ELSE LADDER EXAMPLE START FROM HERE.
        {
            System.out.println("you are not eligible for gaming");
        }
        else
        {
            System.out.println("completely not possible for gaming");
        }

        // <<SWITCH statement in Java>>

    //        int week = scan.nextInt();
    //        System.out.println("enter your number to de defined w..r.t.days in weeks");
    //        switch (week);
    //        case 1:

        //LOOP<>

        /*
        syntax
        while(condition)
        {
        this condition will keep going executing untill the condition is true
        }

         */

        //Example

        int z=0;
        while (z<100)
        {
            System.out.println(z);
            z += 1;
        }

        /*

        do while loop

        syntax
        do{

        }

         */

        int x=0;
        do{
            System.out.println(x);
            x += 1;
        }
        while (z<100);

        /* FOR LOOP<>

        syntax
        for(st1;st2;st3)
        {

        }

         */
        int u;
        for(u=0;u<10;u++)
        {
          if(u==2)
          {
            continue;
          }
            System.out.println(u);
        }

        // ARRAYS in java<>  COLLECTION OF VARIABLES

        //EXAMPLE

        int [] space = {1,2,3,4,5,6,7,8,9};
        space[8]=10101;                                  //can update values of [space] like that.
        System.out.println(space[7]);
        System.out.println(space[8]);

        //classical way iterate loop.

        for(int j=0;j<space.length;j++)
        {
            System.out.println(space[j]);
        }

        // for each loop

        for(int values:space)
        {
            System.out.println(values);
        }

        //2D arrays

        int [][] matrix={{1,2,3},
                        {4,5,6}};
        {
            System.out.println(matrix[1][0]);
        }

        // String for arrays<>

        String [] Cars = {"mark 1","mark 2","mark 3","mark 4","mark 4"};
        for (String value:Cars)
        {
            System.out.println(value);
        }

        //<TRY-CATCH IN JAVA>

                                                 //SYNTAX

        /*
            try
            {
            }
            catch
            {
            }

         */

        //                        [  <MINI PROJECT> AS CALCULATOR IN JAVA   ]

        float integer_1 , integer_2;
        System.out.println("ENTER YOUR OPERAND FOR CALCULATION");

        Scanner as = new Scanner(System.in);
        integer_1 = as.nextFloat();

        System.out.println("ENTER YOUR SECOND NUMBER TO OPERAND WITH IT");
        Scanner as2 = new Scanner(System.in);
        integer_2 = as2.nextFloat();

        System.out.print("ENTERED NUMBER ARE ");
        System.out.print(integer_1 );
        System.out.print(" AND ");
        System.out.println(integer_2 );

        String prompt = ("ENTERED YOUR OPERATION : 1 FOR ADDITION 2 FOR MINUS 3 FOR MULTIPLICATION 4 FOR DIVISION");
        System.out.println(prompt);

        int input2 = as.nextInt();
        switch (input2)
        {
            case 1:
                System.out.println("ADDING IN PROCESS");
                System.out.print("RESULT ARE: ");
                System.out.println(integer_1 + integer_2);
                break;

            case 2:
                System.out.println("SUBTRACTING IN PROCESS");
                System.out.print("RESULT ARE: ");
                System.out.println(integer_1 - integer_2);
                break;

            case 3:
                System.out.println("MULTIPLYING IN PROCESS");
                System.out.print("RESULT ARE: ");
                System.out.println(integer_1 * integer_2);
                break;

            case 4:
                System.out.println("DIVING IN PROCESS");
                System.out.print("RESULT ARE: ");
                System.out.println(integer_1 / integer_2);
                break;

            default:
                System.out.println("UNDEFINED VALUES AND OPERATION");
        }

    }
}

//////////////////////////////////<JAVA CONCEPTS AND UNDERSTANDING WITH EXAMPLE'S>//////////////////////////////////////
//                                                   <END>                                                            //
















