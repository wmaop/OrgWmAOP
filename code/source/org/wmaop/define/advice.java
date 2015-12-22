package org.wmaop.define;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2015-12-21 14:53:04 GMT
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.ArrayList;
import java.util.List;
import org.wmaop.aop.advice.Advice;
import org.wmaop.aop.chainprocessor.AOPChainProcessor;
import org.wmaop.flow.MockManager;
import com.wm.data.IData;
import com.wm.data.IDataCursor;
import com.wm.data.IDataUtil;
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
		// [i] field:0:required id
		new MockManager().getAdvice(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void removeAdvice (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(removeAdvice)>> ---
		// @sigtype java 3.5
		// [i] field:0:required id
		// pipeline
		new MockManager().removeAdvice(pipeline);
		// --- <<IS-END>> ---

                
	}
}

