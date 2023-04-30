Feature: us1007 gecerli kullanici adi ve sifre ile sisteme giris
  @wip
  Scenario: TC12 Gecerli username ve password ile basarili giris yapabilmeli

    * kullanici "qdUrl" anasayfasina gider
    * ilk login linkine tiklar
    * username olarak "qdGecerliUsername" girer
    * password olarak "qdGecerliPassword" girer
    * 10 saniye bekler
    * login butonuna basar
    * basarili olarak giris yapildigi test eder
    * sayfayi kapatir
