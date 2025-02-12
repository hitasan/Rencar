// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administration.proxies;

public class Account extends system.proxies.User
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Administration.Account";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FullName("FullName"),
		Email("Email"),
		IsLocalUser("IsLocalUser"),
		Name("Name"),
		Password("Password"),
		LastLogin("LastLogin"),
		Blocked("Blocked"),
		BlockedSince("BlockedSince"),
		Active("Active"),
		FailedLogins("FailedLogins"),
		WebServiceUser("WebServiceUser"),
		IsAnonymous("IsAnonymous"),
		Activation_Account("Rencar.Activation_Account"),
		UserRoles("System.UserRoles"),
		User_Language("System.User_Language"),
		User_TimeZone("System.User_TimeZone");

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

	public Account(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Account(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject accountMendixObject)
	{
		super(context, accountMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, accountMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'Account.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static administration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return administration.proxies.Account.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static administration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new administration.proxies.Account(context, mendixObject);
	}

	public static administration.proxies.Account load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return administration.proxies.Account.initialize(context, mendixObject);
	}

	public static java.util.List<administration.proxies.Account> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> administration.proxies.Account.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return value of IsLocalUser
	 */
	public final java.lang.Boolean getIsLocalUser()
	{
		return getIsLocalUser(getContext());
	}

	/**
	 * @param context
	 * @return value of IsLocalUser
	 */
	public final java.lang.Boolean getIsLocalUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsLocalUser.toString());
	}

	/**
	 * Set value of IsLocalUser
	 * @param islocaluser
	 */
	public final void setIsLocalUser(java.lang.Boolean islocaluser)
	{
		setIsLocalUser(getContext(), islocaluser);
	}

	/**
	 * Set value of IsLocalUser
	 * @param context
	 * @param islocaluser
	 */
	public final void setIsLocalUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean islocaluser)
	{
		getMendixObject().setValue(context, MemberNames.IsLocalUser.toString(), islocaluser);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Activation_Account
	 */
	public final rencar.proxies.Activation getActivation_Account() throws com.mendix.core.CoreException
	{
		return getActivation_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Activation_Account
	 * @throws com.mendix.core.CoreException
	 */
	public final rencar.proxies.Activation getActivation_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		rencar.proxies.Activation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Activation_Account.toString());
		if (identifier != null) {
			result = rencar.proxies.Activation.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Activation_Account
	 * @param activation_account
	 */
	public final void setActivation_Account(rencar.proxies.Activation activation_account)
	{
		setActivation_Account(getContext(), activation_account);
	}

	/**
	 * Set value of Activation_Account
	 * @param context
	 * @param activation_account
	 */
	public final void setActivation_Account(com.mendix.systemwideinterfaces.core.IContext context, rencar.proxies.Activation activation_account)
	{
		if (activation_account == null) {
			getMendixObject().setValue(context, MemberNames.Activation_Account.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Activation_Account.toString(), activation_account.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final administration.proxies.Account that = (administration.proxies.Account) obj;
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
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
