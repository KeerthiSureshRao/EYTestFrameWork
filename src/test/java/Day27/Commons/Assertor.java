package Day27.Commons;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class Assertor extends SoftAssert {

    private  ExtentTest test;
    public Assertor(ExtentTest test){
        this.test=test;
    }

    public void onAssertSuccess(IAssert<?> assertCommand) {
        if(assertCommand.getMessage().contains("#")){
            ReportUtil.fail(test,assertCommand.getMessage().split("#")[0],assertCommand.getMessage().split("#")[1].trim());
        }else{
            ReportUtil.fail(test,assertCommand.getMessage());
        }}

    @Override // indication to others that it's an override method
    public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
        if(ex.getMessage().contains("#")){
            ReportUtil.fail(test,ex.getMessage().split("#")[0],ex.getMessage().split("#")[1].split("expected")[0].trim());//#-must take screenshot bcz screenshot path is attached else not, trim to avoid space
        }else{
            ReportUtil.fail(test,ex.getMessage());//without screenshot
        }}}
