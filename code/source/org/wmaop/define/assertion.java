package org.wmaop.define;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2015-10-06 09:21:06 BST
// -----( ON-HOST: Yoga.sysgen.co.uk

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
		new MockManager().getInvokeCount(pipeline);
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void registerAssertion (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(registerAssertion)>> ---
		// @sigtype java 3.5
		new MockManager().registerAssertion(pipeline);
			
		// --- <<IS-END>> ---

                
	}
}

