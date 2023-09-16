package org.fugerit.java.doc.mod.itext;

import org.fugerit.java.core.function.SafeFunction;

import com.lowagie.text.Cell;
import com.lowagie.text.Element;

public class CellParent implements ParentElement {
	
	private Cell cell;
	
	public CellParent( Cell cell ) {
		this.cell = cell;
	}

	/* (non-Javadoc)
	 * @see org.fugerit.java.doc.mod.itext.ParentElement#add(com.lowagie.text.Element)
	 */
	public void add(Element element) {
		 SafeFunction.apply( () -> this.cell.addElement( element ) );
	}
	
}