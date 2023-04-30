Feature: us1002 Kullanici Amazonda parametre olarak yazdigi kelimeyi aratir

  Scenario: TC07 Kullanici parametre ile arama laptirabilmeli

    * kullanici Amazon anasayfasina gider
    * amazonda "Samsung" icin arama yapar
    * sonuclarinin "Samsung" icerdigini test eder
    * 2 saniye bekler
    * sayfayi kapatir