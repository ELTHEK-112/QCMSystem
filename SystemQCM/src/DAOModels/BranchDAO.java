package DAOModels;
import Models.Branch;

import java.sql.*;
import java.util.ArrayList;

public class BranchDAO {
	           private static Connection connector  = SinglConnection.getConnection();
	             
	   public static boolean addBranch (Branch _branch) {
                    PreparedStatement ST;
                   
                    try {
						ST = connector.prepareStatement("insert into branch valuse( ? )");
								 ST.setString(1, _branch.getName());
						return true;
					} catch (Exception e) {
						// TODO: handle exception
						return false;
					}
  
	   }
	   public static boolean deletbranch(int id) {
		     PreparedStatement ST;
             
             try {
					ST = connector.prepareStatement("delete from branch where id = ? ");
							 ST.setInt(1, id);
							 ST.executeUpdate();
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}
		   
	   }
	   public ArrayList<Branch> getAll(){
		   ArrayList<Branch>  lst = new ArrayList<Branch>();
		   
		     PreparedStatement ST;
             ResultSet RS;
             try {
					ST = connector.prepareStatement("select * from branch");
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    lst.add(new Branch(RS.getInt("ID"),RS.getString("Name")));
					return lst ;
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
	   public static Branch getbyID(int id){
		   
		     PreparedStatement ST;
             ResultSet RS;
             try {
					ST = connector.prepareStatement("select * from branch where id = ? ");
					ST.setInt(1, id);
				   RS = ST.executeQuery();
				        while(RS.next())
				        	    return new Branch(RS.getInt("ID"),RS.getString("Name"));
				        return null;
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	   }
	

}
