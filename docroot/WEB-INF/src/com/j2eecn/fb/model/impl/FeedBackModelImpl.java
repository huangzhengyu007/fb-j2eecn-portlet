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
import com.j2eecn.fb.model.FeedBackModel;
import com.j2eecn.fb.model.FeedBackSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the FeedBack service. Represents a row in the &quot;fb_FeedBack&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.j2eecn.fb.model.FeedBackModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FeedBackImpl}.
 * </p>
 *
 * @author Administrator
 * @see FeedBackImpl
 * @see com.j2eecn.fb.model.FeedBack
 * @see com.j2eecn.fb.model.FeedBackModel
 * @generated
 */
@JSON(strict = true)
public class FeedBackModelImpl extends BaseModelImpl<FeedBack>
	implements FeedBackModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a feed back model instance should use the {@link com.j2eecn.fb.model.FeedBack} interface instead.
	 */
	public static final String TABLE_NAME = "fb_FeedBack";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "fbId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "status", Types.INTEGER },
			{ "statusByUserId", Types.BIGINT },
			{ "statusByUserName", Types.VARCHAR },
			{ "statusDate", Types.TIMESTAMP },
			{ "content", Types.VARCHAR },
			{ "type_", Types.INTEGER },
			{ "imgURL", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table fb_FeedBack (uuid_ VARCHAR(75) null,fbId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null,content VARCHAR(75) null,type_ INTEGER,imgURL VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table fb_FeedBack";
	public static final String ORDER_BY_JPQL = " ORDER BY feedBack.createDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY fb_FeedBack.createDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.j2eecn.fb.model.FeedBack"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.j2eecn.fb.model.FeedBack"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.j2eecn.fb.model.FeedBack"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long TYPE_COLUMN_BITMASK = 4L;
	public static long UUID_COLUMN_BITMASK = 8L;
	public static long CREATEDATE_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static FeedBack toModel(FeedBackSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		FeedBack model = new FeedBackImpl();

		model.setUuid(soapModel.getUuid());
		model.setFbId(soapModel.getFbId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setStatus(soapModel.getStatus());
		model.setStatusByUserId(soapModel.getStatusByUserId());
		model.setStatusByUserName(soapModel.getStatusByUserName());
		model.setStatusDate(soapModel.getStatusDate());
		model.setContent(soapModel.getContent());
		model.setType(soapModel.getType());
		model.setImgURL(soapModel.getImgURL());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<FeedBack> toModels(FeedBackSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<FeedBack> models = new ArrayList<FeedBack>(soapModels.length);

		for (FeedBackSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.j2eecn.fb.model.FeedBack"));

	public FeedBackModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _fbId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFbId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fbId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FeedBack.class;
	}

	@Override
	public String getModelClassName() {
		return FeedBack.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fbId", getFbId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("content", getContent());
		attributes.put("type", getType());
		attributes.put("imgURL", getImgURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fbId = (Long)attributes.get("fbId");

		if (fbId != null) {
			setFbId(fbId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String imgURL = (String)attributes.get("imgURL");

		if (imgURL != null) {
			setImgURL(imgURL);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getFbId() {
		return _fbId;
	}

	@Override
	public void setFbId(long fbId) {
		_fbId = fbId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@JSON
	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
			_statusByUserUuid);
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	@JSON
	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return StringPool.BLANK;
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	@JSON
	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	@JSON
	@Override
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@JSON
	@Override
	public int getType() {
		return _type;
	}

	@Override
	public void setType(int type) {
		_columnBitmask |= TYPE_COLUMN_BITMASK;

		if (!_setOriginalType) {
			_setOriginalType = true;

			_originalType = _type;
		}

		_type = type;
	}

	public int getOriginalType() {
		return _originalType;
	}

	@JSON
	@Override
	public String getImgURL() {
		if (_imgURL == null) {
			return StringPool.BLANK;
		}
		else {
			return _imgURL;
		}
	}

	@Override
	public void setImgURL(String imgURL) {
		_imgURL = imgURL;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				FeedBack.class.getName()));
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved}
	 */
	@Override
	public boolean getApproved() {
		return isApproved();
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			FeedBack.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FeedBack toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FeedBack)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FeedBackImpl feedBackImpl = new FeedBackImpl();

		feedBackImpl.setUuid(getUuid());
		feedBackImpl.setFbId(getFbId());
		feedBackImpl.setGroupId(getGroupId());
		feedBackImpl.setCompanyId(getCompanyId());
		feedBackImpl.setUserId(getUserId());
		feedBackImpl.setUserName(getUserName());
		feedBackImpl.setCreateDate(getCreateDate());
		feedBackImpl.setModifiedDate(getModifiedDate());
		feedBackImpl.setStatus(getStatus());
		feedBackImpl.setStatusByUserId(getStatusByUserId());
		feedBackImpl.setStatusByUserName(getStatusByUserName());
		feedBackImpl.setStatusDate(getStatusDate());
		feedBackImpl.setContent(getContent());
		feedBackImpl.setType(getType());
		feedBackImpl.setImgURL(getImgURL());

		feedBackImpl.resetOriginalValues();

		return feedBackImpl;
	}

	@Override
	public int compareTo(FeedBack feedBack) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), feedBack.getCreateDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FeedBack)) {
			return false;
		}

		FeedBack feedBack = (FeedBack)obj;

		long primaryKey = feedBack.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		FeedBackModelImpl feedBackModelImpl = this;

		feedBackModelImpl._originalUuid = feedBackModelImpl._uuid;

		feedBackModelImpl._originalGroupId = feedBackModelImpl._groupId;

		feedBackModelImpl._setOriginalGroupId = false;

		feedBackModelImpl._originalCompanyId = feedBackModelImpl._companyId;

		feedBackModelImpl._setOriginalCompanyId = false;

		feedBackModelImpl._originalType = feedBackModelImpl._type;

		feedBackModelImpl._setOriginalType = false;

		feedBackModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FeedBack> toCacheModel() {
		FeedBackCacheModel feedBackCacheModel = new FeedBackCacheModel();

		feedBackCacheModel.uuid = getUuid();

		String uuid = feedBackCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			feedBackCacheModel.uuid = null;
		}

		feedBackCacheModel.fbId = getFbId();

		feedBackCacheModel.groupId = getGroupId();

		feedBackCacheModel.companyId = getCompanyId();

		feedBackCacheModel.userId = getUserId();

		feedBackCacheModel.userName = getUserName();

		String userName = feedBackCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			feedBackCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			feedBackCacheModel.createDate = createDate.getTime();
		}
		else {
			feedBackCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			feedBackCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			feedBackCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		feedBackCacheModel.status = getStatus();

		feedBackCacheModel.statusByUserId = getStatusByUserId();

		feedBackCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = feedBackCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			feedBackCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			feedBackCacheModel.statusDate = statusDate.getTime();
		}
		else {
			feedBackCacheModel.statusDate = Long.MIN_VALUE;
		}

		feedBackCacheModel.content = getContent();

		String content = feedBackCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			feedBackCacheModel.content = null;
		}

		feedBackCacheModel.type = getType();

		feedBackCacheModel.imgURL = getImgURL();

		String imgURL = feedBackCacheModel.imgURL;

		if ((imgURL != null) && (imgURL.length() == 0)) {
			feedBackCacheModel.imgURL = null;
		}

		return feedBackCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", fbId=");
		sb.append(getFbId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusByUserName=");
		sb.append(getStatusByUserName());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", imgURL=");
		sb.append(getImgURL());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.j2eecn.fb.model.FeedBack");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fbId</column-name><column-value><![CDATA[");
		sb.append(getFbId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imgURL</column-name><column-value><![CDATA[");
		sb.append(getImgURL());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = FeedBack.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			FeedBack.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _fbId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private String _statusByUserName;
	private Date _statusDate;
	private String _content;
	private int _type;
	private int _originalType;
	private boolean _setOriginalType;
	private String _imgURL;
	private long _columnBitmask;
	private FeedBack _escapedModel;
}