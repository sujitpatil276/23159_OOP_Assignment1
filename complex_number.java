/*Name : Sujit patil
  Roll No.:23159
  Batch:G9
  Assignment No 1: Classes and objects 
*/
import java.util.Scanner;
public class complex_number //creating complex number class
{
    Scanner sc=new Scanner(System.in);
    double real,complex;//defining real and complex parts of complex number
    static int count1,count2;//creating 2 static integers to use in input and display functions respectively so that we can know how many complex numbers are formed and can display them using their numbers in display functiom 
    complex_number()//default constructor
    {
        real=1.0;
        complex=1.0;
    }

    complex_number(double real_part, double complex_part)//Parameterized constructor
    {
        real=real_part;
        complex=complex_part;
    }

    void input()//input function where we can take values of real and complex parts of complex number
    {
        System.out.println("Enter the real value of complex no."+ ((count1) +(1)));//adding 1 to static integer so that it will display 1 for first complex no.
        real=sc.nextDouble();
        System.out.println("Enter the complex value of complex no."+((count1) +(1)));
        complex=sc.nextDouble();
        count1++;//now incrementing value of static integer so that 2 gets printed for next complex number
    }

    void display()//Function to display  complex number
    {
        System.out.println("The complex number "+((count2)+(1)) +" is\n"+real+" + "+complex+"i");
        count2++;
    }
    
    void add(complex_number a, complex_number b)//Function to add 2 complex numbers
    {
        System.out.println("The sum is\n"+(a.real+b.real)+" + "+(a.complex+b.complex)+"i");
    }
    
    void substract(complex_number a,complex_number b)//Function to substract 2 complex numbers
    {
        System.out.println("The difference is\n"+(a.real-b.real)+" + "+(a.complex-b.complex)+"i");
    }
    
    void multiply(complex_number a,complex_number b)//Function to multiply 2 complex numbers
    {
        double real_product,complex_part;
        real_product=(a.real*b.real)-(a.complex*b.complex);
        complex_part=(a.real*b.complex)+(a.complex*b.real);
        System.out.println("The product is "+real_product+" + "+complex_part+"i");
    }
    void divide(complex_number a,complex_number b){//Function to divide 2 complex numbers
        double d = (b.real*b.real) + (b.complex*b.complex);
        complex_number c = new complex_number();
        c.real = ((a.real*b.real) + (a.complex*b.complex));
        c.complex = ((b.complex*b.real) - (a.complex*a.real) );
        System.out.println("The ratio is "+(c.real)/d+ (c.complex)/d+"i");
    }
    // int complex_number,count =1;
     public static void main(String[] args)
    {
        complex_number c1=new complex_number(1.0,1.0);//creating first complex no.
        complex_number c2=new complex_number(1.0,1.0);//creating second complex no. 
        complex_number c3=new complex_number();//creating third complex number which will be formed by performing operations on first 2 complex numbers
        int choice;
        //Applying do-while loop so that we can perform operations on numbers after taking them as input in case 1
        do{
        System.out.println(" Enter\n1(Enter numbers)\n2(Add)\n3(Subtract)\n4(Multiply)\n5(Divide\n6(Exit))");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();//Taking choice from user about which operation to perform on complex numbers
        switch(choice)
        {   
            case 1:c1.input();
                   c2.input();
                   c1.display();
                   c2.display();
            break;
            case 2:c3.add(c1,c2);
            break;
            case 3:c3.substract(c1,c2);
            break;
            case 4:c3.multiply(c1,c2);
            break;
            case 5:c3.divide(c1,c2);
            break;
            case 6: break;
            default:System.out.println("Wrong choice");
            }
    }while(choice!= 6);
    }
}
