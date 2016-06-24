package org.wmaop.define;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-06-24 21:04:54 BST
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.wmaop.flow.MockManager;
import com.wm.data.IData;
// --- <<IS-END-IMPORTS>> ---

public final class advice

{
	// ---( internal utility methods )---

	final static advice _instance = new advice();

	static advice _newInstance() { return new advice(); }

	static advice _cast(Object o) { return (advice)o; }

	// ---( server methods )---




	public static final void getAdvice (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getAdvice)>> ---
		// @sigtype java 3.5
		// [i] field:0:required adviceId
		new MockManager().getAdvice(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void removeAdvice (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(removeAdvice)>> ---
		// @sigtype java 3.5
		// [i] field:0:required adviceId
		// pipeline
		new MockManager().removeAdvice(pipeline);
		// --- <<IS-END>> ---

                
	}
}

