package org.wmaop;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2015-10-05 10:25:56 BST
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.wmaop.aop.chainprocessor.AOPChainProcessor;
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
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	$resourceID = IDataUtil.getString( pipelineCursor, "enabled" );
		pipelineCursor.destroy();
		
		boolean enabled; 
		if ($resourceID == null || $resourceID.length() == 0) {
			enabled = AOPChainProcessor.getInstance().isEnabled();
		} else {
			enabled = Boolean.valueOf($resourceID);
			AOPChainProcessor.getInstance().setEnabled(enabled);
		}
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "enabled", Boolean.toString(enabled) );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

