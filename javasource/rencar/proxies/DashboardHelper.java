// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rencar.proxies;

public class DashboardHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dashboardHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Rencar.DashboardHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FilterDate("FilterDate"),
		Completed("Completed"),
		Running("Running"),
		Reserved("Reserved"),
		CurrentValue("CurrentValue"),
		MinimumValue("MinimumValue"),
		MaximumValue("MaximumValue");

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

	public DashboardHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected DashboardHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dashboardHelperMendixObject)
	{
		if (dashboardHelperMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, dashboardHelperMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.dashboardHelperMendixObject = dashboardHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DashboardHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static rencar.proxies.DashboardHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return rencar.proxies.DashboardHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static rencar.proxies.DashboardHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new rencar.proxies.DashboardHelper(context, mendixObject);
	}

	public static rencar.proxies.DashboardHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return rencar.proxies.DashboardHelper.initialize(context, mendixObject);
	}

	public static java.util.List<rencar.proxies.DashboardHelper> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> rencar.proxies.DashboardHelper.initialize(context, obj))
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
	 * @return value of FilterDate
	 */
	public final java.util.Date getFilterDate()
	{
		return getFilterDate(getContext());
	}

	/**
	 * @param context
	 * @return value of FilterDate
	 */
	public final java.util.Date getFilterDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.FilterDate.toString());
	}

	/**
	 * Set value of FilterDate
	 * @param filterdate
	 */
	public final void setFilterDate(java.util.Date filterdate)
	{
		setFilterDate(getContext(), filterdate);
	}

	/**
	 * Set value of FilterDate
	 * @param context
	 * @param filterdate
	 */
	public final void setFilterDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date filterdate)
	{
		getMendixObject().setValue(context, MemberNames.FilterDate.toString(), filterdate);
	}

	/**
	 * @return value of Completed
	 */
	public final java.lang.Integer getCompleted()
	{
		return getCompleted(getContext());
	}

	/**
	 * @param context
	 * @return value of Completed
	 */
	public final java.lang.Integer getCompleted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Completed.toString());
	}

	/**
	 * Set value of Completed
	 * @param completed
	 */
	public final void setCompleted(java.lang.Integer completed)
	{
		setCompleted(getContext(), completed);
	}

	/**
	 * Set value of Completed
	 * @param context
	 * @param completed
	 */
	public final void setCompleted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer completed)
	{
		getMendixObject().setValue(context, MemberNames.Completed.toString(), completed);
	}

	/**
	 * @return value of Running
	 */
	public final java.lang.Integer getRunning()
	{
		return getRunning(getContext());
	}

	/**
	 * @param context
	 * @return value of Running
	 */
	public final java.lang.Integer getRunning(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Running.toString());
	}

	/**
	 * Set value of Running
	 * @param running
	 */
	public final void setRunning(java.lang.Integer running)
	{
		setRunning(getContext(), running);
	}

	/**
	 * Set value of Running
	 * @param context
	 * @param running
	 */
	public final void setRunning(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer running)
	{
		getMendixObject().setValue(context, MemberNames.Running.toString(), running);
	}

	/**
	 * @return value of Reserved
	 */
	public final java.lang.Integer getReserved()
	{
		return getReserved(getContext());
	}

	/**
	 * @param context
	 * @return value of Reserved
	 */
	public final java.lang.Integer getReserved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Reserved.toString());
	}

	/**
	 * Set value of Reserved
	 * @param reserved
	 */
	public final void setReserved(java.lang.Integer reserved)
	{
		setReserved(getContext(), reserved);
	}

	/**
	 * Set value of Reserved
	 * @param context
	 * @param reserved
	 */
	public final void setReserved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer reserved)
	{
		getMendixObject().setValue(context, MemberNames.Reserved.toString(), reserved);
	}

	/**
	 * @return value of CurrentValue
	 */
	public final java.lang.Integer getCurrentValue()
	{
		return getCurrentValue(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentValue
	 */
	public final java.lang.Integer getCurrentValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.CurrentValue.toString());
	}

	/**
	 * Set value of CurrentValue
	 * @param currentvalue
	 */
	public final void setCurrentValue(java.lang.Integer currentvalue)
	{
		setCurrentValue(getContext(), currentvalue);
	}

	/**
	 * Set value of CurrentValue
	 * @param context
	 * @param currentvalue
	 */
	public final void setCurrentValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer currentvalue)
	{
		getMendixObject().setValue(context, MemberNames.CurrentValue.toString(), currentvalue);
	}

	/**
	 * @return value of MinimumValue
	 */
	public final java.lang.Integer getMinimumValue()
	{
		return getMinimumValue(getContext());
	}

	/**
	 * @param context
	 * @return value of MinimumValue
	 */
	public final java.lang.Integer getMinimumValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MinimumValue.toString());
	}

	/**
	 * Set value of MinimumValue
	 * @param minimumvalue
	 */
	public final void setMinimumValue(java.lang.Integer minimumvalue)
	{
		setMinimumValue(getContext(), minimumvalue);
	}

	/**
	 * Set value of MinimumValue
	 * @param context
	 * @param minimumvalue
	 */
	public final void setMinimumValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer minimumvalue)
	{
		getMendixObject().setValue(context, MemberNames.MinimumValue.toString(), minimumvalue);
	}

	/**
	 * @return value of MaximumValue
	 */
	public final java.lang.Integer getMaximumValue()
	{
		return getMaximumValue(getContext());
	}

	/**
	 * @param context
	 * @return value of MaximumValue
	 */
	public final java.lang.Integer getMaximumValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaximumValue.toString());
	}

	/**
	 * Set value of MaximumValue
	 * @param maximumvalue
	 */
	public final void setMaximumValue(java.lang.Integer maximumvalue)
	{
		setMaximumValue(getContext(), maximumvalue);
	}

	/**
	 * Set value of MaximumValue
	 * @param context
	 * @param maximumvalue
	 */
	public final void setMaximumValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maximumvalue)
	{
		getMendixObject().setValue(context, MemberNames.MaximumValue.toString(), maximumvalue);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dashboardHelperMendixObject;
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
			final rencar.proxies.DashboardHelper that = (rencar.proxies.DashboardHelper) obj;
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
