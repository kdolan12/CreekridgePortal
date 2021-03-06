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

package com.tamarack.creekridge.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VendorMessageLocalService}.
 *
 * @author pmacha
 * @see VendorMessageLocalService
 * @generated
 */
public class VendorMessageLocalServiceWrapper
	implements VendorMessageLocalService,
		ServiceWrapper<VendorMessageLocalService> {
	public VendorMessageLocalServiceWrapper(
		VendorMessageLocalService vendorMessageLocalService) {
		_vendorMessageLocalService = vendorMessageLocalService;
	}

	/**
	* Adds the vendor message to the database. Also notifies the appropriate model listeners.
	*
	* @param vendorMessage the vendor message
	* @return the vendor message that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.tamarack.creekridge.model.VendorMessage addVendorMessage(
		com.tamarack.creekridge.model.VendorMessage vendorMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.addVendorMessage(vendorMessage);
	}

	/**
	* Creates a new vendor message with the primary key. Does not add the vendor message to the database.
	*
	* @param vendorId the primary key for the new vendor message
	* @return the new vendor message
	*/
	@Override
	public com.tamarack.creekridge.model.VendorMessage createVendorMessage(
		long vendorId) {
		return _vendorMessageLocalService.createVendorMessage(vendorId);
	}

	/**
	* Deletes the vendor message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vendorId the primary key of the vendor message
	* @return the vendor message that was removed
	* @throws PortalException if a vendor message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.tamarack.creekridge.model.VendorMessage deleteVendorMessage(
		long vendorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.deleteVendorMessage(vendorId);
	}

	/**
	* Deletes the vendor message from the database. Also notifies the appropriate model listeners.
	*
	* @param vendorMessage the vendor message
	* @return the vendor message that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.tamarack.creekridge.model.VendorMessage deleteVendorMessage(
		com.tamarack.creekridge.model.VendorMessage vendorMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.deleteVendorMessage(vendorMessage);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vendorMessageLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tamarack.creekridge.model.impl.VendorMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tamarack.creekridge.model.impl.VendorMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.tamarack.creekridge.model.VendorMessage fetchVendorMessage(
		long vendorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.fetchVendorMessage(vendorId);
	}

	/**
	* Returns the vendor message with the primary key.
	*
	* @param vendorId the primary key of the vendor message
	* @return the vendor message
	* @throws PortalException if a vendor message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.tamarack.creekridge.model.VendorMessage getVendorMessage(
		long vendorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.getVendorMessage(vendorId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vendor messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tamarack.creekridge.model.impl.VendorMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vendor messages
	* @param end the upper bound of the range of vendor messages (not inclusive)
	* @return the range of vendor messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.tamarack.creekridge.model.VendorMessage> getVendorMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.getVendorMessages(start, end);
	}

	/**
	* Returns the number of vendor messages.
	*
	* @return the number of vendor messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVendorMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.getVendorMessagesCount();
	}

	/**
	* Updates the vendor message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vendorMessage the vendor message
	* @return the vendor message that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.tamarack.creekridge.model.VendorMessage updateVendorMessage(
		com.tamarack.creekridge.model.VendorMessage vendorMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vendorMessageLocalService.updateVendorMessage(vendorMessage);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vendorMessageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vendorMessageLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vendorMessageLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VendorMessageLocalService getWrappedVendorMessageLocalService() {
		return _vendorMessageLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVendorMessageLocalService(
		VendorMessageLocalService vendorMessageLocalService) {
		_vendorMessageLocalService = vendorMessageLocalService;
	}

	@Override
	public VendorMessageLocalService getWrappedService() {
		return _vendorMessageLocalService;
	}

	@Override
	public void setWrappedService(
		VendorMessageLocalService vendorMessageLocalService) {
		_vendorMessageLocalService = vendorMessageLocalService;
	}

	private VendorMessageLocalService _vendorMessageLocalService;
}