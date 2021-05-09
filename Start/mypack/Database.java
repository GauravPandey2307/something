package mypack;

import java.sql.*;
public class Database
{
public static void main(String args[]) throws Exception
{
Class.forName("org.sqlite.JDBC");
Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLite//uni.db");
//Statement stm=con.createStatement();
/*ResultSet rs = stm.executeQuery("select * from dept");
PreparedStatement  ps = con.prepareStatement("select * from dept where deptno=?");
ps.setInt(1, 10);
rs= ps.executeQuery();
int dno;
String dname;
while(rs.next())
{
dno = rs.getInt("deptno");
dname = rs.getString(2);
 
System.out.println(dno+" " +dname);
}*/
PreparedStatement ps = con.prepareStatement("insert into dept values(?,?)");
ps.setInt(1, 80);
ps.setString(2,"Lund" );
ps.executeUpdate();
Statement s = con.createStatement();
ResultSet rs = s.executeQuery("select * from dept");
int dno;
String dname;
while(rs.next())
{
dno = rs.getInt("deptno");
dname = rs.getString(2);
 
System.out.println(dno+" " +dname);
}
}
}

