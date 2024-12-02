// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rest.proxies;

public class Root
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "REST.Root";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Brand("Brand"),
		Vehicle("Vehicle"),
		ManufacturingDate("ManufacturingDate"),
		Color("Color"),
		DailyPrice("DailyPrice"),
		IsEletric("IsEletric");

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

	public Root(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Root(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject)
	{
		if (rootMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, rootMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.rootMendixObject = rootMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Root.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static rest.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return rest.proxies.Root.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static rest.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new rest.proxies.Root(context, mendixObject);
	}

	public static rest.proxies.Root load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return rest.proxies.Root.initialize(context, mendixObject);
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
	 * @return value of Brand
	 */
	public final java.lang.String getBrand()
	{
		return getBrand(getContext());
	}

	/**
	 * @param context
	 * @return value of Brand
	 */
	public final java.lang.String getBrand(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Brand.toString());
	}

	/**
	 * Set value of Brand
	 * @param brand
	 */
	public final void setBrand(java.lang.String brand)
	{
		setBrand(getContext(), brand);
	}

	/**
	 * Set value of Brand
	 * @param context
	 * @param brand
	 */
	public final void setBrand(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String brand)
	{
		getMendixObject().setValue(context, MemberNames.Brand.toString(), brand);
	}

	/**
	 * @return value of Vehicle
	 */
	public final java.lang.String getVehicle()
	{
		return getVehicle(getContext());
	}

	/**
	 * @param context
	 * @return value of Vehicle
	 */
	public final java.lang.String getVehicle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Vehicle.toString());
	}

	/**
	 * Set value of Vehicle
	 * @param vehicle
	 */
	public final void setVehicle(java.lang.String vehicle)
	{
		setVehicle(getContext(), vehicle);
	}

	/**
	 * Set value of Vehicle
	 * @param context
	 * @param vehicle
	 */
	public final void setVehicle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String vehicle)
	{
		getMendixObject().setValue(context, MemberNames.Vehicle.toString(), vehicle);
	}

	/**
	 * @return value of ManufacturingDate
	 */
	public final java.util.Date getManufacturingDate()
	{
		return getManufacturingDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ManufacturingDate
	 */
	public final java.util.Date getManufacturingDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ManufacturingDate.toString());
	}

	/**
	 * Set value of ManufacturingDate
	 * @param manufacturingdate
	 */
	public final void setManufacturingDate(java.util.Date manufacturingdate)
	{
		setManufacturingDate(getContext(), manufacturingdate);
	}

	/**
	 * Set value of ManufacturingDate
	 * @param context
	 * @param manufacturingdate
	 */
	public final void setManufacturingDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date manufacturingdate)
	{
		getMendixObject().setValue(context, MemberNames.ManufacturingDate.toString(), manufacturingdate);
	}

	/**
	 * Set value of Color
	 * @param color
	 */
	public final masterdata.proxies.ENUM_Colors getColor()
	{
		return getColor(getContext());
	}

	/**
	 * @param context
	 * @return value of Color
	 */
	public final masterdata.proxies.ENUM_Colors getColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Color.toString());
		if (obj == null) {
			return null;
		}
		return masterdata.proxies.ENUM_Colors.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Color
	 * @param color
	 */
	public final void setColor(masterdata.proxies.ENUM_Colors color)
	{
		setColor(getContext(), color);
	}

	/**
	 * Set value of Color
	 * @param context
	 * @param color
	 */
	public final void setColor(com.mendix.systemwideinterfaces.core.IContext context, masterdata.proxies.ENUM_Colors color)
	{
		if (color != null) {
			getMendixObject().setValue(context, MemberNames.Color.toString(), color.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Color.toString(), null);
		}
	}

	/**
	 * @return value of DailyPrice
	 */
	public final java.math.BigDecimal getDailyPrice()
	{
		return getDailyPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of DailyPrice
	 */
	public final java.math.BigDecimal getDailyPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.DailyPrice.toString());
	}

	/**
	 * Set value of DailyPrice
	 * @param dailyprice
	 */
	public final void setDailyPrice(java.math.BigDecimal dailyprice)
	{
		setDailyPrice(getContext(), dailyprice);
	}

	/**
	 * Set value of DailyPrice
	 * @param context
	 * @param dailyprice
	 */
	public final void setDailyPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal dailyprice)
	{
		getMendixObject().setValue(context, MemberNames.DailyPrice.toString(), dailyprice);
	}

	/**
	 * @return value of IsEletric
	 */
	public final java.lang.Boolean getIsEletric()
	{
		return getIsEletric(getContext());
	}

	/**
	 * @param context
	 * @return value of IsEletric
	 */
	public final java.lang.Boolean getIsEletric(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsEletric.toString());
	}

	/**
	 * Set value of IsEletric
	 * @param iseletric
	 */
	public final void setIsEletric(java.lang.Boolean iseletric)
	{
		setIsEletric(getContext(), iseletric);
	}

	/**
	 * Set value of IsEletric
	 * @param context
	 * @param iseletric
	 */
	public final void setIsEletric(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean iseletric)
	{
		getMendixObject().setValue(context, MemberNames.IsEletric.toString(), iseletric);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return rootMendixObject;
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
			final rest.proxies.Root that = (rest.proxies.Root) obj;
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