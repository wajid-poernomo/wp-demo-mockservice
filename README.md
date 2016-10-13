This is a mock webservice needed by wp-demo02. It is configured to return mock data for testing purposes as the getWeather service for 
http://www.webservicex.net/globalweather.asmx?wsdl currently returns no data.

To run this project you will need to have Anypoint studio running on your machine.

1. Install Anypoint Studio and import the project to your workspace.
2. Make sure the project settings have jdk 8 set as a JRE system library.
3. Click "Run As" mule application with maven.
4. View console output to make sure there are no ports already in use.

You should be able to hit http://localhost:63081/weather?wsdl and see the wsdl for this mock.

This service supports the following test cases. These are all based on the behavior of the above service:

1. Valid Country Name - returns country and cities.
2. Empty input - returns all countires and cities. 
3. Invalid Country Name - returns "&amp;lt;NewDataSet /&amp;gt;" as the payload.
4. GetWeather returns mock data weather data.
5. When the city name is specified as 'hobbiton' the invalid payload is returned, in this case "No Data Found".

Because the data is returned as CDATA, initially looked to building an interceptor to output this into the response. 
It appears the CXF component already does this for xml written as a string, so this step was not needed.
