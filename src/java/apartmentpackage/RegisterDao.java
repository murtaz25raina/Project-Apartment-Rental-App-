package apartmentpackage;
import java.sql.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class RegisterDao {

 public String getRegistered(RegisterBean RR)
 {
     String Name10 = RR.getName();
     String Email10 = RR.getEmail();
     String Password10 = RR.getPassword();
     String Mobile10 = RR.getMobile();
     String Address10 = RR.getAddress();
     try
     {
         Connection conn=DBConnection.getConnection();
         String query1="select Email from SignUp2019 where Email=?";
         PreparedStatement Ps1=conn.prepareStatement(query1);
         Ps1.setString(1,Email10);
         Ps1.execute();
         ResultSet f=Ps1.getResultSet();
         if(f.next()){
        conn.close();
          return "Exists";}
        /* String query="insert into Signup2019 values(?,?,?,?,?)";
         PreparedStatement pS = conn.prepareStatement(query);
         pS.setString(1, Name10);
         pS.setString(2, Email10);
         pS.setString(3, Password10);
         pS.setString(4, Mobile10);
         pS.setString(5, Address10);
         int i= pS.executeUpdate();*/
         String query2="select max(Id) from SignUp2019;";
          Statement s=conn.createStatement();
          ResultSet RS=s.executeQuery(query2);
          if(RS.next()){
          int iiid=RS.getInt("max(Id)");
          System.out.println(iiid);
         conn.close();
         RegisterBean RBS = new RegisterBean();
          RBS.setName(Name10);
          RBS.setEmail(Email10);
          RBS.setPassword(Password10);
          RBS.setMobile(Mobile10);
          RBS.setAddress(Address10);
          iiid+=1;
              System.out.println("ID="+iiid);
          RBS.setId(iiid);
        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session sss = sf.openSession();
        Transaction tx = sss.beginTransaction();
        sss.save(RBS);
        tx.commit();
        sss.close();
        sf.close();

         
         
        // if(i!=0)
             return "true";}
        // else
          //   return "false";
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return "false";
 }
}
