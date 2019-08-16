@echo off
set "DOCUMENTPREVIEW_BIN_FOLDER=%cd%"
cd "%DOCUMENTPREVIEW_BIN_FOLDER%"
echo Using KKFILEVIEW_BIN_FOLDER %DOCUMENTPREVIEW_BIN_FOLDER%
echo Starting DocumentPreview...
echo Please check log file for more information
java -Dsun.java2d.cmm=sun.java2d.cmm.kcms.KcmsServiceProvider -Dspring.config.location=..\conf\application.properties -jar DocumentPreview-2.1.2.jar -> ..\log\kkFileView.log