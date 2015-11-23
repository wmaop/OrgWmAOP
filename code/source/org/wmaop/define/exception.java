package org.wmaop.define;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2015-10-12 16:13:19 BST
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.wmaop.flow.MockManager;
// --- <<IS-END-IMPORTS>> ---

public final class exception

{
	// ---( internal utility methods )---

	final static exception _instance = new exception();

	static exception _newInstance() { return new exception(); }

	static exception _cast(Object o) { return (exception)o; }

	// ---( server methods )---




	public static final void registerExceptionMock (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(registerExceptionMock)>> ---
		// @sigtype java 3.5
		new MockManager().registerException(pipeline);
		// --- <<IS-END>> ---

                
	}
}

