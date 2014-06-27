package com.gcj.dao;

import com.gcj.bean.DBBean;
import com.gcj.common.Constant;
import com.gcj.utils.ConfigUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by gaochuanjun on 14-6-12.
 */
public class JDBCUtils {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public DBBean getConf() {
        ConfigUtils conf = new ConfigUtils(Constant.confPath);
        String url = "jdbc:mysql://" + conf.getString("mysql_ip") + "/" + conf.getString("database") + "?useUnicode=true&characterEncoding=utf8";
        return new DBBean(url, conf.getString("mysql_user"), conf.getString("mysql_pwd"));
    }

    public Connection getConn(DBBean dbBean) throws SQLException {
        return DriverManager.getConnection(dbBean.getUrl(), dbBean.getUser(), dbBean.getPwd());
    }


    public static void main(String[] args) {
        JDBCUtils jdbcUtils = new JDBCUtils();
        DBBean dbBean = jdbcUtils.getConf();
        System.out.println("URL: " + dbBean.getUrl());
        System.out.println("User: " + dbBean.getUser());
        System.out.println("pwd: " + dbBean.getPwd());
    }
}
