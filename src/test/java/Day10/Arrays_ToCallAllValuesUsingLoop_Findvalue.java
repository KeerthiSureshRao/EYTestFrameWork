package Day10;

public class Arrays_ToCallAllValuesUsingLoop_Findvalue {
    public static void main(String[] args) {
        String[] sArray = new String[5];
        sArray[0]="A";
        sArray[1]="B";
        sArray[2]="C";
        sArray[3]="D";
        sArray[4]="E";
        System.out.println("Letter at index 0 is " + sArray[0]);
//  For Loop :
        for(int i=0; i < sArray.length; i++) //sArray.length : will give the length of sArray i.e, 5. But 5 not needed since index is 0-4, so given < symbol
        {   if(sArray[i].equals("C"))
            System.out.println("C is present");
        }
//  Multi Dimensional Array
        String[][][] mArray = new String[3][2][1];
        mArray[0][0][0]="i";
        mArray[0][1][0]="ii";

        mArray[1][0][0]="iii";
        mArray[1][1][0]="iv";

        mArray[2][0][0]="v";
        mArray[2][1][0]="vi";
        System.out.println(mArray[2][1][0]); //Prints only the value at mentioned position
    }
}
