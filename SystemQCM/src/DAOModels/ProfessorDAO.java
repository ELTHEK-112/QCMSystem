package DAOModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Models.Professor;

public class ProfessorDAO {
	 private static Connection connector;
     public static boolean add(Professor prof) {
     	  PreparedStatement ST;
           
           try {
					ST = connector.prepareStatement("insert into user valuse(?,?,?,?,?,?,?,?,?,?,?,?)");
					      
							 ST.setString(1,prof.getusername());
							 ST.setString(2,prof.getpassword());
							 ST.setString(3,prof.getFirstname());
							 ST.setString(4,prof.getLastname());
							 ST.setString(5,prof.getEmail());
							 ST.setString(6,prof.getCIN());
							 ST.setString(7,prof.getClass().getName());
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}
     	    
     }
     public static boolean delete(int idetd) {
     	PreparedStatement ST;
         
         try {
					ST = connector.prepareStatement("delete from user where id = ? ");
							 ST.setInt(1,idetd);
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exceptio
					return false;
				}
     	
     }
     public ArrayList<Professor> getAll(){
		   ArrayList<Professor>  lst = new ArrayList<Professor>();
		   
		     PreparedStatement ST;
           ResultSet RS;
           try {
					ST = connector.prepareStatement("select * from user");
				   RS = ST.executeQuery();
				        while(RS.next()) 
				        	  lst.add(new Professor(RS.getInt(1), RS.getString(3), RS.getString(4), RS.getString(5), RS.getString(9), RS.getString(3), RS.getString(4)));
				       	return lst ;
           }catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
     public static Professor getbyID(int id){
		   
		     PreparedStatement ST;
         ResultSet RS;
         try {
					ST = connector.prepareStatement("select * from classroom where id = ? ");
					ST.setInt(1, id);
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    return new Professor(RS.getInt(1), RS.getString(10), RS.getString(11), RS.getString(12), RS.getString(9), RS.getString(3), RS.getString(4));
				        return null;
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }

}
