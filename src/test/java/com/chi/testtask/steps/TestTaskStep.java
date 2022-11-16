package com.chi.testtask.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.checkerframework.checker.units.qual.C;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class TestTaskStep {
    @Step("Navigate to https://ctco.lv/en page")
    public void openMainPage() {
        open("https://ctco.lv/en");
    }

    @Step("Open Careers menu")
    public void openCareersMenu(){
        actions().moveToElement($("#menu-item-127")).build().perform();
    }

    @Step("Click Vacancies from the list")
    public void openVacancies(){
        $("#menu-item-131").click();
    }

    @Step("Open vacancy with title 'Test Automation Engineer'")
    public void openTAEVacation(){
        $("#menu-item-5079").click();
    }
    @Step("Get list of Test Automation Engineer Professional skills and qualification")
    public ElementsCollection getAutomationTestEngineerProfessionalSkillsAndQualification(){
        return $$x("//*[text()='Professional skills and qualification:']/../../../ul[1]/li");
    }

    @Step("Get count of Test Automation Engineer Professional skills and qualification")
    public Integer getCountAutomationTestEngineerProfessionalSkillsAndQualification(){
        $x("//*[text()='Professional skills and qualification:']").shouldBe(Condition.visible);
        return $$x("//*[text()='Professional skills and qualification:']/../../../ul[1]/li").size();
    }
}
