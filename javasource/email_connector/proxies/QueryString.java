// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package email_connector.proxies;

public class QueryString
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject queryStringMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Email_Connector.QueryString";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Param("Param"),
		QueryString_OAuthProvider("Email_Connector.QueryString_OAuthProvider");

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

	public QueryString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected QueryString(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject queryStringMendixObject)
	{
		if (queryStringMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, queryStringMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.queryStringMendixObject = queryStringMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'QueryString.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static email_connector.proxies.QueryString initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return email_connector.proxies.QueryString.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static email_connector.proxies.QueryString initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new email_connector.proxies.QueryString(context, mendixObject);
	}

	public static email_connector.proxies.QueryString load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return email_connector.proxies.QueryString.initialize(context, mendixObject);
	}

	public static java.util.List<email_connector.proxies.QueryString> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> email_connector.proxies.QueryString.initialize(context, obj))
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
	 * @return value of Param
	 */
	public final java.lang.String getParam()
	{
		return getParam(getContext());
	}

	/**
	 * @param context
	 * @return value of Param
	 */
	public final java.lang.String getParam(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Param.toString());
	}

	/**
	 * Set value of Param
	 * @param param
	 */
	public final void setParam(java.lang.String param)
	{
		setParam(getContext(), param);
	}

	/**
	 * Set value of Param
	 * @param context
	 * @param param
	 */
	public final void setParam(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String param)
	{
		getMendixObject().setValue(context, MemberNames.Param.toString(), param);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of QueryString_OAuthProvider
	 */
	public final email_connector.proxies.OAuthProvider getQueryString_OAuthProvider() throws com.mendix.core.CoreException
	{
		return getQueryString_OAuthProvider(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryString_OAuthProvider
	 * @throws com.mendix.core.CoreException
	 */
	public final email_connector.proxies.OAuthProvider getQueryString_OAuthProvider(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		email_connector.proxies.OAuthProvider result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QueryString_OAuthProvider.toString());
		if (identifier != null) {
			result = email_connector.proxies.OAuthProvider.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of QueryString_OAuthProvider
	 * @param querystring_oauthprovider
	 */
	public final void setQueryString_OAuthProvider(email_connector.proxies.OAuthProvider querystring_oauthprovider)
	{
		setQueryString_OAuthProvider(getContext(), querystring_oauthprovider);
	}

	/**
	 * Set value of QueryString_OAuthProvider
	 * @param context
	 * @param querystring_oauthprovider
	 */
	public final void setQueryString_OAuthProvider(com.mendix.systemwideinterfaces.core.IContext context, email_connector.proxies.OAuthProvider querystring_oauthprovider)
	{
		if (querystring_oauthprovider == null) {
			getMendixObject().setValue(context, MemberNames.QueryString_OAuthProvider.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.QueryString_OAuthProvider.toString(), querystring_oauthprovider.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return queryStringMendixObject;
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
			final email_connector.proxies.QueryString that = (email_connector.proxies.QueryString) obj;
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
