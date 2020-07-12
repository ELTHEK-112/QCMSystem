package DAOModels;

import java.sql.*;
import java.util.ArrayList;

import Models.Chapiter;

public class ChapiterDAO {
        private static Connection connector;
        public static boolean add(Chapiter chap , int ModuleId) {
        	  PreparedStatement ST;
              
              try {
					ST = connector.prepareStatement("insert into branch valuse( ?,? )");
							 
							 ST.setString(3,chap.getNameChap());
							 ST.setInt(2, ModuleId);
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}
        	    
        }
        public static boolean delete(int idChapiter) {
        	PreparedStatement ST;
            
            try {
					ST = connector.prepareStatement("delete from chapiter where id = ? ");
							 ST.setInt(1,idChapiter);
							
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exceptio
					return false;
				}
        	
        }
        public ArrayList<Chapiter> getAll(){
 		   ArrayList<Chapiter>  lst = new ArrayList<Chapiter>();
 		   
 		     PreparedStatement ST;
              ResultSet RS;
              try {
 					ST = connector.prepareStatement("select * from chapiter");
 				   RS = ST.executeQuery();
 				        while(RS.next()) 
 				        	  lst.add(new Chapiter(RS.getInt(1), RS.getNString(3)));
 				       	return lst ;
              }catch (Exception e) {
 					// TODO: handle exception
 					return null;
 				}
 	   }
        public static Chapiter getbyID(int id){
 		   
		     PreparedStatement ST;
            ResultSet RS;
            try {
					ST = connector.prepareStatement("select * from chapitr where id = ? ");
					ST.setInt(1, id);
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    return new Chapiter(RS.getInt(1),RS.getString(3));
				        return null;
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
}

