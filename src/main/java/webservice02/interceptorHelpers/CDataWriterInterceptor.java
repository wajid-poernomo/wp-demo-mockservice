package webservice02.interceptorHelpers;

import java.io.OutputStream;

import javax.xml.stream.XMLStreamWriter;
 
import org.apache.cxf.interceptor.AttachmentOutInterceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.staxutils.StaxUtils;
 
// This is a helper class to process the CDATA payloads expected by consumers of GlobalWeatherServiceEx.
public class CDataWriterInterceptor extends AbstractPhaseInterceptor<Message> {
 
	public CDataWriterInterceptor() {
		super(Phase.PRE_STREAM);
		addAfter(AttachmentOutInterceptor.class.getName());
	}
 
	@Override
	public void handleMessage(Message message) {
		message.put("disable.outputstream.optimization", Boolean.TRUE);
		XMLStreamWriter writer = StaxUtils.createXMLStreamWriter(message.getContent(OutputStream.class));
		message.setContent(XMLStreamWriter.class, new CDataXMLStreamWriter(writer));
	}
}