package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
public class RegisterUser implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("Juanito").into(Personal.FIRST_NAME),
                SendKeys.of("Polombia").into(Personal.LAST_NAME),
                SendKeys.of("JP@hifi.com").into(Personal.EMAIL),
                SendKeys.of("November").into(Personal.MONTH),
                SendKeys.of("15").into(Personal.DAY),
                SendKeys.of("1984").into(Personal.YEAR),
                Click.on(Personal.BUTTON_NEXT_LOCATION),
                Click.on(Location.BUTTON_NEXT_DEVICES),
                Click.on(Devices.COMPUTER),
                Click.on(Devices.OS),
                Click.on(Devices.VERSION),
                Click.on(Devices.VERSION_OS),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.VERSION_LANGUAGE),
                Click.on(Devices.BUTTON_LAST_STEP),
                SendKeys.of("Pol0mb_1a*/").into(Complete.PASSWORD),
                SendKeys.of("Pol0mb_1a*/").into(Complete.CONFIRM_PASSWORD),
                Click.on(Complete.CHECK_TERMS),
                Click.on(Complete.CHECK_PRIVACY),
                Click.on(Complete.BUTTON_COMPLETE_SETUP)
        );
    }
    public static RegisterUser make() {
        return Tasks.instrumented(RegisterUser.class);
    }
}
