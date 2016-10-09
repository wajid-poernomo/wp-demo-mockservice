package webservice02.interceptorHelpers;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.apache.cxf.staxutils.DelegatingXMLStreamWriter;

public class CDataXMLStreamWriter extends DelegatingXMLStreamWriter {

	public CDataXMLStreamWriter(XMLStreamWriter del) {
		super(del);
	}

	@Override
	public void writeCharacters(String text) throws XMLStreamException {
		super.writeCData(text);
	}

	public void writeStartElement(String prefix, String local, String uri) throws XMLStreamException {

		super.writeStartElement(prefix, local, uri);
	}
}