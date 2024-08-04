package handy.database;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;



public class SqlSessionFactory{
    private static org.apache.ibatis.session.SqlSessionFactory factory ;
    static {
        try {
            factory = new SqlSessionFactoryBuilder().build(new FileReader(Config.configDestination));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static SqlSession build(){
        return factory.openSession();
    }
}
class Config{
    public static final String configDestination = "./config.xml";
}