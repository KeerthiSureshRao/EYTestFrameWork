package Day7;

public class John extends Base_Arithmetic {
//method overriding
    //Addition of 5 to sum of two number
    int addNum(int a, int b)
    {
        return super.addNum(a,b)+ 5;
    }
    //power
    double powerofNumber(double x, double y)
    {
        return Math.pow(x,y);
    }
}
