package webservice02;

import javax.jws.WebService;

import net.webservicex.GlobalWeatherSoap;

@WebService(endpointInterface = "net.webservicex.GlobalWeatherSoap", serviceName = "GlobalWeatherSoap", wsdlLocation = "/src/main/resources/GlobalWeather.wsdl")
public class GlobalWeatherImpl implements GlobalWeatherSoap {

	public String getCitiesByCountry(String countryName) {
		
		if(countryName.isEmpty())
		{
			return 	"<NewDataSet>" 
					+ "<Table>" + "<Country>Algeria</Country>" + "<City>Tlemcen Zenata</City>" + "</Table>" + "<Table>"
					+ "<Country>Algeria</Country>" + "<City>Oran / Es Senia</City>" + "</Table>"  + "<Table>"
					+ "<Country>Tunisia</Country>" + "<City>Djerba Mellita</City>" + "</Table>" + "<Table>"
					+ "<Country>Tunisia</Country>" + "<City>Kairouan</City>" + "</Table>" +  "<Table>"
					+ "<Country>Finland</Country>" + "<City>Ahtari</City>" + "</Table>" + "<Table>"
					+ "<Country>Finland</Country>" + "<City>Ivalo</City>" + "</Table>" + "<Table>"
					+ "<Country>Italy</Country>" + "<City>Treviso / Istrana</City>" + "</Table>" + "<Table>"
					+ "<Country>Italy</Country>" + "<City>Vicenza</City>" + "</Table>" + "<Table>"
					+ "<Country>United States</Country>" + "<City>Wainwright Distant Early Warning</City>" + "</Table>"
					+ "</NewDataSet>";
		}
		
		if(countryName == "Canada")
			return "<NewDataSet>" + "<Table>" + "<Country>Canada</Country>" + "<City>Quaqtaq Airport</City>" + "</Table>" + "</NewDataSet>";
		
		if(countryName.equalsIgnoreCase("Algeria"))
			
		return 	"<NewDataSet>" 
				+ "<Table>" + "<Country>Algeria</Country>" + "<City>Tlemcen Zenata</City>" + "</Table>" + "<Table>"
				+ "<Country>Algeria</Country>" + "<City>Oran / Es Senia</City>" + "</Table>" + "</NewDataSet>";
				
		if(countryName.equalsIgnoreCase("Tunisia"))
			return "<NewDataSet>" + "<Table>"
				+ "<Country>Tunisia</Country>" + "<City>Djerba Mellita</City>" + "</Table>" + "<Table>"
				+ "<Country>Tunisia</Country>" + "<City>Kairouan</City>" + "</Table>" + "</NewDataSet>";
				
		if(countryName.equalsIgnoreCase("Finland"))
			return "<NewDataSet>" + "<Table>"
				+ "<Country>Finland</Country>" + "<City>Ahtari</City>" + "</Table>" + "<Table>"
				+ "<Country>Finland</Country>" + "<City>Ivalo</City>" + "</Table>" + "</NewDataSet>";
				
		if(countryName.equalsIgnoreCase("Italy"))
			return "<NewDataSet>" + "<Table>"
				+ "<Country>Italy</Country>" + "<City>Treviso / Istrana</City>" + "</Table>" + "<Table>"
				+ "<Country>Italy</Country>" + "<City>Vicenza</City>" + "</Table>" + "</NewDataSet>";
		
		if(countryName.equalsIgnoreCase("United States"))
			return "<NewDataSet>" + "<Table>"
				+ "<Country>United States</Country>" + "<City>Wainwright Distant Early Warning</City>" + "</Table>"
				+ "</NewDataSet>";
		
		return "<NewDataSet />";
	};

	public String getWeather(String cityName, String countryName) {
		if (cityName.equalsIgnoreCase("hobbiton"))
			return "Data Not Found";
		
		return "<?xml version=\"1.0\" encoding=\"utf-16\"?> <CurrentWeather> <Location>BOSTON LOGAN INTERNATIONAL, MA, United States (KBOS) 42-22N 071-01W 54M</Location> <Time>Nov 30, 2013 - 03:54 PM EST / 2013.11.30 2054 UTC</Time> <Wind> from the E (100 degrees) at 5 MPH (4 KT):0</Wind> <Visibility> 10 mile(s):0</Visibility> <SkyConditions> mostly cloudy</SkyConditions> <Temperature> 30.9 F (-0.6 C)</Temperature> <Wind>Windchill: 26 F (-3 C):1</Wind> <DewPoint> 18.0 F (-7.8 C)</DewPoint> <RelativeHumidity> 58%</RelativeHumidity> <Pressure> 30.63 in. Hg (1037 hPa)</Pressure> <PressureTendency> 0.07 inches (2.3 hPa) lower than three hours ago</PressureTendency> <Status>Success</Status> </CurrentWeather>";
	};
}