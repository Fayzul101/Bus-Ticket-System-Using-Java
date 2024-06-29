
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TicketSystem {
    Connection conn = javaConnect.ConnectDB();
    ResultSet rs;
    Statement stmt;
    PreparedStatement pst;
    double bc;
    
    static int counter = 0;
    double totalCharge;
	public static void getCharge(String fPlace, String dPlace, String dt, int children, int adult, boolean isAC,boolean isreturning, String name, int id) {
		
			double basicCharge = 0.0;
                        /*
			counter++;
			
			switch (fPlace) {
			case "dhaka":
				switch (dPlace) {
				case "barishal":
					basicCharge = 500;
					break;
				case "rajshahi":
					basicCharge = 730;
					break;
				case "chittagong":
					basicCharge = 670;
					break;
				default:
					System.err.println("Location not implemented.");
					return;
				}
				break;
			case "barishal":
				switch (dPlace) {
				case "dhaka":
					basicCharge = 500;
					break;
				case "rajshahi":
					basicCharge = 1300;
					break;
				case "chittagong":
					basicCharge = 1200;
					break;
				default:
					System.err.println("Location not implemented.");
					return;
				}
				break;
			case "rajshahi":
				switch (dPlace) {
				case "dhaka":
					basicCharge = 730;
					break;
				case "barishal":
					basicCharge = 1300;
					break;
				case "chittagong":
					basicCharge = 1400;
					break;
				default:
					System.err.println("Location not implemented.");
					return;
				}
				break;
			case "chittagong":
				switch (dPlace) {
				case "dhaka":
					basicCharge = 670;
					break;
				case "barishal":
					basicCharge = 1200;
					break;
				case "rajshahi":
					basicCharge = 1400;
					break;
				default:
					System.err.println("Location not implemented.");
					return;
				}
				break;
			default:
				System.err.println("Location not implemented.");				
			}
*/
                         
                        TicketSystem t = new TicketSystem();
                        
                      basicCharge = t.getBasicCharge(fPlace, dPlace);
                      
			double totalCharge = (basicCharge * 0.50 * children) + (basicCharge * 1 * adult);
			if (isAC) {
				totalCharge *= 3; // 1400-500 for one route
			}
			if (isreturning) {
				totalCharge *= 2;
			}
			System.out.println("Total cost: " + totalCharge);
                        String AC= "No", RT = "No";
               if(isAC == true){
                   AC = "Yes";
               }
              
               if(isreturning == true){
                   RT = "Yes";
               }
              String i = Integer.toString(id);
               t.addTicketDetails(fPlace, dPlace, dt, children, adult, AC, RT, totalCharge, name, i);
               
               
        }
        
        public double getBasicCharge(String dept, String dest){
         String sql = "select * from location where source = ? and destination = ?";
                       try{
                           pst = conn.prepareStatement(sql);
                           pst.setString(1, dept);
                           pst.setString(2, dest);
                           rs = pst.executeQuery();
                           if(rs.next()){
                                bc = rs.getDouble("price");
                               
                           }
                           
                       }
                       catch(Exception e){
                            bc=0;
                       }
        return bc;
    }
    public void addTicketDetails(String dep, String des, String date, int ch, int ad, String ac, String rt, double tc, String nm, String id){
        
        int ChildTicket = ch;
        try{
            userInfo ui = new userInfo();
            String  un = ui.getName();
            stmt = conn.createStatement();
           String sql = "insert into ticketDetails values('"+nm+"', '"+dep+"', '"+des+"', '"+date+"', "+ad+", "+ch+", '"+ac+"', '"+rt+"', "+tc+" , '"+un+"' , '"+id+"')";
           stmt.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "Ticket Booked Successfully!");
          
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }

        }


    
  

        

