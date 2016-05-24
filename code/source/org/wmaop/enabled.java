package org.wmaop;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-05-24 15:18:23 BST
// -----( ON-HOST: Yoga.sysgen.co.uk

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.wmaop.flow.MockManager;
// --- <<IS-END-IMPORTS>> ---

public final class enabled

{
	// ---( internal utility methods )---

	final static enabled _instance = new enabled();

	static enabled _newInstance() { return new enabled(); }

	static enabled _cast(Object o) { return (enabled)o; }

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

