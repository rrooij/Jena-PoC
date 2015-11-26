package dataset;

import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;

public class Sparql {
	
	public static ResultSet Query(String queryString, Model model)
	{
		QueryExecution qe = QueryExecutionFactory.create(queryString, model);
		return qe.execSelect();
	}
	
	public static ResultSet Query(String queryString, Dataset dataset)
	{
		QueryExecution qe = QueryExecutionFactory.create(queryString, dataset);
		return qe.execSelect();
	}
	
	public static void PrintResult(String queryString, ResultSet result)
	{
		Query q = QueryFactory.create(queryString);
		ResultSetFormatter.out(System.out, result, q);	
	}

}
