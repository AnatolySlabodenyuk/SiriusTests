# :computer: Проект по автоматизации тестирования
### <a target="_blank" href="https://online.sochisirius.ru/auth">Страница регистрации Сириус Курсы</a>

<p align="center">
<img title="Allure Graphics" src="images/screens/сириус курсы.jpg">
</p>

## :open_file_folder: Содержание:

- [Технологии и инструменты](#wrench-технологии-и-инструменты)
- [Список проверок](#white_check_mark-список-проверок)
- [Запуск тестов (сборка в Jenkins)](#electric_plug-запуск-тестов)
- [Allure-отчет](#img-srcimageslogoalluresvg-width25-height25--altallure-a-отчет-в-a-targetblank-hrefhttpsjenkinsautotestscloudjobc17-slabodenyuk-siriustests7allure-allure-report-a)
- [Интеграция с Allure TestOps](#img-srcimageslogoalluretosvg-width25-height25--altallure-a-интеграция-с-a-targetblank-hrefhttpsallureautotestscloudlaunch19106-allure-testops-a)
- [Уведомление в Telegram о результатах прогона тестов](#img-srcimageslogotelegramsvg-width25-height25--altallure-a-уведомление-в-telegram-о-результатах-прогона-тестов)
- [Видео пример прохождения тестов](#img-srcimageslogoselenoidsvg-width25-height25--altallure-a-пример-видео-прохождения-теста)

## :wrench: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="images/logo/jira-logo.svg" width="50" height="50"  alt="Atlassian Jira"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :white_check_mark: Список проверок
### Автотесты

- [x] Проверка названия формы регистрации
- [x] Проверка отображения подтверждающего окна после прохождения регистрации
- [x] Проверка совпадения введенного Email с Email, указанным во всплывающем окне
- [x] Проверка отображения страницы восстановления пароля

### Ручные тесты

- [x] Проверка отображения кнопки для перехода на страницу регистрации
- [x] Проверка содержания кнопки меню
- [x] Проверка перехода на страницу регистрации после нажатия на кнопку с главной страницы

## :electric_plug: Запуск тестов

###  Локальный запуск :
Пример командной строки:
```bash
gradle clean ui_test
```
### Удаленный запуск с параметрами:
Пример настройки параметров Jenkins
```bash
clean 
ui_test
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${BROWSER_VERSION}"
"-DbrowserSize=${BROWSER_SIZE}"
"-Dremote=${REMOTE}"
```

###  Проект в Jenkins:
#### 1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/C17-Slabodenyuk-SiriusTests/">проект</a>

![This is an image](/images/screens/Jenkins1.png)

#### 2. Выбрать пункт **Собрать с параметрами**
#### 3. В случае необходимости изменить параметры, выбрав значения из выпадающих списков
#### 4. Нажать **Собрать**
#### 5. Результат запуска сборки можно посмотреть в отчёте Allure


## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/C17-Slabodenyuk-SiriusTests/7/allure/">Allure report</a>

###  Главное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/Allure_Report1.png">
</p>

###  Тесты

<p align="center">
<img title="Allure Tests" src="images/screens/Allure_Report2.png">
</p>

###  Графики

<p align="center">
<img title="Allure Graphics" src="images/screens/Allure_Report3.png">
</p>


## <img src="images/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/19106">Allure TestOps</a>
### Общий список всех кейсов: ручных и авто
<p align="center">
<img title="Allure Graphics" src="images/screens/allureTO-report.png">
</p>

### Dashboard с общими результатами тестирования
<p align="center">
<img title="Allure Graphics" src="images/screens/allureTO_dashboard.png">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram о результатах прогона тестов

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/telegramNotif.png" >
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Пример видео прохождения теста
### Тест #2 Появляется окно запроса на регистрацию после заполнения всех полей формы и подтверждения
<p align="center">
<img title="Selenoid Video" src="images/gifs/video.gif" width="250" height="153"  alt="videoUItests.mp4"> 

</p>
