package screenshots;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenersClasss extends baseTest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("onTestFailure");

        try {
            takeScreenshot(null);
        } catch (IOException e) {
            // Handle the IOException here or log the error
            System.err.println("IOException occurred while taking a screenshot: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
