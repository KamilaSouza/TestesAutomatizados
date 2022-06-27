package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "stepsDefinitions",
        tags = "@dropDown",
        snippets = CucumberOptions.SnippetType.CAMELCASE, //gera metodos com camelcase
        monochrome = true, // letra branca em run
        dryRun = false // true apenas para gerar os steps
)

public class RunnerTest {
}
