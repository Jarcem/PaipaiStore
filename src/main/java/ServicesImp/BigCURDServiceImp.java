package ServicesImp;

/*
  Author: Jarcem
  Date: 2019/5/21
  Time: 18:53
  Purpose: 
*/

import Misc.DBKit;
import Services.BigCURDService;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BigCURDServiceImp implements BigCURDService {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    int result = 0;
    Map<String, Object> map = null;
    List<Object> objectList = null;
    String sqlStr = null;
    Class aClass = null;
    Constructor constructor = null;
    Object object = null;
    Method[] method = null;
    Field[] fields = null;

    @Override
    public int add(String formName, List<Map<String, Object>> params) {
        result = 0;
        sqlStr = "insert into " + formName + "(";
        try {
            if (params != null && params.size() > 0) {
                for (Map<String, Object> mp : params) {
                    sqlStr += mp.get("name") + ",";
                }
                sqlStr = sqlStr.substring(0, sqlStr.length() - 1) + ") values (";
                for (Map<String, Object> mp : params) {
                    sqlStr += mp.get("value") + ",";
                }
                sqlStr = sqlStr.substring(0, sqlStr.length() - 1) + ")";
            }
            connection = DBKit.getConn();
            preparedStatement = connection.prepareStatement(sqlStr);
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBKit.closeAll(connection, preparedStatement, resultSet);
        }
        return result;
    }

    @Override
    public int delete(String formName, List<Map<String, Object>> params, Object obj) {
        result = 0;
        sqlStr = "delete from " + formName + " where 1=1";
        try {
            aClass = obj.getClass();
            fields = aClass.getDeclaredFields();
            constructor = aClass.getConstructor();
            if (params != null && params.size() > 0) {
                for (Map<String, Object> mp : params) {
                    sqlStr += " and " + mp.get("name") + " " + mp.get("rea") + " " + mp.get("value");
                }
            }
            connection = DBKit.getConn();
            preparedStatement = connection.prepareStatement(sqlStr);
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBKit.closeAll(connection, preparedStatement, resultSet);
        }
        return result;
    }

    @Override
    public int update(String formName, List<Map<String, Object>> params, String identify) {
        result = 0;
        sqlStr = "update " + formName + " set ";
        String sqlStrTemp = "";
        try {
            if (params != null && params.size() > 0) {
                for (Map<String, Object> mp : params) {
                    sqlStrTemp += ", " + mp.get("name") + "=" + mp.get("value");
                }
                sqlStr+=sqlStrTemp.substring(1);
            }
            sqlStr += " where " + identify;
            connection = DBKit.getConn();
            preparedStatement = connection.prepareStatement(sqlStr);
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBKit.closeAll(connection, preparedStatement, resultSet);
        }

        return result;
    }

    @Override
    public List<Object> query(String formName, List<Map<String, Object>> params, Object obj) {
        objectList = new ArrayList<>();
        sqlStr = "select * from " + formName + " where 1=1";
        try {
            aClass = obj.getClass();
            fields = aClass.getDeclaredFields();
            constructor = aClass.getConstructor();
            if (params != null && params.size() > 0) {
                for (Map<String, Object> mp : params) {
                    sqlStr += " and " + mp.get("name") + " " + mp.get("rea") + " " + mp.get("value") != null ? mp.get("value") : " ";
                }
            }
            connection = DBKit.getConn();
            preparedStatement = connection.prepareStatement(sqlStr);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                object = constructor.newInstance();
                for (int i = 0; i < fields.length; i++) {
                    fields[i] = aClass.getDeclaredField(fields[i].toString().substring(fields[i].toString().lastIndexOf(".") + 1));
                    fields[i].setAccessible(true);
                    fields[i].set(object, resultSet.getObject(i + 1));
                }
                objectList.add(object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBKit.closeAll(connection, preparedStatement, resultSet);
        }

        return objectList;
    }

    @Override
    public List<Object> query(String formName, Object obj) {
        objectList = new ArrayList<>();
        sqlStr = "select * from " + formName + " where 1=1";
        try {
            aClass = obj.getClass();
            fields = aClass.getDeclaredFields();
            constructor = aClass.getConstructor();
            connection = DBKit.getConn();
            preparedStatement = connection.prepareStatement(sqlStr);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                object = constructor.newInstance();
                for (int i = 0; i < fields.length; i++) {
                    fields[i] = aClass.getDeclaredField(fields[i].toString().substring(fields[i].toString().lastIndexOf(".") + 1));
                    fields[i].setAccessible(true);
                    fields[i].set(object, resultSet.getObject(i + 1));
                }
                objectList.add(object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBKit.closeAll(connection, preparedStatement, resultSet);
        }

        return objectList;
    }

    @Override
    public int loginCheck(String uid, String pwd) {
        sqlStr = "select * from info_user where account_status = 1 and user_id = ? and user_password = ?";
        try {
            connection = DBKit.getConn();
            preparedStatement = connection.prepareStatement(sqlStr);
            preparedStatement.setString(1, uid);
            preparedStatement.setString(2, pwd);
            resultSet = preparedStatement.executeQuery();
            resultSet.last();
            result = resultSet.getRow();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBKit.closeAll(connection, preparedStatement, resultSet);
        }
        return result;
    }
}
