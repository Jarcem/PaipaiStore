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
    public int add(String formName, List<Map<String, Object>> params, Object obj) throws Exception {
        return 0;
    }

    @Override
    public int delete(String formName, List<Map<String, Object>> params, Object obj) throws Exception {
        return 0;
    }

    @Override
    public int update(String formName, List<Map<String, Object>> params, Object obj) throws Exception {
        return 0;
    }

    @Override
    public List<Object> query(String formName, List<Map<String, Object>> params, Object obj) throws Exception {
        objectList = new ArrayList<>();
        aClass = obj.getClass();
        fields = aClass.getDeclaredFields();
        constructor = aClass.getConstructor();
        sqlStr = "select * from "+formName+" where 1=1";
        if (params != null && params.size()>0){
            for (Map<String, Object> mp : params){
                sqlStr+= " and "+mp.get("name")+" "+mp.get("rea")+" "+mp.get("value");
            }
        }
        connection = DBKit.getConn();
        preparedStatement = connection.prepareStatement(sqlStr);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            object = constructor.newInstance();
            for (int i = 0; i < fields.length; i++) {
                fields[i] = aClass.getDeclaredField(fields[i].toString().substring(fields[i].toString().lastIndexOf(".")+1, fields[i].toString().length()));
                fields[i].setAccessible(true);
                fields[i].set(object, resultSet.getObject(i+1));
            }
            objectList.add(object);
        }

        return objectList;
    }
}
