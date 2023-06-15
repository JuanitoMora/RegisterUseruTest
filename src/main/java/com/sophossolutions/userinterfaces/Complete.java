package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Complete {

    public static final Target PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS = Target.the("Check Terms").located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target CHECK_PRIVACY = Target.the("Check Privacy").located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Button Complete Setup").located(By.xpath("//a[@class='btn btn-blue']"));
}

