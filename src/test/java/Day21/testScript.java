package Day21;

import org.testng.annotations.Test;
public class testScript
{
//  Eg: Intention to run 3 set of username&password, so once its passed, same '@Test' will get executed 3times
    @Test(dataProvider = "LoginData",dataProviderClass =dp.class )
    public void getUSernamePassword()
    {

    }
}
