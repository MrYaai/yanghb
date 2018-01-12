package com.blog.model.dto;

import com.blade.jdbc.core.ActiveRecord;
import com.blog.model.entity.Contents;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 文章归档
 * <p>
 */
@Data
public class Archive extends ActiveRecord {

    private String         date_str;
    private Date           date;
    private String         count;
    private List<Contents> articles;

}
