package org.wmaop;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-01-04 14:48:24 GMT
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.wmaop.aop.chainprocessor.AOPChainProcessor;
import org.wmaop.flow.MockManager;
// --- <<IS-END-IMPORTS>> ---

public final class reset

{
	// ---( internal utility methods )---

	final static reset _instance = new reset();

	static reset _newInstance() { return new reset(); }

	static reset _cast(Object o) { return (reset)o; }

	// ---( server methods )---




	public static final void resetAdviceAndDisable (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(resetAdviceAndDisable)>> ---
		// @sigtype java 3.5
		AOPChainProcessor.getInstance().reset();			
		// --- <<IS-END>> ---

                
	}
}

