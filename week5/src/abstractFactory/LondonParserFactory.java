package abstractFactory;

public class LondonParserFactory implements AbstractParserFactory{

	@Override
	public XMLParser getParserInstance(String parserType) {
		if (parserType.equals("LondonORDER")) {
			return new LondonOrderXMLParser();
		} else if (parserType.equals("LondonERROR")) {
			return new LondonErrorXMLParser();
		} else if (parserType.equals("LondonFEEDBACK")) {
			return new LondonFeedbackXMLParser();
		} else if (parserType.equals("LondonRESPONSE")) {
			return new LondonResponseXMLParser();
		} else {
			System.out.println("Invalid Parser Type");
			return null;
		}
	}
	
}
