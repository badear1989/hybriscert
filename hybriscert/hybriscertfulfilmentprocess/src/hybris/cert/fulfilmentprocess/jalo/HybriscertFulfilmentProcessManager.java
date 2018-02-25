/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package hybris.cert.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import hybris.cert.fulfilmentprocess.constants.HybriscertFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class HybriscertFulfilmentProcessManager extends GeneratedHybriscertFulfilmentProcessManager
{
	public static final HybriscertFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HybriscertFulfilmentProcessManager) em.getExtension(HybriscertFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
