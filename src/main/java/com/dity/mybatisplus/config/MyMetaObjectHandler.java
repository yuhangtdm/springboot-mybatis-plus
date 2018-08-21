package com.dity.mybatisplus.config;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * @author:yuhang
 * @Date:2018/8/21
 * 设置自动填充
 */
public class MyMetaObjectHandler extends MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        Object testType = getFieldValByName("createTime", metaObject);
        if (testType == null) {
            setFieldValByName("createTime", new Date(), metaObject);//mybatis-plus版本2.0.9+
        }
        Object testType2 = getFieldValByName("updateTime", metaObject);
        if (testType2 == null) {
            setFieldValByName("updateTime", new Date(), metaObject);//mybatis-plus版本2.0.9+
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("updateTime", new Date(), metaObject);//mybatis-plus版本2.0.9+
    }
}
