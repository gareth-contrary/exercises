package composite;

import java.util.List;
import java.util.ArrayList;

public class HtmlParentElement extends HtmlTag {

	private String tagName;
	private List<HtmlTag> children;
	private String startTag;
	private String endTag;
	private String tagBody;
	
	public HtmlParentElement(String tagName) {
		this.tagName = tagName;
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
		this.tagBody = tagBody;
	}

	@Override
	public void addChildTag(HtmlTag htmlTag) {
		if (children.equals(null)) {
			children = new ArrayList<HtmlTag>();
		} else {
			children.add(htmlTag);
		}
	}
}
