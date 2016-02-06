package composite;

public class HtmlElement extends HtmlTag {

	private String tagName;
	private String startTag;
	private String endTag;
	private String setTagBody;
	
	public HtmlElement(String name) {
		this.tagName = name;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void setTagBody(String tagBody) {
		this.setTagBody = tagBody;
	}
}
