package listener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import util.Constants;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {

		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		String screenshotName = result.getMethod().getMethodName()
				+"_"+date.replace(" ", "-").replace(":", "_").replaceAll("-", "_")+"_Fail";
		File SrcFile = (File) (((TakesScreenshot) result.getTestContext().getAttribute(Constants.DRIVER))
				.getScreenshotAs(OutputType.FILE));
		File DestFile = new File(".//screenshot//" + screenshotName + ".png");
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
