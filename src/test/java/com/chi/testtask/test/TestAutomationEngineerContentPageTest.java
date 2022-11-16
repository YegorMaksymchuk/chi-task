package com.chi.testtask.test;

import com.chi.testtask.steps.TestTaskStep;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;


@Story("Test task from Chi")
public class TestAutomationEngineerContentPageTest {
    TestTaskStep mainPage = new TestTaskStep();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        Configuration.headless=true;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
//    @DisplayName("Verify exact count of skills under the paragraph ‘Professional skills and qualification’")
    public void testCheckCountOfTestAutomationEngineerProfSkills(){
        mainPage.openMainPage();
        mainPage.openCareersMenu();
        mainPage.openVacancies();
        mainPage.openTAEVacation();
        int actualSkillsAmount = mainPage.getCountAutomationTestEngineerProfessionalSkillsAndQualification();
        Assertions.assertEquals(8,actualSkillsAmount,"Should check Professional skills and qualification count");
    }
}
