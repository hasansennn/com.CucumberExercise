Feature: us1005 Kullanici Scenario outline ile birden fazla kelime aratir

  Scenario Outline: TC10 Amazon coklu urun testi


    * kullanici "amazonUrl" anasayfasina gider
    * amazonda "<kelimeler>" icin arama yapar
    * sonuclarinin "<kelimeler>" icerdigini test eder
    * sayfayi kapatir
    Examples:

      |kelimeler  |
      |Nutella    |
      |Java       |
      |Samsung    |
      |Apple      |
      |Furkan     |