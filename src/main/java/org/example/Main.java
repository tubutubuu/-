package org.example;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.dto.AllDataTypes;
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
           System.out.println(t.get(0));
//AllDataTypes{serialCol=1, intCol=1, smallintCol=2, bigintCol=1234567890123456789, decimalCol=1234, numericCol=1234, realCol=1.23, doubleCol=1.23456789, moneyCol=$1,234.56, charCol='char10    ', varcharCol='varchar255', textCol='Some text', byteaCol=ޭ��, dateCol=2024-07-15, timeCol=12:34:56, timetzCol=21:34:56, timestampCol=2024-07-15 12:34:56.0, timestamptzCol=2024-07-15 21:34:56.0, intervalCol='1 year 2 mons 3 days', booleanCol=true, pointCol='(1,2)', lineCol='{1,-1,0}', lsegCol='[(0,0),(1,1)]', boxCol='(1,1),(0,0)', pathCol='[(0,0),(1,1)]', polygonCol='((0,0),(1,1),(0,1))', circleCol='<(1,1),1>', cidrCol='192.168.1.0/24', inetCol='192.168.1.1', macaddrCol='08:00:2b:01:02:03', uuidCol=123e4567-e89b-12d3-a456-426614174000, jsonCol='{"key": "value"}', jsonbCol='{"key": "value"}', xmlCol='<foo>bar</foo>', arrayCol=null, compositeCol=null}
           // System.out.println("column value is  "+blog.text );
        }


    }

}