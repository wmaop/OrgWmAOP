package org.wmaop.define;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2015-10-07 10:00:00 BST
// -----( ON-HOST: LDVDEVIN03.catlin.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;
import org.wmaop.aop.Advice;
import org.wmaop.aop.chainprocessor.AOPChainProcessor;
import com.wm.data.IData;
import com.wm.lang.xml.Document;
import com.wm.lang.xml.WMDocumentException;
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
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	adviceId = IDataUtil.getString( pipelineCursor, "id" );
		
		List<Advice> advs;
		if (adviceId == null || adviceId.length() == 0) {
			advs = AOPChainProcessor.getInstance().listAdvice();
		} else {
			advs = new ArrayList<Advice>();
			advs.add(AOPChainProcessor.getInstance().getAdvice(adviceId));
		}
		
		// to document and set into pipeline
		IDataUtil.put(pipelineCursor, "advices", advs.size());
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void removeAdvice (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(removeAdvice)>> ---
		// @sigtype java 3.5
		// [i] field:0:required id
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	id = IDataUtil.getString( pipelineCursor, "id" );
		pipelineCursor.destroy();
		
		AOPChainProcessor.getInstance().unregisterAdvice(id);
			
		// --- <<IS-END>> ---

                
	}
}

