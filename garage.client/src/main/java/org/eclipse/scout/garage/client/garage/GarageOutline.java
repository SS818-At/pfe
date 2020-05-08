package org.eclipse.scout.garage.client.garage;

import java.util.List;

import org.eclipse.scout.garage.shared.Icons;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

/**
 * @author Souad
 */
@Order(1000)
public class GarageOutline extends AbstractOutline {

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("GestionDuGarage");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.CategoryBold;
	}
}
