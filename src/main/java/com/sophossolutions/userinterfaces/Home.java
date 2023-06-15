package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com")
public class Home extends PageObject {
    public static final Target REGISTER = Target.the("Button Register").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
