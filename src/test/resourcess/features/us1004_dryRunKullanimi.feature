Feature: us1004 Kullanici amazonda urun aratip 2.urun detaylarini test eder


  Scenario: TC09 Kullanici arama sonuclarinin istedigi urunu test edebilmeli

    * kullanici "amazonUrl" anasayfasina gider
    * amazonda "Nutella" icin arama yapar
    * 3 saniye bekler
    * 2. urune gider
    * urun isminin "Nutella" icerdigini test eder
    * 3 saniye bekler
    * sayfayi kapatir