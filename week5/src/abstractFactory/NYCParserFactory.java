package abstractFactory;

public class NYCParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {
		if (parserType.equals("NYCORDER")) {
			return new NYCOrderXMLParser();
		} else if (parserType.equals("NYCERROR")) {
			return new NYCErrorXMLParser();
		} else if (parserType.equals("NYCFEEDBACK")) {
			return new NYCFeedbackXMLParser();
		} else if (parserType.equals("NYCRESPONSE")) {
			return new NYCResponseXMLParser();
		} else {
			System.out.println("Invalid Parser Type");
			return null;
		}
	}

}