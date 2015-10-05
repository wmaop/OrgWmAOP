package org.wmaop;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2015-10-05 09:00:21 BST
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.wmaop.aop.chainprocessor.AOPChainProcessor;
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
		AOPChainProcessor.getInstance().setEnabled(false);
		AOPChainProcessor.getInstance().clearAdvice();
			
		// --- <<IS-END>> ---

                
	}
}

