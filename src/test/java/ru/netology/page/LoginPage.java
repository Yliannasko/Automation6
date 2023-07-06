package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement loginFail = $("[data-test-id='login'] input");
    private final SelenideElement passwordFail = $("[data-test-id='password'] input");
    private final SelenideElement loginButton = $("[data-test-id='action-login']");

    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginFail.setValue(info.getLogin());
        passwordFail.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }
}
