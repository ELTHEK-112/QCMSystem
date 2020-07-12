package DAOModels;

import java.sql.*;

public class SinglConnection {
	
			  private static  Connection  connector;
			   
			  private SinglConnection() {
				  try {
					          Class.forName("com.mysql.jdbc.Driver");
					         connector = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectstage","root","");
					         
				} catch (Exception e) {
					// TODO: handle exception
				}
			  }
			  public static Connection getConnection() {
				    if (connector == null) new SinglConnection();
				    return connector;
			  }
			  

}
