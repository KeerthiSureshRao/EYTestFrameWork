package Day12_13;
public class LearnConstructor {
    public int a;  //instance variable
    public int b; //instance variable
    public LearnConstructor() //Constructor #1 w/o parameters. Also, Constructor won't have return types lke void, int etc..
    {
        this.a=10;
        this.b=40;}
    public LearnConstructor(int a, int b) //Constructor #2 with parameters.
    {
        this.a=a;
        this.b=b;}
    public void setVal(int a, int b) //a& b are local variables of this method
    {
        this.a=a; //'this.a'=>instance variable & '=a'=> local variable
        this.b=b;}
    public int sum() //Not passing parameters
    {
        return a+b;}} //a&b are instance variable
