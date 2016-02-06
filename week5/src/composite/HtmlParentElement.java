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
		this.children = new ArrayList<HtmlTag>();
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
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}

	@Override
	public void addChildTag(HtmlTag htmlTag) {
		children.add(htmlTag);
	}
	
	@Override
	public List<HtmlTag> getChildren() {
		return children;
	}
	
	@Override
	public void generateHtml() {
		System.out.print(startTag);
		if(!tagBody.equals("")) {
			System.out.print(tagBody);
		} else {
			System.out.println();
		}
		for (HtmlTag child : children) {
			child.generateHtml();
		}
		System.out.println(endTag);
	}
}
