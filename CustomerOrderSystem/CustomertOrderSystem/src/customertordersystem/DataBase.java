/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customertordersystem;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class DataBase {
    private String dbURL;//数据库连接url
    private String user;//数据库的登录名
    private String password;//数据库的登录密码
    private Connection conn;
    private Statement stmt;
    public ResultSet rs;
    public void Connection ()
{
       dbURL="jdbc:sqlserver:// [db_accessadmin上的MyCos]";// 数据库标识名
       user="sa";// 数据库用户名
       password="123456"; // 数据库用户密码

         try {
           Class.forName("mircrosoft.sqlserver.jdbc.SQLServerDriver"); //加载驱动器
           conn=DriverManager.getConnection(dbURL,user,password); //获取连接
               stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           } catch (Exception e)
           {
               e.printStackTrace();
           }
}
 public  boolean isLogin(String UserName,String UserPassword)//传入用户账号，密码
 {
     try
     {
         ResultSet rs = stmt.executeQuery("select * from logins where Demonum='"+UserName+"' and Demonum='"+UserPassword+"'");
         if (rs.next())//如果rs可以next则说明该用户存在，切密码正确。
         {
             return true;
         }
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
     return false;
 }
 public  String[][] Goods(String GoodNum,String GoodName,String GoodPrice,String GoodBNum) throws SQLException{
     String[][] str=null;
     try{
         String sql="select * from Goods where 货物号='"+ GoodNum + "' and Gname='" +GoodName + "'and Gprice='" + GoodPrice + "'and Gbnum='" + GoodBNum +"'";
         ResultSet rs=stmt.executeQuery(sql);
         int count=0;
         while(rs.next()){
             count++;
         }
         str= new String[count][8];
         rs.absolute(0);//把游标返回到0行
         for(int row=0;row<count;row++){
             rs.next();
             for(int col=0;col<8;col++){
                 str[row][col]=rs.getString(col+1);
             }
         }
     }catch (SQLException ex){
         //Logger.getLogger(stmt.class.getName()).log(Level.SEVERE,null,ex);
         ex.printStackTrace();
     }
     stmt.close();
     return str;
 }

}

