package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import javabeans.Libro;

public class GestionLibros {
	 
		    DataSource ds;
		    public GestionLibros(){
		    	try {
					Context ctx=new InitialContext();
					ds=(DataSource)ctx.lookup("java:comp/env/reflibros");
				} catch (NamingException e) {			
					e.printStackTrace();
				}
		        
		    }
	 
	     public List<Libro> obtenerLibros(int idTema){
	        List<Libro> libros=new ArrayList<> ();
	           
	        try(Connection cn=ds.getConnection()) {                       
	            //Paso 2: Envio SQL
	            String sql="select * from libros where idTema=?";
	            PreparedStatement st=cn.prepareStatement(sql);
	            st.setInt(1,idTema);
	            libros=(List<Libro>) st.executeQuery();
	                      
	        }  catch (SQLException ex) {
	            ex.printStackTrace();
	        }   
	        return libros;
	    }
	
}
