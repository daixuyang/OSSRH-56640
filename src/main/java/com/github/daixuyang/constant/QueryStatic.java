package com.github.daixuyang.constant;

/**
 * 常用常量
 * @author 代旭杨
 */
public interface QueryStatic {
    String SERIAL_VERSION_UID = "serialVersionUID";
    /**
     * 默认映射的表名
     */
    String DEFAULT_PREFIX = "t.";
    String EMPTY = "";
    String LOWER_COLON = ":";
    String LOWER_QUESTION = "?";
    String POINT = ".";


    /**
     * 根据表名获取前缀
     * @param field 表映射的名称
     * @return 表名+列名
     */
    public static String tableField(String field) {
        return QueryStatic.DEFAULT_PREFIX + field;
    }
}
