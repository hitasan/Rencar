// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package masterdata.proxies;

public class Vehicle
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject vehicleMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MasterData.Vehicle";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		ManufacturingDate("ManufacturingDate"),
		Color("Color"),
		DailyPrice("DailyPrice"),
		IsEletric("IsEletric"),
		Vehicle_Brand("MasterData.Vehicle_Brand"),
		VehiclePicture_Vehicle("MasterData.VehiclePicture_Vehicle");

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

	public Vehicle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Vehicle(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vehicleMendixObject)
	{
		if (vehicleMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, vehicleMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.vehicleMendixObject = vehicleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Vehicle.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static masterdata.proxies.Vehicle initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return masterdata.proxies.Vehicle.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static masterdata.proxies.Vehicle initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("MasterData.Motorcycle", mendixObject.getType())) {
			return masterdata.proxies.Motorcycle.initialize(context, mendixObject);
		}
		return new masterdata.proxies.Vehicle(context, mendixObject);
	}

	public static masterdata.proxies.Vehicle load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return masterdata.proxies.Vehicle.initialize(context, mendixObject);
	}

	public static java.util.List<? extends masterdata.proxies.Vehicle> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> masterdata.proxies.Vehicle.initialize(context, obj))
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
	 * @throws com.mendix.core.CoreException
	 * @return value of Vehicle_Brand
	 */
	public final masterdata.proxies.Brand getVehicle_Brand() throws com.mendix.core.CoreException
	{
		return getVehicle_Brand(getContext());
	}

	/**
	 * @param context
	 * @return value of Vehicle_Brand
	 * @throws com.mendix.core.CoreException
	 */
	public final masterdata.proxies.Brand getVehicle_Brand(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		masterdata.proxies.Brand result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Vehicle_Brand.toString());
		if (identifier != null) {
			result = masterdata.proxies.Brand.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Vehicle_Brand
	 * @param vehicle_brand
	 */
	public final void setVehicle_Brand(masterdata.proxies.Brand vehicle_brand)
	{
		setVehicle_Brand(getContext(), vehicle_brand);
	}

	/**
	 * Set value of Vehicle_Brand
	 * @param context
	 * @param vehicle_brand
	 */
	public final void setVehicle_Brand(com.mendix.systemwideinterfaces.core.IContext context, masterdata.proxies.Brand vehicle_brand)
	{
		if (vehicle_brand == null) {
			getMendixObject().setValue(context, MemberNames.Vehicle_Brand.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Vehicle_Brand.toString(), vehicle_brand.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of VehiclePicture_Vehicle
	 */
	public final masterdata.proxies.VehiclePicture getVehiclePicture_Vehicle() throws com.mendix.core.CoreException
	{
		return getVehiclePicture_Vehicle(getContext());
	}

	/**
	 * @param context
	 * @return value of VehiclePicture_Vehicle
	 * @throws com.mendix.core.CoreException
	 */
	public final masterdata.proxies.VehiclePicture getVehiclePicture_Vehicle(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		masterdata.proxies.VehiclePicture result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.VehiclePicture_Vehicle.toString());
		if (identifier != null) {
			result = masterdata.proxies.VehiclePicture.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of VehiclePicture_Vehicle
	 * @param vehiclepicture_vehicle
	 */
	public final void setVehiclePicture_Vehicle(masterdata.proxies.VehiclePicture vehiclepicture_vehicle)
	{
		setVehiclePicture_Vehicle(getContext(), vehiclepicture_vehicle);
	}

	/**
	 * Set value of VehiclePicture_Vehicle
	 * @param context
	 * @param vehiclepicture_vehicle
	 */
	public final void setVehiclePicture_Vehicle(com.mendix.systemwideinterfaces.core.IContext context, masterdata.proxies.VehiclePicture vehiclepicture_vehicle)
	{
		if (vehiclepicture_vehicle == null) {
			getMendixObject().setValue(context, MemberNames.VehiclePicture_Vehicle.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.VehiclePicture_Vehicle.toString(), vehiclepicture_vehicle.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return vehicleMendixObject;
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
			final masterdata.proxies.Vehicle that = (masterdata.proxies.Vehicle) obj;
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
