package com.zlwqa.github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void checkSoftAssertionsExampleForJUnit5() {
        // Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейти в раздел Wiki проекта
        $("#wiki-tab").click();
        // Проверка, что в списке страниц(Pages) есть страница SoftAssertions
        $$("#wiki-body a").findBy(text("Soft assertions")).click();
        // Открыть страницу SoftAssertions, проверить что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("JUnit5 extension - com.codeborne.selenide.junit5."));
    }
}
