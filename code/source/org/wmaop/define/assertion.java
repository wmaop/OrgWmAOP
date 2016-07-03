package org.wmaop.define;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-07-03 20:12:42 BST
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.wmaop.flow.MockManager;
// --- <<IS-END-IMPORTS>> ---

public final class assertion

{
	// ---( internal utility methods )---

	final static assertion _instance = new assertion();

	static assertion _newInstance() { return new assertion(); }

	static assertion _cast(Object o) { return (assertion)o; }

	// ---( server methods )---




	public static final void getInvokeCount (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getInvokeCount)>> ---
		// @sigtype java 3.5
		// [i] field:0:required adviceId
		new MockManager().getInvokeCount(pipeline);				
		// --- <<IS-END>> ---

                
	}



	public static final void registerAssertion (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(registerAssertion)>> ---
		// @sigtype java 3.5
		// [i] field:0:required adviceId
		// [i] field:0:required serviceName
		// [i] field:0:optional condition
		// [i] field:0:required interceptPoint {"BEFORE","INVOKE","AFTER"}
		new MockManager().registerAssertion(pipeline);
			
		// --- <<IS-END>> ---

                
	}
}

