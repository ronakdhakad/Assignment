package SwingProject2.real_estate_project.dao;
import SwingProject2.real_estate_project.DBConnection;
import java.sql.Connection;
public abstract class BaseDAO { protected Connection getConn(){ return DBConnection.getConnection(); } }
