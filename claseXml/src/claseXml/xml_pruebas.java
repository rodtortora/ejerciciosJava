package claseXml;


import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xml_pruebas {
	
	public xml_pruebas() throws ParserConfigurationException, SAXException, IOException {
		final DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
		final DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
		final Document doc = docBuilder.parse(this.getClass().getResourceAsStream("../res/books.xml"));
		Element nodoRaiz = doc.getDocumentElement();
		final NodeList books = nodoRaiz.getElementsByTagName("book");
		for (int i = 0; i < books.getLength(); i++) {						
			System.out.println(books.item(i).getNodeName() + " " + ((Element)books.item(i)).getAttribute("id")); //.item(0));
			final NodeList bookNodes = ((Element)books.item(i)).getElementsByTagName("*");
			for (int f = 0; f < bookNodes.getLength(); f++) {
				System.out.println(bookNodes.item(f).getNodeName() + ": " + bookNodes.item(f).getTextContent());
			}
			
			
			//books.item(i).getat
			System.out.println();
		}
		
		
		/*final NodeList children = nodoRaiz.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			final Node n = children.item(i);
			if (n.getNodeType() == Node.ELEMENT_NODE) {
				System.out.println(n.getNodeName() + ": " + (!n.hasChildNodes() ? "" : n.getTextContent()));
			}
		}*/	
	}
	
	public static void main (String[]args) {
		try {
			xml_pruebas xml = new xml_pruebas();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
