Feature: us1006 Scenario Outline ile coklu negative login test

  Scenario Outline: TC11 Kullanici verilen listedeki kullanici isimleri ile giris yapamamali
    * kullanici "qdUrl" anasayfasina gider
    * ilk login linkine tiklar
    * username olarak examples dan "<username>" girer
    * password olarak examples dan "<password>" girer
    * login butonuna basar
    * giris yapilamadigini test eder
    * sayfayi kapatir


    Examples:
    |username|password|
    |Hasan   |1234    |
    |Said    |645363  |
    |Eyup    |jskdbvk |
    |Fidan   |ytefv86 |