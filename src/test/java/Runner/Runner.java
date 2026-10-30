package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {
        "src/test/resources/Features/01_MenuCollection.feature",
        "src/test/resources/Features/02_AccesProduit.feature",
        "src/test/resources/Features/03_AjoutPanier.feature"
    },
    glue = "StepDef",
    plugin = {
        "pretty",
        "html:target/cucumber-report.html"
    },
    monochrome = true
)

public class Runner {
}

