package Day15;

import javax.imageio.stream.FileImageInputStream;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception //throws keyword-to add to method
    {
//        Thread.sleep(-5000); //Checked Exception  O/P : timeout value is negative
//        Thread.sleep(5000, -2); //Checked Exception  O/P : nanosecond timeout value out of range
//        new FileInputStream("c:\\Search.xlsx"); //Checked Exception
//        String[] str = new String[3];
//        str[3]="Keerthi"; //UnChecked Exception or run time exceptions
//        System.out.println(str[3]);
//  Throws :
//        AgeCalc ag=new AgeCalc();
//        ag.AgeCalculation(2);
//  Try Catch :
            AgeCalc ag=new AgeCalc();
            try {
                String y= null;
                System.out.println(y.length());
                int a; int b=4;
                a = b/0;
                ag.AgeCalculation(3);
            } catch(ArithmeticException e) //
            {
                System.out.println("Arithmetic Exception is " + e.toString());
            }catch(NullPointerException e) //
            {
                System.out.println("Null Pointer Exception is " + e.toString());
                e.printStackTrace(); //Actual exception in detail can be displayed instead of just summary
            }
            catch(Exception e) //Exception should be on bottom
            {
                System.out.println("Exception is " + e.toString());
            }finally //any which ways this will get executed even though exception occurs so closing part etc can mention here
            {
                System.out.println("I am anyways going to get Executed!!!");
            }
            System.out.println("END OF PROGRAM");
    }}
