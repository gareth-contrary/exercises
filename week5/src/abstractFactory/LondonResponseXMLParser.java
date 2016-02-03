package abstractFactory;

public class LondonResponseXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("London Parsing response XML...");
		return "London Order XML Message";
	}

}
