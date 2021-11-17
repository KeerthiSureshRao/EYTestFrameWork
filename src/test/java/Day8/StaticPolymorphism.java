package Day8;

public class StaticPolymorphism {
//method overloading
    int add(int a, int b)              //name of method is same everywhere, but signature of parameters are diff.
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a + b;
    }
    int add(int a, int b, int c)
    {
        return a+ b+c;
    }
}
