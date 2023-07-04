package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;



public class VerificationPage {
    private final SelenideElement codeFile = $("[data-test-id='code'] input");
    private final SelenideElement verifyButton = $("[data-test-id=action-verify]");

    public VerificationPage(){
        codeFile.shouldBe(visible);
    }
    public DashboardPage validVerify (DataHelper.VerificationCode verificationCode){
        codeFile.setValue(verificationCode.getCode());
        verifyButton.click();
        return new DashboardPage();
    }
}
