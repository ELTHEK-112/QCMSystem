package DAOModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Models.OnlineTest;

class OnlineTestDAO {
	 private static Connection connector;
     public static boolean add(OnlineTest test,int idchap) {
     	  PreparedStatement ST;
           
           try {
					ST = connector.prepareStatement("insert into onlinetest valuse(?,?,?,? )");
							 
							 ST.setInt(1,idchap);
							 ST.setString(2, test.getName());
							 ST.setString(3, test.getDescription());
							 ST.setInt(4, test.getTimeTest());
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}
     	    
     }
     public static boolean delete(int testid) {
     	PreparedStatement ST;
         
         try {
					ST = connector.prepareStatement("delete from onlinetest where id = ? ");
							 ST.setInt(1,testid);
							
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exceptio
					return false;
				}
     	
     }
     public ArrayList<OnlineTest> getAll(){
		   ArrayList<OnlineTest>  lst = new ArrayList<OnlineTest>();
		   
		     PreparedStatement ST;
           ResultSet RS;
           try {
					ST = connector.prepareStatement("select * from onlinetest");
				   RS = ST.executeQuery();
				        while(RS.next()) 
				        	  lst.add(new OnlineTest(RS.getInt(1), RS.getString(2),RS.getString(3),RS.getInt(4)));
				       	return lst ;
           }catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
     public static OnlineTest getbyID(int id){
		   
		     PreparedStatement ST;
         ResultSet RS;
         try {
					ST = connector.prepareStatement("select * from module where id = ? ");
					ST.setInt(1, id);
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    return new OnlineTest(RS.getInt(1), RS.getString(2),RS.getString(3),RS.getInt(4));
				        return null;
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
}
