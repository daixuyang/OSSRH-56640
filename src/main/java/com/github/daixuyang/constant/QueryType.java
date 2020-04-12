package com.github.daixuyang.constant;

/**
 * @author 代旭杨
 */
public interface QueryType {

    String EQ = "eq";
    String LIKE = "like";
    String LIKE_LEFT = "likeLeft";
    String LIKE_RIGHT = "likeRight";
    /** 小于等于 */
    String LE = "le";
    /** 小于 */
    String LT = "lt";
    /** 大于等于 */
    String GE = "ge";
    /** 大于 */
    String GT = "gt";

    /** 为 null */
    String IS_NULL = "isNull";

    /** 不为 null */
    String IS_NOT_NULL = "isNotNull";

    /** 不空 */
    String IS_EMPTY = "isEmpty";

    /** 不为空 */
    String IS_NOT_EMPTY = "isNotEmpty";



    /** 忽略字段 */
    String IGNORE = "ignore";


}
