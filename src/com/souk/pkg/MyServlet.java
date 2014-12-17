package com.souk.pkg;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.neo4j.cypher.ExecutionEngine;
import org.neo4j.cypher.ExecutionResult;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.kernel.impl.util.StringLogger;

import scala.collection.Iterator;

import org.neo4j.graphdb.Node;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();

		
		GraphDatabaseService graphDb = new GraphDatabaseFactory().newEmbeddedDatabase("C:\\Users\\Soukwinder Singh\\Documents\\Neo4j\\test");
        ExecutionEngine engine = new ExecutionEngine(graphDb, StringLogger.SYSTEM);
        ExecutionResult moederbord;
        
        try (Transaction ignored = graphDb.beginTx()) {
            moederbord = engine.execute("MATCH (n:`Moederbord`) RETURN n");  
            
            Iterator<Node> moederbord_brands = moederbord.columnAs("n");
            int moe = 0;
            while (moederbord_brands.hasNext()) {
                Node brand = moederbord_brands.next();
        		out.print("<p id=" );
        		out.print("\"");
        		out.print("moe"+moe);
        		out.print("\"");
        		out.print(" onclick=\"moe()\">");
        		out.println(brand.getProperty("Titel"));
        		out.print("</p>");
        		moe = moe + 1;
            }
                 
        }
        graphDb.shutdown();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
