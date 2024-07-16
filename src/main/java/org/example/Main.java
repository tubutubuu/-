package org.example;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mapper.AllDataTypesMapper;

import java.io.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

     //   new PostgresExample().execute();
       // System.exit(1);
        SqlSessionFactory sqlSessionFactory = null;
        String line;

        try
        {
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileReader("./config.xml"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("no configFile");
            System.exit(-1);
        }
        try (SqlSession session = sqlSessionFactory.openSession()) {
            AllDataTypesMapper mapper = session.getMapper(AllDataTypesMapper.class);
            //AllDataTypesMapper mapper = session.getMapper(AllDataTypesMapper.class);
            //AllDataTypes allDataTypes = mapper.selectById();
            // System.out.println(allDataTypes);=
           List<AllDataTypes> t =  mapper.selectById();
           System.out.println(t);

           // System.out.println("column value is  "+blog.text );
        }


    }

}