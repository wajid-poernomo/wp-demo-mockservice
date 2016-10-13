package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.15
 * 2016-10-13T22:13:54.641+11:00
 * Generated source version: 2.7.15
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET", name = "GlobalWeatherSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface GlobalWeatherSoap {

    /**
     * Get all major cities by country name(full / part).
     */
    @WebMethod(operationName = "GetCitiesByCountry", action = "http://www.webserviceX.NET/GetCitiesByCountry")
    @RequestWrapper(localName = "GetCitiesByCountry", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetCitiesByCountry")
    @ResponseWrapper(localName = "GetCitiesByCountryResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetCitiesByCountryResponse")
    @WebResult(name = "GetCitiesByCountryResult", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getCitiesByCountry(
        @WebParam(name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String countryName
    );

    /**
     * Get weather report for all major cities around the world.
     */
    @WebMethod(operationName = "GetWeather", action = "http://www.webserviceX.NET/GetWeather")
    @RequestWrapper(localName = "GetWeather", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetWeather")
    @ResponseWrapper(localName = "GetWeatherResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetWeatherResponse")
    @WebResult(name = "GetWeatherResult", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getWeather(
        @WebParam(name = "CityName", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String cityName,
        @WebParam(name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String countryName
    );
}
