**Mock Global Weather Service**

This is a mock webservice needed by wp-demo02. It is configured to return mock data for testing purposes as the getWeather service for 
http://www.webservicex.net/globalweather.asmx?wsdl currently returns no data.

To run this project you will need to have Anypoint studio running on your machine.

1. Install Anypoint Studio and import the project to your workspace.
2. Make sure the project settings have jdk 8 set as a JRE system library (Maven will not run until this step is done).
3. Click "Run As" mule application with maven.
4. View console output to make sure there are no ports already in use.

You should be able to hit http://localhost:63081/weather?wsdl and see the wsdl for this mock.

This service supports the following test cases. These are all based on the behavior and return payloads of the real globalweather service.

1. Valid Country Name - returns country and cities.
2. Empty input - returns all countires and cities. 
3. "Non existing" Country Name - returns "&amp;lt;NewDataSet /&amp;gt;" as the payload.
4. GetWeather returns mock weather data.
5. When the city name is specified as 'hobbiton', returns "No Data Found".


**Technical Commentary**

Because the data is returned as CDATA, initially looked to building an interceptor to output this into the response. 
It appears the CXF component already does this when output is xml written as a string, so this step was not needed. Because of the CDATA 
this was a theme throughout this project - to encode or not to encode. 

Having a stricter approach to schema, mime/type and encoding (as messages flow between mule components), as well as creating layers of indirection 
for testability, are all practices I would use going forwards as a result of this experience.
