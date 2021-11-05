package com.zlwqa.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void dragAndDropTest(){
        // Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Перенесите прямоугольник А на место В
        $("#column-a").dragAndDropTo($("#column-b"));
        // Проверьте, что прямоугольники действительно поменялись
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));
    }

}
