// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package email_connector.proxies;

public class IncomingServer
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject incomingServerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Email_Connector.IncomingServer";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HostName("HostName"),
		Port("Port"),
		SocketType("SocketType"),
		IncomingProtocol("IncomingProtocol"),
		ReceiveIMAPS("ReceiveIMAPS"),
		ReceivePOP3S("ReceivePOP3S"),
		SelectedIncomingServer("SelectedIncomingServer"),
		IncomingServer_EmailProvider("Email_Connector.IncomingServer_EmailProvider");

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

	public IncomingServer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected IncomingServer(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject incomingServerMendixObject)
	{
		if (incomingServerMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, incomingServerMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.incomingServerMendixObject = incomingServerMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'IncomingServer.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static email_connector.proxies.IncomingServer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return email_connector.proxies.IncomingServer.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static email_connector.proxies.IncomingServer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new email_connector.proxies.IncomingServer(context, mendixObject);
	}

	public static email_connector.proxies.IncomingServer load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return email_connector.proxies.IncomingServer.initialize(context, mendixObject);
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
	 * @return value of HostName
	 */
	public final java.lang.String getHostName()
	{
		return getHostName(getContext());
	}

	/**
	 * @param context
	 * @return value of HostName
	 */
	public final java.lang.String getHostName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HostName.toString());
	}

	/**
	 * Set value of HostName
	 * @param hostname
	 */
	public final void setHostName(java.lang.String hostname)
	{
		setHostName(getContext(), hostname);
	}

	/**
	 * Set value of HostName
	 * @param context
	 * @param hostname
	 */
	public final void setHostName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hostname)
	{
		getMendixObject().setValue(context, MemberNames.HostName.toString(), hostname);
	}

	/**
	 * @return value of Port
	 */
	public final java.lang.Integer getPort()
	{
		return getPort(getContext());
	}

	/**
	 * @param context
	 * @return value of Port
	 */
	public final java.lang.Integer getPort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Port.toString());
	}

	/**
	 * Set value of Port
	 * @param port
	 */
	public final void setPort(java.lang.Integer port)
	{
		setPort(getContext(), port);
	}

	/**
	 * Set value of Port
	 * @param context
	 * @param port
	 */
	public final void setPort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer port)
	{
		getMendixObject().setValue(context, MemberNames.Port.toString(), port);
	}

	/**
	 * @return value of SocketType
	 */
	public final java.lang.String getSocketType()
	{
		return getSocketType(getContext());
	}

	/**
	 * @param context
	 * @return value of SocketType
	 */
	public final java.lang.String getSocketType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SocketType.toString());
	}

	/**
	 * Set value of SocketType
	 * @param sockettype
	 */
	public final void setSocketType(java.lang.String sockettype)
	{
		setSocketType(getContext(), sockettype);
	}

	/**
	 * Set value of SocketType
	 * @param context
	 * @param sockettype
	 */
	public final void setSocketType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sockettype)
	{
		getMendixObject().setValue(context, MemberNames.SocketType.toString(), sockettype);
	}

	/**
	 * Set value of IncomingProtocol
	 * @param incomingprotocol
	 */
	public final email_connector.proxies.ENUM_IncomingProtocol getIncomingProtocol()
	{
		return getIncomingProtocol(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingProtocol
	 */
	public final email_connector.proxies.ENUM_IncomingProtocol getIncomingProtocol(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.IncomingProtocol.toString());
		if (obj == null) {
			return null;
		}
		return email_connector.proxies.ENUM_IncomingProtocol.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of IncomingProtocol
	 * @param incomingprotocol
	 */
	public final void setIncomingProtocol(email_connector.proxies.ENUM_IncomingProtocol incomingprotocol)
	{
		setIncomingProtocol(getContext(), incomingprotocol);
	}

	/**
	 * Set value of IncomingProtocol
	 * @param context
	 * @param incomingprotocol
	 */
	public final void setIncomingProtocol(com.mendix.systemwideinterfaces.core.IContext context, email_connector.proxies.ENUM_IncomingProtocol incomingprotocol)
	{
		if (incomingprotocol != null) {
			getMendixObject().setValue(context, MemberNames.IncomingProtocol.toString(), incomingprotocol.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.IncomingProtocol.toString(), null);
		}
	}

	/**
	 * @return value of ReceiveIMAPS
	 */
	public final java.lang.Boolean getReceiveIMAPS()
	{
		return getReceiveIMAPS(getContext());
	}

	/**
	 * @param context
	 * @return value of ReceiveIMAPS
	 */
	public final java.lang.Boolean getReceiveIMAPS(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ReceiveIMAPS.toString());
	}

	/**
	 * Set value of ReceiveIMAPS
	 * @param receiveimaps
	 */
	public final void setReceiveIMAPS(java.lang.Boolean receiveimaps)
	{
		setReceiveIMAPS(getContext(), receiveimaps);
	}

	/**
	 * Set value of ReceiveIMAPS
	 * @param context
	 * @param receiveimaps
	 */
	public final void setReceiveIMAPS(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean receiveimaps)
	{
		getMendixObject().setValue(context, MemberNames.ReceiveIMAPS.toString(), receiveimaps);
	}

	/**
	 * @return value of ReceivePOP3S
	 */
	public final java.lang.Boolean getReceivePOP3S()
	{
		return getReceivePOP3S(getContext());
	}

	/**
	 * @param context
	 * @return value of ReceivePOP3S
	 */
	public final java.lang.Boolean getReceivePOP3S(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ReceivePOP3S.toString());
	}

	/**
	 * Set value of ReceivePOP3S
	 * @param receivepop3s
	 */
	public final void setReceivePOP3S(java.lang.Boolean receivepop3s)
	{
		setReceivePOP3S(getContext(), receivepop3s);
	}

	/**
	 * Set value of ReceivePOP3S
	 * @param context
	 * @param receivepop3s
	 */
	public final void setReceivePOP3S(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean receivepop3s)
	{
		getMendixObject().setValue(context, MemberNames.ReceivePOP3S.toString(), receivepop3s);
	}

	/**
	 * @return value of SelectedIncomingServer
	 */
	public final java.lang.Boolean getSelectedIncomingServer()
	{
		return getSelectedIncomingServer(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectedIncomingServer
	 */
	public final java.lang.Boolean getSelectedIncomingServer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SelectedIncomingServer.toString());
	}

	/**
	 * Set value of SelectedIncomingServer
	 * @param selectedincomingserver
	 */
	public final void setSelectedIncomingServer(java.lang.Boolean selectedincomingserver)
	{
		setSelectedIncomingServer(getContext(), selectedincomingserver);
	}

	/**
	 * Set value of SelectedIncomingServer
	 * @param context
	 * @param selectedincomingserver
	 */
	public final void setSelectedIncomingServer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean selectedincomingserver)
	{
		getMendixObject().setValue(context, MemberNames.SelectedIncomingServer.toString(), selectedincomingserver);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of IncomingServer_EmailProvider
	 */
	public final email_connector.proxies.EmailProvider getIncomingServer_EmailProvider() throws com.mendix.core.CoreException
	{
		return getIncomingServer_EmailProvider(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingServer_EmailProvider
	 * @throws com.mendix.core.CoreException
	 */
	public final email_connector.proxies.EmailProvider getIncomingServer_EmailProvider(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		email_connector.proxies.EmailProvider result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingServer_EmailProvider.toString());
		if (identifier != null) {
			result = email_connector.proxies.EmailProvider.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of IncomingServer_EmailProvider
	 * @param incomingserver_emailprovider
	 */
	public final void setIncomingServer_EmailProvider(email_connector.proxies.EmailProvider incomingserver_emailprovider)
	{
		setIncomingServer_EmailProvider(getContext(), incomingserver_emailprovider);
	}

	/**
	 * Set value of IncomingServer_EmailProvider
	 * @param context
	 * @param incomingserver_emailprovider
	 */
	public final void setIncomingServer_EmailProvider(com.mendix.systemwideinterfaces.core.IContext context, email_connector.proxies.EmailProvider incomingserver_emailprovider)
	{
		if (incomingserver_emailprovider == null) {
			getMendixObject().setValue(context, MemberNames.IncomingServer_EmailProvider.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.IncomingServer_EmailProvider.toString(), incomingserver_emailprovider.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return incomingServerMendixObject;
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
			final email_connector.proxies.IncomingServer that = (email_connector.proxies.IncomingServer) obj;
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