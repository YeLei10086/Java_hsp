package homework.homework01;

import java.util.*;

/**
 * @author 叶磊
 */
public class Dao<T> {
    private Map<String,T> map = new HashMap<>();

    //保存 T 类型的对象到 Map 成员变量中
    public void save(String id,T entity){
        map.put(id, entity);
    }

    //从map中获取 id 对应的对象
    public T get(String id){
        return map.get(id);
    }

    //替换map中 key 为 id 的内容,改为 entity 对象
    public void update(String id,T entity){
          map.put(id,entity);
    }

    //从map中删除指定 id 对象
    public void delete(String id){
        map.remove(id);
    }

    //返回map中存放的所有 T 对象
    public List<T> list(){
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(get(key));
        }
        return list;
    }

}
