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
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            //AllDataTypesMapper mapper = session.getMapper(AllDataTypesMapper.class);
            //AllDataTypes allDataTypes = mapper.selectById();
            // System.out.println(allDataTypes);
            Blog blog = mapper.selectBlog("pompo");
            System.out.println(blog.text);

           // System.out.println("column value is  "+blog.text );
        }


    }

}