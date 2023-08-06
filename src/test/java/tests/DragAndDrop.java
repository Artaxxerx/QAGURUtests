package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
@Test
    void DragAndDropTest(){
    open("https://the-internet.herokuapp.com/drag_and_drop");
    actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(300, 0).release().perform();
    $("#column-a").sibling(0).shouldHave(text("B"));
}
}
