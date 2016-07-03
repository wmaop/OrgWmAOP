package org.wmaop;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-07-03 20:11:27 BST
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.wmaop.flow.MockManager;
// --- <<IS-END-IMPORTS>> ---

public final class state

{
	// ---( internal utility methods )---

	final static state _instance = new state();

	static state _newInstance() { return new state(); }

	static state _cast(Object o) { return (state)o; }

	// ---( server methods )---




	public static final void enableInterception (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(enableInterception)>> ---
		// @sigtype java 3.5
		// [i] field:0:required enabled
		// [o] field:0:required enabled
		new MockManager().enableInterception(pipeline);
		// --- <<IS-END>> ---

                
	}
}

