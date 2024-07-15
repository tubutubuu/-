package org.example;


import org.example.AllDataTypes;
import org.apache.ibatis.annotations.*;

        import java.util.List;

public interface AllDataTypesMapper {

    @Select("SELECT * FROM all_data_types")
    AllDataTypes selectById();

}