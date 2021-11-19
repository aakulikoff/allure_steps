package allureTests;

import allureTests.steps.WebSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AnnotatedStepTest extends TestBase {


    @Test
    @DisplayName("Тетс на прверку Issues")
    @Description("Поиск в репозитрии eroshenkoam Issue №68")
    @Link(name = "Github", url = "https://github.com")
    @Owner("kulikovaa")
    @Epic("GitGub")
    @Feature("Поиск")
    @Story("Issue")
    @Severity(SeverityLevel.CRITICAL)
    public void testGitHub() {
        steps.openMainPage(BASEURL);
        steps.searchRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssue();
        steps.checkIssueNumber(ISSUE_NUMBER);
        steps.takeScreenshot();
    }


}
