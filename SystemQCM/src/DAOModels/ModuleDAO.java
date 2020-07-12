package DAOModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Models.Module;

public class ModuleDAO {
	 private static Connection connector;
     public static boolean add(Module module) {
     	  PreparedStatement ST;
           
           try {
					ST = connector.prepareStatement("insert into branch valuse( ?,? )");
							 
							 ST.setString(2,module.getName());
							 ST.setInt(3, module.getCoefficient());
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}
     	    
     }
     public static boolean delete(int idModule) {
     	PreparedStatement ST;
         
         try {
					ST = connector.prepareStatement("delete from chapiter where id = ? ");
							 ST.setInt(1,idModule);
							
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exceptio
					return false;
				}
     	
     }
     public ArrayList<Module> getAll(){
		   ArrayList<Module>  lst = new ArrayList<Module>();
		   
		     PreparedStatement ST;
           ResultSet RS;
           try {
					ST = connector.prepareStatement("select * from module");
				   RS = ST.executeQuery();
				        while(RS.next()) 
				        	  lst.add(new Module(RS.getInt(1), RS.getInt(2),RS.getString(3)));
				       	return lst ;
           }catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
     public static Module getbyID(int id){
		   
		     PreparedStatement ST;
         ResultSet RS;
         try {
					ST = connector.prepareStatement("select * from module where id = ? ");
					ST.setInt(1, id);
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    return new Module(RS.getInt(1), RS.getInt(2),RS.getString(3));
				        return null;
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
	
}
