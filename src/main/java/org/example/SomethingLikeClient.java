package org.example;

import org.apache.ibatis.session.SqlSession;
import org.dto.Data;
import org.mapper.DataMapper;

public class SomethingLikeClient {
    public void search(int value){
        //log
        try(SqlSession session = SqlSessionFactory.build()) {
            DataMapper mapper = session.getMapper(DataMapper.class);
            Data data = mapper.select(value);
            if(data ==null){
                System.out.println("none");
            }else{
                System.out.println(String.format("primary_field is %s, data_field1 is %s, data_field2 is %s, something_field is %s",data.primary_field+"",data.data_field1,data.data_field2,data.something_field));
            System.out.println("json is "+ data.json);
            }
                    }
        catch (Exception e){
            e.printStackTrace();
        }
        //log
    }
}
