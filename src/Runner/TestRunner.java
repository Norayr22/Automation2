package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		TestNG runner = new TestNG();
		List<String> suites = new ArrayList<String>();
		suites.add("C:\\Users\\User\\eclipse-workspace\\automation\\test-output\\SmokeTestScenarios\\testng-failed.xml");


		runner.setTestSuites(suites);
		runner.run();

	}

}
