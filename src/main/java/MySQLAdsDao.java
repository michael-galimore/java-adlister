import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{
    private Connection connection;
    private List<Ad> ads;


   public MySQLAdsDao(Config config){
       try {
           DriverManager.registerDriver(new Driver());
       } catch (SQLException e) {
           e.printStackTrace();
       }
       try {
           Connection connection = DriverManager.getConnection(
                   config.getUrl(),
                   config.getUser(),
                   config.getPassword()
           );
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }


}
