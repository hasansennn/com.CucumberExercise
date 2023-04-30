package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.domstorage.model.DomStorageItemRemoved;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepdefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici Amazon anasayfasina gider")
    public void kullanici_amazon_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Given("arama kutusuna Nutella yazar ve enter tusuna basar")
    public void arama_kutusuna_nutella_yazar_ve_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Given("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String expectedIcerik="Nutella";
        String actualAramaSonucyazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucyazisi.contains(expectedIcerik));

    }
       @Given("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Given("arama kutusuna Java yazar ve enter tusuna basar")
    public void arama_kutusuna_java_yazar_ve_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }
    @Given("arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String expectedIcerik="Java";
        String actualAramaSonucyazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucyazisi.contains(expectedIcerik));
    }

    @Given("arama kutusuna Apple yazar ve enter tusuna basar")
    public void arama_kutusuna_apple_yazar_ve_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Apple"+ Keys.ENTER);
    }
    @Given("arama sonuclarinin Apple icerdigini test eder")
    public void arama_sonuclarinin_apple_icerdigini_test_eder() {
        String expectedIcerik="Apple";
        String actualAramaSonucyazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucyazisi.contains(expectedIcerik));

    }
    @Given("amazonda {string} icin arama yapar")
    public void amazonda_icin_arama_yapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);
    }
    @Given("sonuclarinin {string} icerdigini test eder")
    public void sonuclarinin_icerdigini_test_eder(String arananKelime) {
        String actualAramaSonucyazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucyazisi.contains(arananKelime));

    }
    @Given("{int} saniye bekler")
    public void saniye_bekler(Integer istenenSaniye) {
        ReusableMethods.bekle(istenenSaniye);
    }
    @Given("kullanici {string} anasayfasina gider")
    public void kullanici_anasayfasina_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }
    @Given("{string} sayfasina gittigini test eder")
    public void sayfasina_gittigini_test_eder(String istenenUrl) {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl=ConfigReader.getProperty(istenenUrl)+ "/";
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Given("{int}. urune gider")
    public void urune_gider(Integer istenenIndex) {
        amazonPage.istenenUrunElementi(istenenIndex).click();

    }
    @Given("urun isminin {string} icerdigini test eder")
    public void urun_isminin_icerdigini_test_eder(String arananKelime) {

        String actualUrunIsmi = amazonPage.ilkUrunIsimElementi.getText();
        Assert.assertTrue(actualUrunIsmi.contains(arananKelime));

    }

/*
echo "# com.CucumberExercise" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/hasansennn/com.CucumberExercise.git
git push -u origin main
 */











}
