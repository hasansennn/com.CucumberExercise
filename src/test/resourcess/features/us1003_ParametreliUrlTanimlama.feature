Feature: us1003 kullanici parametre olarak giardigi Url'e gider

  Scenario: TC08 Kullanici url'i parametre olarak girebilmeli

    * kullanici "youtubeUrl" anasayfasina gider
    * 3 saniye bekler
    * "youtubeUrl" sayfasina gittigini test eder
    * sayfayi kapatir