package RunTest;

public class RunSaouce {

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="./src/test/resources/",
			glue={"SaouceSteps"},
			tags={"@TestSaouce1"};
		}
			)

}
