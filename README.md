# Проект по автоматизации тестирования
### Веб сайт <a target="_blank" href="https://online.sochisirius.ru/auth">Страница регистрации Сириус Курсы</a>

<p align="center">
<img title="Allure Graphics" src="images/screens/сириус курсы.jpg">
</p>

## :maple_leaf: Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins)
- Allure-отчет
- Интеграция с Allure TestOps
- Интеграция с Atlassian Jira
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

## :maple_leaf:Технологии и инструменты

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

## :maple_leaf: Список проверок, реализованных в автотестах

- [x] Проверка названия формы регистрации
- [x] Проверка отображения подтверждающего окна после прохождения регистрации
- [x] Проверка совпадения введенного Email с Email, указанным во всплывающем окне
- [x] Проверка отображения страницы восстановления пароля

## :maple_leaf: Список проверок, реализованных в ручных тестах

- [x] Проверка отображения кнопки для перехода на страницу регистрации
- [x] Проверка содержания кнопки меню
- [x] Проверка перехода на страницу регистрации после нажатия на кнопку с главной страницы

## :maple_leaf: Запуск тестов

###  Локальный запуск :
Пример командной строки:
```bash
gradle clean ui_test
```
Удаленный запуск с параметрами:
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

## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Видео прохождения тестов
<p align="center">
<img title="Selenoid Video" src="https://user-images.githubusercontent.com/81707244/212382939-5543536f-eba7-485e-93ac-28f2c69c449e.mp4" width="250" height="153"  alt="videoUItests.mp4"> 

</p>
