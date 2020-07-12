package DAOModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Models.Etudiant_;

public class EtudiantDAO {
	  private static Connection connector;
      public static boolean add(Etudiant_ Etudiant, int classrom) {
      	  PreparedStatement ST;
            
            try {
					ST = connector.prepareStatement("insert into user valuse(?,?,?,?,?,?,?,?,?,?,?,?)");
					      
							 ST.setString(2,Etudiant.getusername());
							 ST.setString(3,Etudiant.getpassword());
							 ST.setString(8,Etudiant.getFirstname());
							 ST.setString(9,Etudiant.getLastname());
							 ST.setString(10,Etudiant.get_email());
							 ST.setString(11,Etudiant.get_cNE());
							 ST.setString(11,Etudiant.getClass().getName());
							 ST.setInt(1, classrom);
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
      public ArrayList<Etudiant_> getAll(){
		   ArrayList<Etudiant_>  lst = new ArrayList<Etudiant_>();
		   
		     PreparedStatement ST;
            ResultSet RS;
            try {
					ST = connector.prepareStatement("select * from user");
				   RS = ST.executeQuery();
				        while(RS.next()) 
				        	  lst.add(new Etudiant_(RS.getString(9), RS.getString(10), RS.getString(11), RS.getString(12), RS.getInt(1), RS.getString(3), RS.getString(4)));
				       	return lst ;
            }catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
      public static Etudiant_ getbyID(int id){
		   
		     PreparedStatement ST;
          ResultSet RS;
          try {
					ST = connector.prepareStatement("select * from classroom where id = ? ");
					ST.setInt(1, id);
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    return new Etudiant_(RS.getString(9), RS.getString(10), RS.getString(11), RS.getString(12), RS.getInt(1), RS.getString(3), RS.getString(4));
				        return null;
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
}
