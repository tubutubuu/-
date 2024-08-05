package handy.discovery;

import handy.api.dto.JobDataSchema;
import handy.database.SqlSessionFactory;
import handy.database.mapper_interface.JobDataMapper;
import handy.database.mapper_interface.SomethingMapper;
import handy.database.mapper_interface.UuidMapper;
import handy.database.parameter.Mood;
import org.apache.ibatis.session.SqlSession;
import handy.database.table.JobData;


public class ArtifactProviderClient{
    public  static JobData search(int value){
        //log
        try(SqlSession session = SqlSessionFactory.build()) {
            JobDataMapper mapper = session.getMapper(JobDataMapper.class);
            JobData  data = mapper.select(value);
            if(data ==null){
                System.out.println("none");
                return null;
            }else{
                return data ;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //log
        return null;
    }
    public  static int create(String s1,String s2,String s3){
        int row = 0 ;
        //log
        try(SqlSession session = SqlSessionFactory.build()) {
            JobDataMapper mapper = session.getMapper(JobDataMapper.class);
          row = mapper.insert(s1,s2,s3);
          session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return row ;
    }
    public  static java.util.UUID detailsString(String s1){
    java.util.UUID uuid = null;
        //log
        try(SqlSession session = SqlSessionFactory.build()) {
            UuidMapper mapper = session.getMapper(UuidMapper.class);

         uuid = mapper.detailsString(s1);

        }
        catch (Exception e){
            e.printStackTrace();
        }
     return uuid;
    }
    public  static java.util.UUID detailsUuid(java.util.UUID s1){
        java.util.UUID uuid = null;
        //log
        try(SqlSession session = SqlSessionFactory.build()) {
            UuidMapper mapper = session.getMapper(UuidMapper.class);

            uuid = mapper.detailsUuid(s1);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return uuid;
    }
    public static int insertSomething(Mood something){
        System.out.println("insert something");
        int row = 0 ;
        //log
        try(SqlSession session = SqlSessionFactory.build()) {
            SomethingMapper mapper = session.getMapper(SomethingMapper.class);

              row = mapper.insert(something);
              System.out.println(row);
              session.commit();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return row;


    }
    public static JobDataSchema detailsSomething(Mood something){

        JobDataSchema schema =  null;

        //log
        try(SqlSession session = SqlSessionFactory.build()) {
            SomethingMapper mapper = session.getMapper(SomethingMapper.class);
           schema = mapper.details(something);




        }
        catch (Exception e){
            e.printStackTrace();
        }
       return schema ;


    }
}



