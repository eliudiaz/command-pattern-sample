@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  api-command-pattern startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

@rem Add default JVM options here. You can also use JAVA_OPTS and API_COMMAND_PATTERN_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windowz variants

if not "%OS%" == "Windows_NT" goto win9xME_args
if "%@eval[2+2]" == "4" goto 4NT_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*
goto execute

:4NT_args
@rem Get arguments from the 4NT Shell from JP Software
set CMD_LINE_ARGS=%$

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\api-command-pattern.jar;%APP_HOME%\lib\spring-boot-starter-web-1.2.5.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-actuator-1.2.5.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-aop-1.2.5.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-data-elasticsearch-1.2.5.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-1.2.5.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-tomcat-1.2.5.RELEASE.jar;%APP_HOME%\lib\jackson-databind-2.4.6.jar;%APP_HOME%\lib\hibernate-validator-5.1.3.Final.jar;%APP_HOME%\lib\spring-core-4.1.7.RELEASE.jar;%APP_HOME%\lib\spring-web-4.1.7.RELEASE.jar;%APP_HOME%\lib\spring-webmvc-4.1.7.RELEASE.jar;%APP_HOME%\lib\spring-boot-actuator-1.2.5.RELEASE.jar;%APP_HOME%\lib\spring-aop-4.1.7.RELEASE.jar;%APP_HOME%\lib\aspectjrt-1.8.6.jar;%APP_HOME%\lib\aspectjweaver-1.8.6.jar;%APP_HOME%\lib\spring-tx-4.1.7.RELEASE.jar;%APP_HOME%\lib\spring-data-elasticsearch-1.1.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-1.2.5.RELEASE.jar;%APP_HOME%\lib\spring-boot-autoconfigure-1.2.5.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-logging-1.2.5.RELEASE.jar;%APP_HOME%\lib\snakeyaml-1.14.jar;%APP_HOME%\lib\tomcat-embed-core-8.0.23.jar;%APP_HOME%\lib\tomcat-embed-el-8.0.23.jar;%APP_HOME%\lib\tomcat-embed-logging-juli-8.0.23.jar;%APP_HOME%\lib\tomcat-embed-websocket-8.0.23.jar;%APP_HOME%\lib\jackson-annotations-2.4.0.jar;%APP_HOME%\lib\jackson-core-2.4.6.jar;%APP_HOME%\lib\validation-api-1.1.0.Final.jar;%APP_HOME%\lib\jboss-logging-3.1.3.GA.jar;%APP_HOME%\lib\classmate-1.0.0.jar;%APP_HOME%\lib\spring-beans-4.1.7.RELEASE.jar;%APP_HOME%\lib\spring-context-4.1.7.RELEASE.jar;%APP_HOME%\lib\spring-expression-4.1.7.RELEASE.jar;%APP_HOME%\lib\aopalliance-1.0.jar;%APP_HOME%\lib\spring-data-commons-1.9.3.RELEASE.jar;%APP_HOME%\lib\commons-lang-2.6.jar;%APP_HOME%\lib\commons-collections-3.2.1.jar;%APP_HOME%\lib\joda-time-2.4.jar;%APP_HOME%\lib\elasticsearch-1.3.2.jar;%APP_HOME%\lib\slf4j-api-1.7.12.jar;%APP_HOME%\lib\jcl-over-slf4j-1.7.12.jar;%APP_HOME%\lib\jul-to-slf4j-1.7.12.jar;%APP_HOME%\lib\log4j-over-slf4j-1.7.12.jar;%APP_HOME%\lib\logback-classic-1.1.3.jar;%APP_HOME%\lib\lucene-core-4.9.0.jar;%APP_HOME%\lib\lucene-analyzers-common-4.9.0.jar;%APP_HOME%\lib\lucene-codecs-4.9.0.jar;%APP_HOME%\lib\lucene-queries-4.9.0.jar;%APP_HOME%\lib\lucene-memory-4.9.0.jar;%APP_HOME%\lib\lucene-highlighter-4.9.0.jar;%APP_HOME%\lib\lucene-queryparser-4.9.0.jar;%APP_HOME%\lib\lucene-sandbox-4.9.0.jar;%APP_HOME%\lib\lucene-suggest-4.9.0.jar;%APP_HOME%\lib\lucene-misc-4.9.0.jar;%APP_HOME%\lib\lucene-join-4.9.0.jar;%APP_HOME%\lib\lucene-grouping-4.9.0.jar;%APP_HOME%\lib\lucene-spatial-4.9.0.jar;%APP_HOME%\lib\antlr-runtime-3.5.jar;%APP_HOME%\lib\asm-4.1.jar;%APP_HOME%\lib\asm-commons-4.1.jar;%APP_HOME%\lib\logback-core-1.1.3.jar;%APP_HOME%\lib\spatial4j-0.4.1.jar

@rem Execute api-command-pattern
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %API_COMMAND_PATTERN_OPTS%  -classpath "%CLASSPATH%" ed.cracken.code.Main %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable API_COMMAND_PATTERN_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%API_COMMAND_PATTERN_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
