package Day29.DataProviders;
import org.testng.annotations.DataProvider;

public class Dp_Login {

    @DataProvider(name="InvalidLoginData")
    public static Object[][] dataprovider(){
        return new Object[][]{

                {"Keerthi","PS776"},
                {"Megha","BK654"},
                {"Suresh","K123"}
        };

    }
}
