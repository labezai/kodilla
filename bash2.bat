del /S build\libs\*.jar

gradlew build

if exist build\libs\*.jar (
    for /R build\libs %%f in (*.jar) do copy %%f C:\skrypt\
) else (
    echo "File not found. Compilation failure."
) 