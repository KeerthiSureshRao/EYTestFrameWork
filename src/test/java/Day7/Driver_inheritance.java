package Day7;

public class Driver_inheritance {
    public static void main(String[] args) {
        EMI_inheritance s1 = new EMI_inheritance();//EMI_inheritance()class contains code for launch,extract&teardown
        s1.launchApp("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        String emi=s1.extractEmi("100000","13","120");
        System.out.println("EMI is : " +emi);
        s1.tearDown();

        Bing_Inheritance b1 = new Bing_Inheritance();
        b1.launchApp("https://www.bing.com/");
        b1.Search("EY Kochi");
        b1.tearDown();
    }
}
