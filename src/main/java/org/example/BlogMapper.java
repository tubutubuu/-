package org.example;

import org.apache.ibatis.annotations.Select;

public interface BlogMapper {
    @Select("SELECT * FROM blog WHERE text = #{id}")
    Blog selectBlog(String id);
}
