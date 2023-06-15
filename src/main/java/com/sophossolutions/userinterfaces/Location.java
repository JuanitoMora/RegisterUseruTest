package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Location {
    public static final Target BUTTON_NEXT_DEVICES = Target.the("button next devices").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
