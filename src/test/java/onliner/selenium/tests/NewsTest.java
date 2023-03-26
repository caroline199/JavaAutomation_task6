package onliner.selenium.tests;

import onliner.selenium.pages.NewsPage;
import org.junit.AfterClass;
import org.junit.jupiter.api.*;



public class NewsTest extends MainPageTest {
    public NewsPage newsPage;

    @BeforeEach
    public void initNewsPage() {
        newsPage = new NewsPage();
    }

    @Test
    public void testNewsItemPresent() {
        Assertions.assertTrue(newsPage.isNewsItemPresent());
    }

    @Test
    public void testOpenNewsBlock() {
        newsPage.openPage();
        Assertions.assertAll(
                () -> Assertions.assertFalse(newsPage.getNewsTitle().isEmpty()),
                () -> Assertions.assertFalse(newsPage.getNewsSection().isEmpty())
        );
    }
}

