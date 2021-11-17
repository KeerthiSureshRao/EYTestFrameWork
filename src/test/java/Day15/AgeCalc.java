package Day15;

public class AgeCalc
{
    public void AgeCalculation(int age) throws Exception
    {
        if(age<4)
        {
            throw new Exception("Kid Category");//throw keyword- used to create new exception
        }
        else if(age > 4 && age <=18)
        {
            System.out.println("Minor Category");
        }
        else
        {
            System.out.println("Major Category");
        }
    }
}

