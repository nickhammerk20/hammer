import javax.swing.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.io.FileInputStream;
import java.util.Properties;

public class DatabaseTable
{
    public static void main(String[] args)
    {
        // ������������� JDBC
        Connection conn;
        try
        {
            Properties props = new Properties();
            FileInputStream in
                    = new FileInputStream("database.properties");
            props.load(in);
            in.close();

            String drivers = props.getProperty("jdbc.drivers");
            Class.forName(drivers);
            String url = props.getProperty("jdbc.url");
            String ip = props.getProperty("jdbc.iphome");
            String base = props.getProperty("jdbc.base");
            url = url + "dima";
            url = url + "/";
            url = url + "dima";
            url = url + ip + base;
            conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();
            // ��������� ������
            ResultSet rs = st.executeQuery(
                "select * from INFO");
            // ���� ������
            DatabaseTableModel dbm =
                new DatabaseTableModel(true);
            // ������� � ����
            JTable table = new JTable(dbm);
            JFrame frame = new JFrame("DataBaseTable");
            frame.setSize(400, 300);
            frame.getContentPane().add(new JScrollPane(table));
            frame.setVisible(true);
            // ������� ��������� ������� �� �����
            dbm.setDataSource(rs);
            rs.close();
            conn.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,
                ex.getMessage(), "������ ����������� � ��!",
                JOptionPane.ERROR_MESSAGE);
        }

    }
}