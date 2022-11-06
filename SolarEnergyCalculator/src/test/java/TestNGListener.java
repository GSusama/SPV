import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNGListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("<<<<<<<<<<<<<< TestMethod started: "+ iTestResult.getName()+" >>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("<<<<<<<<<<<<<< TestMethod passed: "+ iTestResult.getName()+" >>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("<<<<<<<<<<<<<< TestMethod failed: "+ iTestResult.getName()+" >>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("<<<<<<<<<<<<<< TestMethod Skipped: "+iTestResult.getName()+" >>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("<<<<<<<<<<<<<< TestSuite Skipped: "+ iTestContext.getName()+" >>>>>>>>>>>>>>>>>>>");
    }
    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("<<<<<<<<<<<<<< TestSuite Skipped: "+ iTestContext.getName()+" >>>>>>>>>>>>>>>>>>>");
    }
}
