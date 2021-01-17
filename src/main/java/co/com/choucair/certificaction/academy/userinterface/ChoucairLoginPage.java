package co.com.choucair.certificaction.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("buttton that shows us form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text()),'ingresar')]"));

    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("buttton to confirm login")
            .located(By.xpath("//button[contains(@class,'btn btn-primary')]"));


}
