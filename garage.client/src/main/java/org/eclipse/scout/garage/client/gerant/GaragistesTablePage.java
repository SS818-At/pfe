package org.eclipse.scout.contacts.client.gerant;

import org.eclipse.scout.contacts.client.gerant.GaragistesTablePage.Table;
import org.eclipse.scout.contacts.shared.gerant.GaragistesTablePageData;
import org.eclipse.scout.contacts.shared.gerant.IGaragistesService;
import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(GaragistesTablePageData.class)
public class GaragistesTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		// TODO [Souso] verify translation
		return TEXTS.get("Garagistes");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		  
    }
	protected boolean getConfiguredLeaf() {
		    return true;
    }
	public class Table extends AbstractTable {
	     ​protected boolean getConfiguredDisplayable() {
	         ​return false;
	       ​}
	       ​@Override
	       ​protected boolean getConfiguredPrimaryKey() {
	         ​return true;
	       ​}
	       ​public class FirstNameColumn extends AbstractStringColumn {
	    	     ​@Override
	    	     ​protected String getConfiguredHeaderText() {
	    	       ​return TEXTS.get("Prénom");
	             }
	      ​       protected int getConfiguredWidth() {
	    	       ​return 120;
	             }     
	        }
	       ​public class PhoneColumn extends AbstractStringColumn {
	    	     ​@Override
	    	     ​protected String getConfiguredHeaderText() {
	    	       ​return TEXTS.get("Numéro de téléphone");
	    	     ​}
	    	     ​@Override￼
	    	     ​protected boolean getConfiguredVisible() {
	    	       ​return false;
	    	     ​}
	    	     ​@Override
	    	     ​protected int getConfiguredWidth() {
	    	       ​return 120;
	    	​}
    }
}
