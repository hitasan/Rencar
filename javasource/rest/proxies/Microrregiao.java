// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rest.proxies;

public class Microrregiao
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject microrregiaoMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "REST.Microrregiao";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_id("_id"),
		Nome("Nome"),
		Microrregiao_City("REST.Microrregiao_City"),
		Mesorregiao_Microrregiao("REST.Mesorregiao_Microrregiao");

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

	public Microrregiao(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Microrregiao(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject microrregiaoMendixObject)
	{
		if (microrregiaoMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, microrregiaoMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.microrregiaoMendixObject = microrregiaoMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Microrregiao.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static rest.proxies.Microrregiao initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return rest.proxies.Microrregiao.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static rest.proxies.Microrregiao initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new rest.proxies.Microrregiao(context, mendixObject);
	}

	public static rest.proxies.Microrregiao load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return rest.proxies.Microrregiao.initialize(context, mendixObject);
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
	 * @return value of _id
	 */
	public final java.lang.Integer get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final java.lang.Integer get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(java.lang.Integer _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of Nome
	 */
	public final java.lang.String getNome()
	{
		return getNome(getContext());
	}

	/**
	 * @param context
	 * @return value of Nome
	 */
	public final java.lang.String getNome(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Nome.toString());
	}

	/**
	 * Set value of Nome
	 * @param nome
	 */
	public final void setNome(java.lang.String nome)
	{
		setNome(getContext(), nome);
	}

	/**
	 * Set value of Nome
	 * @param context
	 * @param nome
	 */
	public final void setNome(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nome)
	{
		getMendixObject().setValue(context, MemberNames.Nome.toString(), nome);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Microrregiao_City
	 */
	public final rest.proxies.City getMicrorregiao_City() throws com.mendix.core.CoreException
	{
		return getMicrorregiao_City(getContext());
	}

	/**
	 * @param context
	 * @return value of Microrregiao_City
	 * @throws com.mendix.core.CoreException
	 */
	public final rest.proxies.City getMicrorregiao_City(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		rest.proxies.City result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Microrregiao_City.toString());
		if (identifier != null) {
			result = rest.proxies.City.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Microrregiao_City
	 * @param microrregiao_city
	 */
	public final void setMicrorregiao_City(rest.proxies.City microrregiao_city)
	{
		setMicrorregiao_City(getContext(), microrregiao_city);
	}

	/**
	 * Set value of Microrregiao_City
	 * @param context
	 * @param microrregiao_city
	 */
	public final void setMicrorregiao_City(com.mendix.systemwideinterfaces.core.IContext context, rest.proxies.City microrregiao_city)
	{
		if (microrregiao_city == null) {
			getMendixObject().setValue(context, MemberNames.Microrregiao_City.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Microrregiao_City.toString(), microrregiao_city.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Mesorregiao_Microrregiao
	 */
	public final rest.proxies.Mesorregiao getMesorregiao_Microrregiao() throws com.mendix.core.CoreException
	{
		return getMesorregiao_Microrregiao(getContext());
	}

	/**
	 * @param context
	 * @return value of Mesorregiao_Microrregiao
	 * @throws com.mendix.core.CoreException
	 */
	public final rest.proxies.Mesorregiao getMesorregiao_Microrregiao(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		rest.proxies.Mesorregiao result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Mesorregiao_Microrregiao.toString());
		if (identifier != null) {
			result = rest.proxies.Mesorregiao.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Mesorregiao_Microrregiao
	 * @param mesorregiao_microrregiao
	 */
	public final void setMesorregiao_Microrregiao(rest.proxies.Mesorregiao mesorregiao_microrregiao)
	{
		setMesorregiao_Microrregiao(getContext(), mesorregiao_microrregiao);
	}

	/**
	 * Set value of Mesorregiao_Microrregiao
	 * @param context
	 * @param mesorregiao_microrregiao
	 */
	public final void setMesorregiao_Microrregiao(com.mendix.systemwideinterfaces.core.IContext context, rest.proxies.Mesorregiao mesorregiao_microrregiao)
	{
		if (mesorregiao_microrregiao == null) {
			getMendixObject().setValue(context, MemberNames.Mesorregiao_Microrregiao.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Mesorregiao_Microrregiao.toString(), mesorregiao_microrregiao.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return microrregiaoMendixObject;
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
			final rest.proxies.Microrregiao that = (rest.proxies.Microrregiao) obj;
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
