# Проект по тестированию элементов сайта procharity.ru

<p align = "center">

<img title="procharitymain" alt = "frontpage" src="media/screen/procharityMainPage.PNG" width="700">
</p>
## Оглавление

- <a href="#tools">Использованный стек технологий</a>
- <a href="#list">Доступные проверки</a>
- <a href="#jenkins">Параметризованные тесты в Jenkins</a>
- <a href="#allure">Результаты запуска тестов в Allure Report</a>
- <a href="#vid">Видео одной из проверок</a>


<p align="left">
<a id="tools"></a>
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media\logo\JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
</p>

<a id="list"></a>

## :heavy_check_mark: Доступные проверки

- Проверки работы ссылок меню навигации
- Проверки полей формы регистрации для компаний

## <img src="media/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Задача в <a target="_blank" href="https://jenkins.autotests.cloud/">Jenkins</a>

<p align="center">
<a id="jenkins"></a>
<img title="Jenkins" alt="Jenkins" src="media/screen/jenkinsparameters.png"> </p> 

> интеграция с Jenkins позволяет сделать тест параметризованным

<a id="allure"></a>

## <img src="media/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://allure.autotests.cloud/">Allure Report</a>

<p align="center">
<img title="Allure Overview" alt="allure" src="media/screen/phonetests.PNG">
</p>

> Отчет позволяет увидеть результаты выполнения тестов по отдельности
<p align="center">
<img title="Allure Overview" alt="allure" src="media/screen/phonetests0.PNG">
</p>

> Отчет включает в себя скриншот перед закрытием, видео, pagesource

<a id="vid"></a>
<p align="center">
  <img title="Selenoid Video" alt="vid" src="media/video/phone9symbolstestgif.gif">
</p>

> Видео к прохождению теста "При длине телефона 9 символов кнопка Зарегистрироваться неактивна" на Selenoid
 