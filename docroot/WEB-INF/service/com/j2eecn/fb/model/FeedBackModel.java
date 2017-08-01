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

package com.j2eecn.fb.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the FeedBack service. Represents a row in the &quot;fb_FeedBack&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.j2eecn.fb.model.impl.FeedBackModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.j2eecn.fb.model.impl.FeedBackImpl}.
 * </p>
 *
 * @author Administrator
 * @see FeedBack
 * @see com.j2eecn.fb.model.impl.FeedBackImpl
 * @see com.j2eecn.fb.model.impl.FeedBackModelImpl
 * @generated
 */
public interface FeedBackModel extends BaseModel<FeedBack>, GroupedModel,
	WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a feed back model instance should use the {@link FeedBack} interface instead.
	 */

	/**
	 * Returns the primary key of this feed back.
	 *
	 * @return the primary key of this feed back
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this feed back.
	 *
	 * @param primaryKey the primary key of this feed back
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the fb ID of this feed back.
	 *
	 * @return the fb ID of this feed back
	 */
	public long getFbId();

	/**
	 * Sets the fb ID of this feed back.
	 *
	 * @param fbId the fb ID of this feed back
	 */
	public void setFbId(long fbId);

	/**
	 * Returns the group ID of this feed back.
	 *
	 * @return the group ID of this feed back
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this feed back.
	 *
	 * @param groupId the group ID of this feed back
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this feed back.
	 *
	 * @return the company ID of this feed back
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this feed back.
	 *
	 * @param companyId the company ID of this feed back
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this feed back.
	 *
	 * @return the user ID of this feed back
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this feed back.
	 *
	 * @param userId the user ID of this feed back
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this feed back.
	 *
	 * @return the user uuid of this feed back
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this feed back.
	 *
	 * @param userUuid the user uuid of this feed back
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this feed back.
	 *
	 * @return the user name of this feed back
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this feed back.
	 *
	 * @param userName the user name of this feed back
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this feed back.
	 *
	 * @return the create date of this feed back
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this feed back.
	 *
	 * @param createDate the create date of this feed back
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this feed back.
	 *
	 * @return the modified date of this feed back
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this feed back.
	 *
	 * @param modifiedDate the modified date of this feed back
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this feed back.
	 *
	 * @return the status of this feed back
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this feed back.
	 *
	 * @param status the status of this feed back
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this feed back.
	 *
	 * @return the status by user ID of this feed back
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this feed back.
	 *
	 * @param statusByUserId the status by user ID of this feed back
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this feed back.
	 *
	 * @return the status by user uuid of this feed back
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this feed back.
	 *
	 * @param statusByUserUuid the status by user uuid of this feed back
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this feed back.
	 *
	 * @return the status by user name of this feed back
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this feed back.
	 *
	 * @param statusByUserName the status by user name of this feed back
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this feed back.
	 *
	 * @return the status date of this feed back
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this feed back.
	 *
	 * @param statusDate the status date of this feed back
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the content of this feed back.
	 *
	 * @return the content of this feed back
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this feed back.
	 *
	 * @param content the content of this feed back
	 */
	public void setContent(String content);

	/**
	 * Returns the type of this feed back.
	 *
	 * @return the type of this feed back
	 */
	public int getType();

	/**
	 * Sets the type of this feed back.
	 *
	 * @param type the type of this feed back
	 */
	public void setType(int type);

	/**
	 * Returns the img u r l of this feed back.
	 *
	 * @return the img u r l of this feed back
	 */
	@AutoEscape
	public String getImgURL();

	/**
	 * Sets the img u r l of this feed back.
	 *
	 * @param imgURL the img u r l of this feed back
	 */
	public void setImgURL(String imgURL);

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this feed back is approved.
	 *
	 * @return <code>true</code> if this feed back is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this feed back is denied.
	 *
	 * @return <code>true</code> if this feed back is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this feed back is a draft.
	 *
	 * @return <code>true</code> if this feed back is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this feed back is expired.
	 *
	 * @return <code>true</code> if this feed back is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this feed back is inactive.
	 *
	 * @return <code>true</code> if this feed back is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this feed back is incomplete.
	 *
	 * @return <code>true</code> if this feed back is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this feed back is pending.
	 *
	 * @return <code>true</code> if this feed back is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this feed back is scheduled.
	 *
	 * @return <code>true</code> if this feed back is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.j2eecn.fb.model.FeedBack feedBack);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.j2eecn.fb.model.FeedBack> toCacheModel();

	@Override
	public com.j2eecn.fb.model.FeedBack toEscapedModel();

	@Override
	public com.j2eecn.fb.model.FeedBack toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}