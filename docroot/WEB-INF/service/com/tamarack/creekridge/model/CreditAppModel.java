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

package com.tamarack.creekridge.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CreditApp service. Represents a row in the &quot;eCreekRidge_CreditApp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.tamarack.creekridge.model.impl.CreditAppModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.tamarack.creekridge.model.impl.CreditAppImpl}.
 * </p>
 *
 * @author pmacha
 * @see CreditApp
 * @see com.tamarack.creekridge.model.impl.CreditAppImpl
 * @see com.tamarack.creekridge.model.impl.CreditAppModelImpl
 * @generated
 */
public interface CreditAppModel extends AuditedModel, BaseModel<CreditApp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a credit app model instance should use the {@link CreditApp} interface instead.
	 */

	/**
	 * Returns the primary key of this credit app.
	 *
	 * @return the primary key of this credit app
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this credit app.
	 *
	 * @param primaryKey the primary key of this credit app
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the credit app ID of this credit app.
	 *
	 * @return the credit app ID of this credit app
	 */
	public long getCreditAppId();

	/**
	 * Sets the credit app ID of this credit app.
	 *
	 * @param creditAppId the credit app ID of this credit app
	 */
	public void setCreditAppId(long creditAppId);

	/**
	 * Returns the company ID of this credit app.
	 *
	 * @return the company ID of this credit app
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this credit app.
	 *
	 * @param companyId the company ID of this credit app
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this credit app.
	 *
	 * @return the user ID of this credit app
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this credit app.
	 *
	 * @param userId the user ID of this credit app
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this credit app.
	 *
	 * @return the user uuid of this credit app
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this credit app.
	 *
	 * @param userUuid the user uuid of this credit app
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this credit app.
	 *
	 * @return the user name of this credit app
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this credit app.
	 *
	 * @param userName the user name of this credit app
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this credit app.
	 *
	 * @return the create date of this credit app
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this credit app.
	 *
	 * @param createDate the create date of this credit app
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this credit app.
	 *
	 * @return the modified date of this credit app
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this credit app.
	 *
	 * @param modifiedDate the modified date of this credit app
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the vendor ID of this credit app.
	 *
	 * @return the vendor ID of this credit app
	 */
	public long getVendorId();

	/**
	 * Sets the vendor ID of this credit app.
	 *
	 * @param vendorId the vendor ID of this credit app
	 */
	public void setVendorId(long vendorId);

	/**
	 * Returns the credit app status ID of this credit app.
	 *
	 * @return the credit app status ID of this credit app
	 */
	public long getCreditAppStatusId();

	/**
	 * Sets the credit app status ID of this credit app.
	 *
	 * @param creditAppStatusId the credit app status ID of this credit app
	 */
	public void setCreditAppStatusId(long creditAppStatusId);

	/**
	 * Returns the product ID of this credit app.
	 *
	 * @return the product ID of this credit app
	 */
	public long getProductId();

	/**
	 * Sets the product ID of this credit app.
	 *
	 * @param productId the product ID of this credit app
	 */
	public void setProductId(long productId);

	/**
	 * Returns the term ID of this credit app.
	 *
	 * @return the term ID of this credit app
	 */
	public long getTermId();

	/**
	 * Sets the term ID of this credit app.
	 *
	 * @param termId the term ID of this credit app
	 */
	public void setTermId(long termId);

	/**
	 * Returns the purchase option ID of this credit app.
	 *
	 * @return the purchase option ID of this credit app
	 */
	public long getPurchaseOptionId();

	/**
	 * Sets the purchase option ID of this credit app.
	 *
	 * @param purchaseOptionId the purchase option ID of this credit app
	 */
	public void setPurchaseOptionId(long purchaseOptionId);

	/**
	 * Returns the rate factor rule ID of this credit app.
	 *
	 * @return the rate factor rule ID of this credit app
	 */
	public long getRateFactorRuleId();

	/**
	 * Sets the rate factor rule ID of this credit app.
	 *
	 * @param rateFactorRuleId the rate factor rule ID of this credit app
	 */
	public void setRateFactorRuleId(long rateFactorRuleId);

	/**
	 * Returns the payment amount of this credit app.
	 *
	 * @return the payment amount of this credit app
	 */
	public double getPaymentAmount();

	/**
	 * Sets the payment amount of this credit app.
	 *
	 * @param paymentAmount the payment amount of this credit app
	 */
	public void setPaymentAmount(double paymentAmount);

	/**
	 * Returns the equipment price of this credit app.
	 *
	 * @return the equipment price of this credit app
	 */
	public double getEquipmentPrice();

	/**
	 * Sets the equipment price of this credit app.
	 *
	 * @param equipmentPrice the equipment price of this credit app
	 */
	public void setEquipmentPrice(double equipmentPrice);

	/**
	 * Returns the equipment desc of this credit app.
	 *
	 * @return the equipment desc of this credit app
	 */
	@AutoEscape
	public String getEquipmentDesc();

	/**
	 * Sets the equipment desc of this credit app.
	 *
	 * @param equipmentDesc the equipment desc of this credit app
	 */
	public void setEquipmentDesc(String equipmentDesc);

	/**
	 * Returns the equipment loc as customer flag of this credit app.
	 *
	 * @return the equipment loc as customer flag of this credit app
	 */
	public boolean getEquipmentLocAsCustomerFlag();

	/**
	 * Returns <code>true</code> if this credit app is equipment loc as customer flag.
	 *
	 * @return <code>true</code> if this credit app is equipment loc as customer flag; <code>false</code> otherwise
	 */
	public boolean isEquipmentLocAsCustomerFlag();

	/**
	 * Sets whether this credit app is equipment loc as customer flag.
	 *
	 * @param equipmentLocAsCustomerFlag the equipment loc as customer flag of this credit app
	 */
	public void setEquipmentLocAsCustomerFlag(
		boolean equipmentLocAsCustomerFlag);

	/**
	 * Returns the equipment address1 of this credit app.
	 *
	 * @return the equipment address1 of this credit app
	 */
	@AutoEscape
	public String getEquipmentAddress1();

	/**
	 * Sets the equipment address1 of this credit app.
	 *
	 * @param equipmentAddress1 the equipment address1 of this credit app
	 */
	public void setEquipmentAddress1(String equipmentAddress1);

	/**
	 * Returns the equipment address2 of this credit app.
	 *
	 * @return the equipment address2 of this credit app
	 */
	@AutoEscape
	public String getEquipmentAddress2();

	/**
	 * Sets the equipment address2 of this credit app.
	 *
	 * @param equipmentAddress2 the equipment address2 of this credit app
	 */
	public void setEquipmentAddress2(String equipmentAddress2);

	/**
	 * Returns the equipment city of this credit app.
	 *
	 * @return the equipment city of this credit app
	 */
	@AutoEscape
	public String getEquipmentCity();

	/**
	 * Sets the equipment city of this credit app.
	 *
	 * @param equipmentCity the equipment city of this credit app
	 */
	public void setEquipmentCity(String equipmentCity);

	/**
	 * Returns the equipment state of this credit app.
	 *
	 * @return the equipment state of this credit app
	 */
	@AutoEscape
	public String getEquipmentState();

	/**
	 * Sets the equipment state of this credit app.
	 *
	 * @param equipmentState the equipment state of this credit app
	 */
	public void setEquipmentState(String equipmentState);

	/**
	 * Returns the equipment zip of this credit app.
	 *
	 * @return the equipment zip of this credit app
	 */
	@AutoEscape
	public String getEquipmentZip();

	/**
	 * Sets the equipment zip of this credit app.
	 *
	 * @param equipmentZip the equipment zip of this credit app
	 */
	public void setEquipmentZip(String equipmentZip);

	/**
	 * Returns the customer name of this credit app.
	 *
	 * @return the customer name of this credit app
	 */
	@AutoEscape
	public String getCustomerName();

	/**
	 * Sets the customer name of this credit app.
	 *
	 * @param CustomerName the customer name of this credit app
	 */
	public void setCustomerName(String CustomerName);

	/**
	 * Returns the customer d b a name of this credit app.
	 *
	 * @return the customer d b a name of this credit app
	 */
	@AutoEscape
	public String getCustomerDBAName();

	/**
	 * Sets the customer d b a name of this credit app.
	 *
	 * @param CustomerDBAName the customer d b a name of this credit app
	 */
	public void setCustomerDBAName(String CustomerDBAName);

	/**
	 * Returns the customer address1 of this credit app.
	 *
	 * @return the customer address1 of this credit app
	 */
	@AutoEscape
	public String getCustomerAddress1();

	/**
	 * Sets the customer address1 of this credit app.
	 *
	 * @param CustomerAddress1 the customer address1 of this credit app
	 */
	public void setCustomerAddress1(String CustomerAddress1);

	/**
	 * Returns the customer address2 of this credit app.
	 *
	 * @return the customer address2 of this credit app
	 */
	@AutoEscape
	public String getCustomerAddress2();

	/**
	 * Sets the customer address2 of this credit app.
	 *
	 * @param CustomerAddress2 the customer address2 of this credit app
	 */
	public void setCustomerAddress2(String CustomerAddress2);

	/**
	 * Returns the customer city of this credit app.
	 *
	 * @return the customer city of this credit app
	 */
	@AutoEscape
	public String getCustomerCity();

	/**
	 * Sets the customer city of this credit app.
	 *
	 * @param CustomerCity the customer city of this credit app
	 */
	public void setCustomerCity(String CustomerCity);

	/**
	 * Returns the customer state of this credit app.
	 *
	 * @return the customer state of this credit app
	 */
	@AutoEscape
	public String getCustomerState();

	/**
	 * Sets the customer state of this credit app.
	 *
	 * @param CustomerState the customer state of this credit app
	 */
	public void setCustomerState(String CustomerState);

	/**
	 * Returns the customer zip of this credit app.
	 *
	 * @return the customer zip of this credit app
	 */
	@AutoEscape
	public String getCustomerZip();

	/**
	 * Sets the customer zip of this credit app.
	 *
	 * @param CustomerZip the customer zip of this credit app
	 */
	public void setCustomerZip(String CustomerZip);

	/**
	 * Returns the customer contact of this credit app.
	 *
	 * @return the customer contact of this credit app
	 */
	@AutoEscape
	public String getCustomerContact();

	/**
	 * Sets the customer contact of this credit app.
	 *
	 * @param CustomerContact the customer contact of this credit app
	 */
	public void setCustomerContact(String CustomerContact);

	/**
	 * Returns the customer contact phone of this credit app.
	 *
	 * @return the customer contact phone of this credit app
	 */
	@AutoEscape
	public String getCustomerContactPhone();

	/**
	 * Sets the customer contact phone of this credit app.
	 *
	 * @param CustomerContactPhone the customer contact phone of this credit app
	 */
	public void setCustomerContactPhone(String CustomerContactPhone);

	/**
	 * Returns the customer contact fax of this credit app.
	 *
	 * @return the customer contact fax of this credit app
	 */
	@AutoEscape
	public String getCustomerContactFax();

	/**
	 * Sets the customer contact fax of this credit app.
	 *
	 * @param CustomerContactFax the customer contact fax of this credit app
	 */
	public void setCustomerContactFax(String CustomerContactFax);

	/**
	 * Returns the customer contact email of this credit app.
	 *
	 * @return the customer contact email of this credit app
	 */
	@AutoEscape
	public String getCustomerContactEmail();

	/**
	 * Sets the customer contact email of this credit app.
	 *
	 * @param CustomerContactEmail the customer contact email of this credit app
	 */
	public void setCustomerContactEmail(String CustomerContactEmail);

	/**
	 * Returns the customer business desc of this credit app.
	 *
	 * @return the customer business desc of this credit app
	 */
	@AutoEscape
	public String getCustomerBusinessDesc();

	/**
	 * Sets the customer business desc of this credit app.
	 *
	 * @param CustomerBusinessDesc the customer business desc of this credit app
	 */
	public void setCustomerBusinessDesc(String CustomerBusinessDesc);

	/**
	 * Returns the customer business type of this credit app.
	 *
	 * @return the customer business type of this credit app
	 */
	@AutoEscape
	public String getCustomerBusinessType();

	/**
	 * Sets the customer business type of this credit app.
	 *
	 * @param CustomerBusinessType the customer business type of this credit app
	 */
	public void setCustomerBusinessType(String CustomerBusinessType);

	/**
	 * Returns the customer business start date of this credit app.
	 *
	 * @return the customer business start date of this credit app
	 */
	public Date getCustomerBusinessStartDate();

	/**
	 * Sets the customer business start date of this credit app.
	 *
	 * @param CustomerBusinessStartDate the customer business start date of this credit app
	 */
	public void setCustomerBusinessStartDate(Date CustomerBusinessStartDate);

	/**
	 * Returns the customer business incorporated state of this credit app.
	 *
	 * @return the customer business incorporated state of this credit app
	 */
	@AutoEscape
	public String getCustomerBusinessIncorporatedState();

	/**
	 * Sets the customer business incorporated state of this credit app.
	 *
	 * @param CustomerBusinessIncorporatedState the customer business incorporated state of this credit app
	 */
	public void setCustomerBusinessIncorporatedState(
		String CustomerBusinessIncorporatedState);

	/**
	 * Returns the customer business federal tax i d of this credit app.
	 *
	 * @return the customer business federal tax i d of this credit app
	 */
	@AutoEscape
	public String getCustomerBusinessFederalTaxID();

	/**
	 * Sets the customer business federal tax i d of this credit app.
	 *
	 * @param CustomerBusinessFederalTaxID the customer business federal tax i d of this credit app
	 */
	public void setCustomerBusinessFederalTaxID(
		String CustomerBusinessFederalTaxID);

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
	public int compareTo(CreditApp creditApp);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CreditApp> toCacheModel();

	@Override
	public CreditApp toEscapedModel();

	@Override
	public CreditApp toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}