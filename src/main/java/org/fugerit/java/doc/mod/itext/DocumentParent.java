package org.fugerit.java.doc.mod.itext;

import org.fugerit.java.core.function.SafeFunction;

import com.lowagie.text.Document;
import com.lowagie.text.Element;

public class DocumentParent implements ParentElement {

	private Document document;
	
	public DocumentParent( Document document) {
		this.document = document;
	}
	
	/* (non-Javadoc)
	 * @see org.fugerit.java.doc.mod.itext.ParentElement#add(com.lowagie.text.Element)
	 */
	public void add(Element element) {
		SafeFunction.apply( () -> this.document.add( element ) );
	}
	
}