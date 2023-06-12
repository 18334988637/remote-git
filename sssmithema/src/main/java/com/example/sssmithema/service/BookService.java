package com.example.sssmithema.service;

import com.example.sssmithema.domain.one;
import org.apache.ibatis.annotations.Insert;

public interface BookService {
     public void save(one book);
}
