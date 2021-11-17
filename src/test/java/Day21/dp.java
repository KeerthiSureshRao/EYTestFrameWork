package Day21;
import org.testng.annotations.DataProvider;
public class dp {
//1.Object[][]
//2. Iterator<Object[]>
    @DataProvider(name="LoginData")
    public static Object[][] dataprovider() //In an object array, can store int/array/map values

    {
//        Object[][] objects = new Object[3][2][1];
//        objects[0][0]="Keerthi";
//        objects[0][1]="P S";
//        objects[1][0]="Suresh";
//        objects[1][1]="K";
//        objects[2][0]="Sindhu";
//        objects[2][1]="R";
        return new Object[][]{

                {"Keerthi","P S"},
                {"Suresh","K"},
                {"Sindhu","R"}
        };
    }}
