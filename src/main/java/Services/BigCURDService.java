package Services;

/*
  Author: Jarcem
  Date: 2019/5/21
  Time: 18:45
  Purpose: 通用增删改查聚合类
*/

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface BigCURDService {
    public int add(String formName, List<Map<String, Object>> params, Object obj) throws Exception;
    public int delete(String formName, List<Map<String, Object>> params, Object obj) throws Exception;
    public int update(String formName, List<Map<String, Object>> params, Object obj) throws Exception;
    public List<Object> query(String formName, List<Map<String, Object>> params, Object obj) throws Exception;
}
