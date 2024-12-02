// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rencar.proxies;

public class DeliveryAddress
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject deliveryAddressMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Rencar.DeliveryAddress";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Address("Address"),
		AddressNumber("AddressNumber"),
		Complement("Complement"),
		Neighborhood("Neighborhood"),
		PostalCode("PostalCode"),
		IsStandard("IsStandard"),
		DeliveryAddress_State("Rencar.DeliveryAddress_State"),
		DeliveryAddress_City("Rencar.DeliveryAddress_City"),
		DeliveryAddress_Account("Rencar.DeliveryAddress_Account");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DeliveryAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected DeliveryAddress(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject deliveryAddressMendixObject)
	{
		if (deliveryAddressMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, deliveryAddressMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.deliveryAddressMendixObject = deliveryAddressMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DeliveryAddress.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static rencar.proxies.DeliveryAddress initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return rencar.proxies.DeliveryAddress.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static rencar.proxies.DeliveryAddress initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new rencar.proxies.DeliveryAddress(context, mendixObject);
	}

	public static rencar.proxies.DeliveryAddress load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return rencar.proxies.DeliveryAddress.initialize(context, mendixObject);
	}

	public static java.util.List<rencar.proxies.DeliveryAddress> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> rencar.proxies.DeliveryAddress.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @return value of AddressNumber
	 */
	public final java.lang.Integer getAddressNumber()
	{
		return getAddressNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of AddressNumber
	 */
	public final java.lang.Integer getAddressNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.AddressNumber.toString());
	}

	/**
	 * Set value of AddressNumber
	 * @param addressnumber
	 */
	public final void setAddressNumber(java.lang.Integer addressnumber)
	{
		setAddressNumber(getContext(), addressnumber);
	}

	/**
	 * Set value of AddressNumber
	 * @param context
	 * @param addressnumber
	 */
	public final void setAddressNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer addressnumber)
	{
		getMendixObject().setValue(context, MemberNames.AddressNumber.toString(), addressnumber);
	}

	/**
	 * @return value of Complement
	 */
	public final java.lang.String getComplement()
	{
		return getComplement(getContext());
	}

	/**
	 * @param context
	 * @return value of Complement
	 */
	public final java.lang.String getComplement(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Complement.toString());
	}

	/**
	 * Set value of Complement
	 * @param complement
	 */
	public final void setComplement(java.lang.String complement)
	{
		setComplement(getContext(), complement);
	}

	/**
	 * Set value of Complement
	 * @param context
	 * @param complement
	 */
	public final void setComplement(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String complement)
	{
		getMendixObject().setValue(context, MemberNames.Complement.toString(), complement);
	}

	/**
	 * @return value of Neighborhood
	 */
	public final java.lang.String getNeighborhood()
	{
		return getNeighborhood(getContext());
	}

	/**
	 * @param context
	 * @return value of Neighborhood
	 */
	public final java.lang.String getNeighborhood(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Neighborhood.toString());
	}

	/**
	 * Set value of Neighborhood
	 * @param neighborhood
	 */
	public final void setNeighborhood(java.lang.String neighborhood)
	{
		setNeighborhood(getContext(), neighborhood);
	}

	/**
	 * Set value of Neighborhood
	 * @param context
	 * @param neighborhood
	 */
	public final void setNeighborhood(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String neighborhood)
	{
		getMendixObject().setValue(context, MemberNames.Neighborhood.toString(), neighborhood);
	}

	/**
	 * @return value of PostalCode
	 */
	public final java.lang.String getPostalCode()
	{
		return getPostalCode(getContext());
	}

	/**
	 * @param context
	 * @return value of PostalCode
	 */
	public final java.lang.String getPostalCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PostalCode.toString());
	}

	/**
	 * Set value of PostalCode
	 * @param postalcode
	 */
	public final void setPostalCode(java.lang.String postalcode)
	{
		setPostalCode(getContext(), postalcode);
	}

	/**
	 * Set value of PostalCode
	 * @param context
	 * @param postalcode
	 */
	public final void setPostalCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String postalcode)
	{
		getMendixObject().setValue(context, MemberNames.PostalCode.toString(), postalcode);
	}

	/**
	 * @return value of IsStandard
	 */
	public final java.lang.Boolean getIsStandard()
	{
		return getIsStandard(getContext());
	}

	/**
	 * @param context
	 * @return value of IsStandard
	 */
	public final java.lang.Boolean getIsStandard(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsStandard.toString());
	}

	/**
	 * Set value of IsStandard
	 * @param isstandard
	 */
	public final void setIsStandard(java.lang.Boolean isstandard)
	{
		setIsStandard(getContext(), isstandard);
	}

	/**
	 * Set value of IsStandard
	 * @param context
	 * @param isstandard
	 */
	public final void setIsStandard(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isstandard)
	{
		getMendixObject().setValue(context, MemberNames.IsStandard.toString(), isstandard);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of DeliveryAddress_State
	 */
	public final masterdata.proxies.State getDeliveryAddress_State() throws com.mendix.core.CoreException
	{
		return getDeliveryAddress_State(getContext());
	}

	/**
	 * @param context
	 * @return value of DeliveryAddress_State
	 * @throws com.mendix.core.CoreException
	 */
	public final masterdata.proxies.State getDeliveryAddress_State(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		masterdata.proxies.State result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DeliveryAddress_State.toString());
		if (identifier != null) {
			result = masterdata.proxies.State.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of DeliveryAddress_State
	 * @param deliveryaddress_state
	 */
	public final void setDeliveryAddress_State(masterdata.proxies.State deliveryaddress_state)
	{
		setDeliveryAddress_State(getContext(), deliveryaddress_state);
	}

	/**
	 * Set value of DeliveryAddress_State
	 * @param context
	 * @param deliveryaddress_state
	 */
	public final void setDeliveryAddress_State(com.mendix.systemwideinterfaces.core.IContext context, masterdata.proxies.State deliveryaddress_state)
	{
		if (deliveryaddress_state == null) {
			getMendixObject().setValue(context, MemberNames.DeliveryAddress_State.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.DeliveryAddress_State.toString(), deliveryaddress_state.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of DeliveryAddress_City
	 */
	public final masterdata.proxies.City getDeliveryAddress_City() throws com.mendix.core.CoreException
	{
		return getDeliveryAddress_City(getContext());
	}

	/**
	 * @param context
	 * @return value of DeliveryAddress_City
	 * @throws com.mendix.core.CoreException
	 */
	public final masterdata.proxies.City getDeliveryAddress_City(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		masterdata.proxies.City result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DeliveryAddress_City.toString());
		if (identifier != null) {
			result = masterdata.proxies.City.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of DeliveryAddress_City
	 * @param deliveryaddress_city
	 */
	public final void setDeliveryAddress_City(masterdata.proxies.City deliveryaddress_city)
	{
		setDeliveryAddress_City(getContext(), deliveryaddress_city);
	}

	/**
	 * Set value of DeliveryAddress_City
	 * @param context
	 * @param deliveryaddress_city
	 */
	public final void setDeliveryAddress_City(com.mendix.systemwideinterfaces.core.IContext context, masterdata.proxies.City deliveryaddress_city)
	{
		if (deliveryaddress_city == null) {
			getMendixObject().setValue(context, MemberNames.DeliveryAddress_City.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.DeliveryAddress_City.toString(), deliveryaddress_city.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of DeliveryAddress_Account
	 */
	public final administration.proxies.Account getDeliveryAddress_Account() throws com.mendix.core.CoreException
	{
		return getDeliveryAddress_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of DeliveryAddress_Account
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getDeliveryAddress_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DeliveryAddress_Account.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of DeliveryAddress_Account
	 * @param deliveryaddress_account
	 */
	public final void setDeliveryAddress_Account(administration.proxies.Account deliveryaddress_account)
	{
		setDeliveryAddress_Account(getContext(), deliveryaddress_account);
	}

	/**
	 * Set value of DeliveryAddress_Account
	 * @param context
	 * @param deliveryaddress_account
	 */
	public final void setDeliveryAddress_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account deliveryaddress_account)
	{
		if (deliveryaddress_account == null) {
			getMendixObject().setValue(context, MemberNames.DeliveryAddress_Account.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.DeliveryAddress_Account.toString(), deliveryaddress_account.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return deliveryAddressMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final rencar.proxies.DeliveryAddress that = (rencar.proxies.DeliveryAddress) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}