import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.log4j.BasicConfigurator;



public class Test {
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		System.out.println("Test");
		
		Model m = ModelFactory.createDefaultModel();
		String NS = "http://example.com/test/";
		Resource r = m.createResource ( NS + "r");
		Property p = m.createProperty(NS + "p");
		r.addProperty ( p, "Hello world", XSDDatatype.XSDstring);
		m.write(System.out, "Turtle");
	}
}
