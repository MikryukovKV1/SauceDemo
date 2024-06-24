package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HerokuappNotificationMessageTest extends BaseTest {

    @Test
    public void checkingText() {
        open("http://the-internet.herokuapp.com/notification_message_rendered");
        notificationMessagePage.clickLink();
        assertTrue(notificationMessagePage.clickToTheSuccessfulStatus());
    }
}
