package DAOModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Models.ClassRoom;

public class ClassRomDAO {
	  private static Connection connector;
      public static boolean add(ClassRoom classRoom_ , int branchID) {
      	  PreparedStatement ST;
            
            try {
					ST = connector.prepareStatement("insert into classroom valuse(?,?,?)");
				
							 ST.setString(3,classRoom_.getName());
							 ST.setInt(2, branchID);
						     java.sql.Date date = new java.sql.Date(classRoom_.getSchoolYear().getTime());
							 ST.setDate(4, date);
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}
      	    
      }
      public static boolean delete(int idclass) {
      	PreparedStatement ST;
          
          try {
					ST = connector.prepareStatement("delete from classroom where id = ? ");
							 ST.setInt(1,idclass);
							
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exceptio
					return false;
				}
      	
      }
      public ArrayList<ClassRoom> getAll(){
		   ArrayList<ClassRoom>  lst = new ArrayList<ClassRoom>();
		   
		     PreparedStatement ST;
            ResultSet RS;
            try {
					ST = connector.prepareStatement("select * from classroom");
				   RS = ST.executeQuery();
				        while(RS.next()) 
				        	  lst.add(new ClassRoom(RS.getInt(1), RS.getNString(2),RS.getDate(4)));
				       	return lst ;
            }catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
      public static ClassRoom getbyID(int id){
		   
		     PreparedStatement ST;
          ResultSet RS;
          try {
					ST = connector.prepareStatement("select * from classroom where id = ? ");
					ST.setInt(1, id);
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    return new ClassRoom(RS.getInt(1),RS.getString(2),RS.getDate(4));
				        return null;
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
}
