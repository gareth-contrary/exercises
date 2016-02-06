package composite;

public class HtmlElement extends HtmlTag {

	private String tagName;
	private String startTag;
	private String endTag;
	private String setTagBody;
	private String tagBody;
	
	public HtmlElement(String name) {
		this.tagName = name;
		this.tagBody = "";
	}
	
	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	@Override
	public void generateHtml() {
		System.out.print(startTag);
		if (!tagBody.equals("")) {
			System.out.print(tagBody);
		} else {
			System.out.println();		
		}
		System.out.println(endTag);
	}

	@Override
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}
}
