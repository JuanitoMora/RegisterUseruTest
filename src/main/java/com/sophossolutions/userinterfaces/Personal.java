package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Personal {
    public static final Target FIRST_NAME = Target.the("First Name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Last Name").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("email").located(By.id("email"));
    public static final Target MONTH = Target.the("month").located(By.id("birthMonth"));
    public static final Target DAY = Target.the("day").located(By.id("birthDay"));
    public static final Target YEAR = Target.the("year").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("button next location").located(By.xpath("//a[@class='btn btn-blue']"));
}
