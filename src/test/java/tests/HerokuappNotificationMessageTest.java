package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HerokuappNotificationMessageTest extends BaseTest {

    @Test(invocationCount = 6)
    public void checkingText() {
        open("http://the-internet.herokuapp.com/notification_message_rendered");
        notificationMessagePage.clickLink();
        notificationMessagePage.waitText();
        assertEquals(notificationMessagePage.getTextNotif(), "Action successful\n" + "×");
    }
}
