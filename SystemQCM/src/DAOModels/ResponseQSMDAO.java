package DAOModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Models.ResponseQCM;

public class ResponseQSMDAO {
	private static Connection connector;
    public static boolean add(ResponseQCM respons,int idquestion) {
    	  PreparedStatement ST;
          
          try {
					ST = connector.prepareStatement("insert into responsqcm valuse(?,?)");
							 
							 ST.setInt(1,idquestion);
							 ST.setString(2, respons.getResponse());
							
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}
    	    
    }
    public static boolean delete(int responsid) {
    	PreparedStatement ST;
        
        try {
					ST = connector.prepareStatement("delete from responsqcm where id = ? ");
							 ST.setInt(1,responsid);
							
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exceptio
					return false;
				}
    	
    }
    public ArrayList<ResponseQCM> getAll(){
		   ArrayList<ResponseQCM>  lst = new ArrayList<ResponseQCM>();
		   
		     PreparedStatement ST;
          ResultSet RS;
          try {
					ST = connector.prepareStatement("select * from onlinetest");
				   RS = ST.executeQuery();
				        while(RS.next()) 
				        	  lst.add(new ResponseQCM(RS.getInt(1), RS.getString(2)));
				       	return lst ;
          }catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
    public static ResponseQCM getbyID(int id){
		   
		     PreparedStatement ST;
        ResultSet RS;
        try {
					ST = connector.prepareStatement("select * from module where id = ? ");
					ST.setInt(1, id);
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    return new ResponseQCM(RS.getInt(1), RS.getString(2));
				        return null;
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }

}
