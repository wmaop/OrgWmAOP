package org.wmaop.define;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-06-23 19:45:17 BST
// -----( ON-HOST: Yoga.sysgen.co.uk

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.wmaop.aop.advice.Advice;
import org.wmaop.flow.ScenarioManager;
import org.wmaop.interceptor.bdd.BddParser;
import org.wmaop.interceptor.bdd.ParsedScenario;
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
		new ScenarioManager().registerScenario(pipeline);
		// --- <<IS-END>> ---

                
	}
}

