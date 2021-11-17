package Day2;

public class Common_arithmatics
{
    int j=0;
    static int k =0;
    void increment () {
        j++;
        k++;
    }
    int add(int num1,int num2)
    {
        int s = num1 +num2 ;
        return s;
    }
    int sub(int num1,int num2)
    {
        return num1 - num2 ;

    }
    int mul(int num1, int num2)
    {
        return num1 * num2;
    }
    static void addk(){
        ++k;
      //  ++j;  variables should always be a static one, here j is not
        System.out.println("Value of l :"+k);
       // System.out.println("Value of j : "+j);
    }
}
