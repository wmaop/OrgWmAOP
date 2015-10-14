package org.wmaop.define;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2015-10-06 14:46:12 BST
// -----( ON-HOST: LDVDEVIN03.catlin.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.wmaop.aop.Advice;
import org.wmaop.aop.chainprocessor.AOPChainProcessor;
import org.wmaop.interceptor.bdd.BddParser;
import com.wm.data.IData;
import com.wm.data.IDataCursor;
import com.wm.data.IDataUtil;
import com.wm.lang.xml.Document;
import com.wm.lang.xml.WMDocumentException;
// --- <<IS-END-IMPORTS>> ---

public final class scenario

{
	// ---( internal utility methods )---

	final static scenario _instance = new scenario();

	static scenario _newInstance() { return new scenario(); }

	static scenario _cast(Object o) { return (scenario)o; }

	// ---( server methods )---




	public static final void registerScenario (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(registerScenario)>> ---
		// @sigtype java 3.5
		// [i] object:0:required scenarioAsStream
		// [i] field:0:required scenarioAsString
		// [i] object:0:required scenarioAsDocument
		IDataCursor pipelineCursor = pipeline.getCursor();
			Object	scenarioAsStream = IDataUtil.get( pipelineCursor, "scenarioAsStream" );
			String	scenarioAsString = IDataUtil.getString( pipelineCursor, "scenarioAsString" );
			Document scenarioAsNode = (Document) IDataUtil.get( pipelineCursor, "scenarioAsDocument" );
		pipelineCursor.destroy();
		
		InputStream scenarioStream;
		if (scenarioAsStream != null) {
			scenarioStream = (InputStream) scenarioAsStream;
		} else if (scenarioAsString != null) {
			scenarioStream = new ByteArrayInputStream(scenarioAsString.getBytes());
		} else if (scenarioAsNode != null) {
			StringBuffer sb = new StringBuffer();
			try {
				scenarioAsNode.appendGeneratedMarkup(sb);
			} catch (WMDocumentException e) {
				throw new ServiceException("Error parsing");
			}
			scenarioStream = new ByteArrayInputStream(sb.toString().getBytes());
		} else {
			throw new ServiceException("Must specify the advice xml as an input");
		}
		try {
			Advice advice = new BddParser().parse(scenarioStream);
			AOPChainProcessor aop = AOPChainProcessor.getInstance();
			aop.registerAdvice(advice);
			aop.setEnabled(true);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("Error parsing scenario: " + e.getMessage());
		}
			
		// --- <<IS-END>> ---

                
	}
}

