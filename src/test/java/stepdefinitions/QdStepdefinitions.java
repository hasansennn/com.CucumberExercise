package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.QdPage;
import utilities.ConfigReader;

public class QdStepdefinitions {
    QdPage qdPage=new QdPage();

    @Given("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
        qdPage.ilkLoginLinki.click();

    }
    @Given("username olarak {string} girer")
    public void username_olarak_girer(String username) {
        qdPage .emailKutusu.sendKeys(ConfigReader.getProperty(username));

    }
    @Given("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));

    }
    @Given("login butonuna basar")
    public void login_butonuna_basar() {
        qdPage.loginButonu.click();

    }
    @Given("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());

    }

    @Given("basarili olarak giris yapildigi test eder")
    public void basarili_olarak_giris_yapildigi_test_eder() {
       Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
    }
    @Given("username olarak examples dan {string} girer")
    public void username_olarak_examples_dan_girer(String username) {
        qdPage.emailKutusu.sendKeys(username);

    }
    @Given("password olarak examples dan {string} girer")
    public void password_olarak_examples_dan_girer(String password) {
        qdPage.passwordKutusu.sendKeys(password);

    }


}
