// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rest.proxies;

public class UF
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject uFMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "REST.UF";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_id("_id"),
		Sigla("Sigla"),
		Nome("Nome"),
		UF_Mesorregiao("REST.UF_Mesorregiao"),
		Regiao_UF("REST.Regiao_UF");

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

	public UF(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected UF(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject uFMendixObject)
	{
		if (uFMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, uFMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.uFMendixObject = uFMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'UF.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static rest.proxies.UF initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return rest.proxies.UF.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static rest.proxies.UF initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new rest.proxies.UF(context, mendixObject);
	}

	public static rest.proxies.UF load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return rest.proxies.UF.initialize(context, mendixObject);
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
	 * @return value of Sigla
	 */
	public final java.lang.String getSigla()
	{
		return getSigla(getContext());
	}

	/**
	 * @param context
	 * @return value of Sigla
	 */
	public final java.lang.String getSigla(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sigla.toString());
	}

	/**
	 * Set value of Sigla
	 * @param sigla
	 */
	public final void setSigla(java.lang.String sigla)
	{
		setSigla(getContext(), sigla);
	}

	/**
	 * Set value of Sigla
	 * @param context
	 * @param sigla
	 */
	public final void setSigla(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sigla)
	{
		getMendixObject().setValue(context, MemberNames.Sigla.toString(), sigla);
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
	 * @return value of UF_Mesorregiao
	 */
	public final rest.proxies.Mesorregiao getUF_Mesorregiao() throws com.mendix.core.CoreException
	{
		return getUF_Mesorregiao(getContext());
	}

	/**
	 * @param context
	 * @return value of UF_Mesorregiao
	 * @throws com.mendix.core.CoreException
	 */
	public final rest.proxies.Mesorregiao getUF_Mesorregiao(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		rest.proxies.Mesorregiao result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.UF_Mesorregiao.toString());
		if (identifier != null) {
			result = rest.proxies.Mesorregiao.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of UF_Mesorregiao
	 * @param uf_mesorregiao
	 */
	public final void setUF_Mesorregiao(rest.proxies.Mesorregiao uf_mesorregiao)
	{
		setUF_Mesorregiao(getContext(), uf_mesorregiao);
	}

	/**
	 * Set value of UF_Mesorregiao
	 * @param context
	 * @param uf_mesorregiao
	 */
	public final void setUF_Mesorregiao(com.mendix.systemwideinterfaces.core.IContext context, rest.proxies.Mesorregiao uf_mesorregiao)
	{
		if (uf_mesorregiao == null) {
			getMendixObject().setValue(context, MemberNames.UF_Mesorregiao.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.UF_Mesorregiao.toString(), uf_mesorregiao.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Regiao_UF
	 */
	public final rest.proxies.Regiao getRegiao_UF() throws com.mendix.core.CoreException
	{
		return getRegiao_UF(getContext());
	}

	/**
	 * @param context
	 * @return value of Regiao_UF
	 * @throws com.mendix.core.CoreException
	 */
	public final rest.proxies.Regiao getRegiao_UF(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		rest.proxies.Regiao result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Regiao_UF.toString());
		if (identifier != null) {
			result = rest.proxies.Regiao.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Regiao_UF
	 * @param regiao_uf
	 */
	public final void setRegiao_UF(rest.proxies.Regiao regiao_uf)
	{
		setRegiao_UF(getContext(), regiao_uf);
	}

	/**
	 * Set value of Regiao_UF
	 * @param context
	 * @param regiao_uf
	 */
	public final void setRegiao_UF(com.mendix.systemwideinterfaces.core.IContext context, rest.proxies.Regiao regiao_uf)
	{
		if (regiao_uf == null) {
			getMendixObject().setValue(context, MemberNames.Regiao_UF.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Regiao_UF.toString(), regiao_uf.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return uFMendixObject;
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
			final rest.proxies.UF that = (rest.proxies.UF) obj;
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