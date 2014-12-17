package com.souk.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.neo4j.cypher.ExecutionEngine;
import org.neo4j.cypher.ExecutionResult;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.kernel.impl.util.StringLogger;

import scala.collection.Iterator;

/**
 * Servlet implementation class Processor
 */
public class Processor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Processor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();

		
		GraphDatabaseService graphDb = new GraphDatabaseFactory().newEmbeddedDatabase("C:\\Users\\Soukwinder Singh\\Documents\\Neo4j\\test");
        ExecutionEngine engine = new ExecutionEngine(graphDb, StringLogger.SYSTEM);
        ExecutionResult processor;
        
        try (Transaction ignored = graphDb.beginTx()) { 
            processor = engine.execute("MATCH (n:`Processor`) RETURN n");  
            
            Iterator<Node> processor_brands = processor.columnAs("n");
            int pro = 0;
            while (processor_brands.hasNext()) {
                Node brand = processor_brands.next();
        		out.print("<p id=" );
        		out.print("\"");
        		out.print("pro"+pro);
        		out.print("\"");
        		out.print(" onclick=\"pro()\">");
        		out.println(brand.getProperty("Titel"));
        		out.print("</p>");
        		pro = pro + 1;
            }         
            
            
            
            
        }
        graphDb.shutdown();
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
