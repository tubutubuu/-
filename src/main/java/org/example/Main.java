package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;
import java.nio.file.Path;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
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
        }
        try (SqlSession session = sqlSessionFactory.openSession()) {
            AllDataTypesMapper mapper = session.getMapper(AllDataTypesMapper.class);
            //AllDataTypesMapper mapper = session.getMapper(AllDataTypesMapper.class);
            //AllDataTypes allDataTypes = mapper.selectById();
            // System.out.println(allDataTypes);=
           AllDataTypes t =  mapper.selectById();
           System.out.println(t);

           // System.out.println("column value is  "+blog.text );
        }


    }

}