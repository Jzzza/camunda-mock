
1. Подход по деплою (process-engine + custom)

1.1. Можно использовать набор jar'ок положив их перед этим в 'Loader-Path':'./libs/' (по умолчанию).

1.1.1 В этих jar'ках можно указать набор функций, которые будут вызывать java код из процесса.

1.1.2 Можно управлять с помощью переменной -Dloader.path

1.1.3.1. Собрать библиотеку с процессом

1.1.3.2. Собрать библиотеку с приложением

1.1.3.4. Положить библиотеку с процессом в папку libs

Вопрос - как можно обновляться на горячую (без простоя). Может есть вариант менять джарки и обновлять контекст на лету