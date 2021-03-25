import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"stepDefinitions"},
        publish = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@smoke"
        //@smoke
        //@login
        //@loginCorrect
        //@loginWrong
        //@search
        //@searchWithoutLogin
        //@searchWithLogin
        //@purchase
        //@purchaseItem
        //@contactUs
        //@contactUsPage
        //@contactUsFile
)


public class MainRunner {
}
