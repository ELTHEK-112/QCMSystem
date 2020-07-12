package DAOModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Models.QuestionQCM;

public class QuestionQCMDAO {
	private static Connection connector;
    public static boolean add(QuestionQCM question,int idOnlineTest) {
    	  PreparedStatement ST;
          
          try {
					ST = connector.prepareStatement("insert into questionqcm valuse(?,?,?)");
							 
							 ST.setInt(1,idOnlineTest);
							 ST.setString(2, question.getQuestion());
							 ST.setInt(3,question.getPoints());
 							ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}
    	    
    }
    public static boolean delete(int questionqcmid) {
    	PreparedStatement ST;
        
        try {
					ST = connector.prepareStatement("delete from questionqcm where id = ? ");
							 ST.setInt(1,questionqcmid);
							
							 ST.execute();
					return true;
				} catch (Exception e) {
					// TODO: handle exceptio
					return false;
				}
    	
    }
    public ArrayList<QuestionQCM> getAll(){
		   ArrayList<QuestionQCM>  lst = new ArrayList<QuestionQCM>();
		   
		     PreparedStatement ST;
          ResultSet RS;
          try {
					ST = connector.prepareStatement("select * from questionqsm");
				   RS = ST.executeQuery();
				        while(RS.next()) 
				        	  lst.add(new QuestionQCM(RS.getInt(1), RS.getInt(2),RS.getString(3)));
				       	return lst ;
          }catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
    public static QuestionQCM getbyID(int id){
		   
		     PreparedStatement ST;
        ResultSet RS;
        try {
					ST = connector.prepareStatement("select * from module where id = ? ");
					ST.setInt(1, id);
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    return new QuestionQCM(RS.getInt(1), RS.getInt(2),RS.getString(3));
				        return null;
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }

}
