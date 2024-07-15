package org.example;

import org.apache.ibatis.annotations.Select;

public interface BlogMapper {
    @Select("SELECT * FROM a WHERE text = #{id}")
    Blog selectBlog(String id);
}
