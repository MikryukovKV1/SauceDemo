package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HerokuappIFramesTest extends BaseTest {

    @Test
    public void comparisonTextParagraphTest() {
        open("http://the-internet.herokuapp.com/frames");
        framesPage.transitionIFramesPage();
        assertEquals(iFramesPage.getTextParagraph(), "Your content goes here.");

    }
}
