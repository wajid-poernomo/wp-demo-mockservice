This is a mock webservice needed by wp-demo02. It is configured to return mock data for testing purposes as the getWeather service for 
http://www.webservicex.net/globalweather.asmx?wsdl currently returns no data.

To run this project you will need to have Anypoint studio running on your machine.

1. Install Anypoint Studio and import the project to your workspace.
2. Make sure the project settings have jdk 8 set as a JRE system library.
3. Click "Run As" mule application with maven.
4. View console output to make sure there are no ports already in use.

You should be able to hit http://localhost:63081/weather?wsdl and see the wsdl for this mock.
