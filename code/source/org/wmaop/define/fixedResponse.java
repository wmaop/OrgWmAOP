package org.wmaop.define;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-05-27 08:28:01 BST
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.wmaop.flow.MockManager;
import com.wm.data.IData;
// --- <<IS-END-IMPORTS>> ---

public final class fixedResponse

{
	// ---( internal utility methods )---

	final static fixedResponse _instance = new fixedResponse();

	static fixedResponse _newInstance() { return new fixedResponse(); }

	static fixedResponse _cast(Object o) { return (fixedResponse)o; }

	// ---( server methods )---




	public static final void registerFixedResponseMock (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(registerFixedResponseMock)>> ---
		// @sigtype java 3.5
		// [i] field:0:required adviceId
		// [i] field:0:required serviceName
		// [i] field:0:optional condition
		// [i] field:0:required interceptPoint {"BEFORE","INVOKE","AFTER"}
		// [i] field:0:required response
		new MockManager().registerFixedResponseMock(pipeline);	
		// --- <<IS-END>> ---

                
	}
}

