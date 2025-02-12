// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rencar.proxies;

public class EmailContent
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject emailContentMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Rencar.EmailContent";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		ActivationLink("ActivationLink"),
		Vehicle("Vehicle"),
		Brand("Brand"),
		StartDate("StartDate"),
		EndDate("EndDate"),
		Total("Total");

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

	public EmailContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected EmailContent(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject emailContentMendixObject)
	{
		if (emailContentMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, emailContentMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.emailContentMendixObject = emailContentMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'EmailContent.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static rencar.proxies.EmailContent initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return rencar.proxies.EmailContent.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static rencar.proxies.EmailContent initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new rencar.proxies.EmailContent(context, mendixObject);
	}

	public static rencar.proxies.EmailContent load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return rencar.proxies.EmailContent.initialize(context, mendixObject);
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
	 * @return value of ActivationLink
	 */
	public final java.lang.String getActivationLink()
	{
		return getActivationLink(getContext());
	}

	/**
	 * @param context
	 * @return value of ActivationLink
	 */
	public final java.lang.String getActivationLink(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ActivationLink.toString());
	}

	/**
	 * Set value of ActivationLink
	 * @param activationlink
	 */
	public final void setActivationLink(java.lang.String activationlink)
	{
		setActivationLink(getContext(), activationlink);
	}

	/**
	 * Set value of ActivationLink
	 * @param context
	 * @param activationlink
	 */
	public final void setActivationLink(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String activationlink)
	{
		getMendixObject().setValue(context, MemberNames.ActivationLink.toString(), activationlink);
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
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * @return value of Total
	 */
	public final java.math.BigDecimal getTotal()
	{
		return getTotal(getContext());
	}

	/**
	 * @param context
	 * @return value of Total
	 */
	public final java.math.BigDecimal getTotal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Total.toString());
	}

	/**
	 * Set value of Total
	 * @param total
	 */
	public final void setTotal(java.math.BigDecimal total)
	{
		setTotal(getContext(), total);
	}

	/**
	 * Set value of Total
	 * @param context
	 * @param total
	 */
	public final void setTotal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal total)
	{
		getMendixObject().setValue(context, MemberNames.Total.toString(), total);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return emailContentMendixObject;
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
			final rencar.proxies.EmailContent that = (rencar.proxies.EmailContent) obj;
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
