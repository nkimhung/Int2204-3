@echo off
set back=%cd%
for /d %%i in (%cd%\*) do (
cd "%%i"
md lab02 lab03 lab04 lab05 lab06 lab07 lab08 lab09 lab10 lab11 lab12
echo.>lab02\readme.md
echo.>lab03\readme.md
echo.>lab04\readme.md
echo.>lab05\readme.md
echo.>lab06\readme.md
echo.>lab07\readme.md
echo.>lab08\readme.md
echo.>lab09\readme.md
echo.>lab10\readme.md
echo.>lab11\readme.md
echo.>lab12\readme.md
)
cd %back%