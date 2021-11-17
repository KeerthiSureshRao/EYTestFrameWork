package Day10;
public class Arrays {
    public static void main(String[] args) {
        String[] sArray = new String[5];
        sArray[0]="A";
        sArray[1]="B";
        sArray[2]="C";
        sArray[3]="D";
        sArray[4]="E";
//      sArray[5]="F"; //Got an error-'ArrayIndexOutOfBoundException
        System.out.println(sArray[0]);
//  Multi Dimensional Array
        String[][][] mArray = new String[3][2][1];//3 blocks created 0 1 2, each 3 block consist of 2 sub-blocks, each such sub-blocks index starts from 0 1,0 1,0 1 manner. Each can store 2 values.
        mArray[0][0][0]="i";
        mArray[0][1][0]="ii";

        mArray[1][0][0]="iii";
        mArray[1][1][0]="iv";

        mArray[2][0][0]="v";
        mArray[2][1][0]="vi";
        System.out.println(mArray[2][1][0]);
    }
}
