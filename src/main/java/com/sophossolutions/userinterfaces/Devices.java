package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Devices {

    public static final Target COMPUTER = Target.the("Computer").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[1]"));
    public static final Target OS = Target.the("OS").located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[9]"));
    public static final Target VERSION = Target.the("Version").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[2]"));
    public static final Target VERSION_OS = Target.the("Version OS").located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[9]"));
    public static final Target LANGUAGE = Target.the("Version").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[3]"));
    public static final Target VERSION_LANGUAGE = Target.the("Version Language").located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[38]"));
    public static final Target BUTTON_LAST_STEP = Target.the("Button Last Step").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
