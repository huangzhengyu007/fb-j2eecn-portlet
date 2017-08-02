/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.j2eecn.fb.model.impl;

import com.j2eecn.fb.model.FeedBack;
import com.j2eecn.fb.service.FeedBackLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the FeedBack service. Represents a row in the &quot;fb_FeedBack&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FeedBackImpl}.
 * </p>
 *
 * @author Administrator
 * @see FeedBackImpl
 * @see com.j2eecn.fb.model.FeedBack
 * @generated
 */
public abstract class FeedBackBaseImpl extends FeedBackModelImpl
	implements FeedBack {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a feed back model instance should use the {@link FeedBack} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FeedBackLocalServiceUtil.addFeedBack(this);
		}
		else {
			FeedBackLocalServiceUtil.updateFeedBack(this);
		}
	}
}