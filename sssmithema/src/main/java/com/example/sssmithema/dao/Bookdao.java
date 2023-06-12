package com.example.sssmithema.dao;

import com.example.sssmithema.domain.one;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface Bookdao {
    @Insert("insert into  one values (null,#{sname},#{ssname},#{image}}}))")
    public void save(one book);
}

