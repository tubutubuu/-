package org.example;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.dto.AllDataTypes;
import org.dto.Data;
import org.mapper.AllDataTypesMapper;
import org.mapper.DataMapper;

import java.io.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        SomethingLikeClient client = new SomethingLikeClient();
        client.search(1);

            // evaluated as
            // SELECT *
            //        FROM data
            //        LEFT JOIN dataRelatedSomething ON data.dataRelatedSomethingId = dataRelatedSomething.dataRelatedSomethingId
            //        LEFT JOIN something ON dataRelatedSomething.somethingId = something.somethingId
            //        WHERE  data.id = 1

            //expected output is
            //primary_field is 1, data_field1 is null, data_field2 is null, something_field is Value 1



    }

}