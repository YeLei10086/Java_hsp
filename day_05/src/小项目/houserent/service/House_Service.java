package 小项目.houserent.service;

import 小项目.houserent.model.House;

public class House_Service {

    private House[] houses;
    private int houseNum = 1;   //定义当前有多少个房屋信息,由于构造器里已添加了一个默认房源，因此 houseNum = 1；
    private int idCounter = 1;  //记录当前id的自增长

    public House_Service(int size) {
        houses = new House[size];
        houses[0] = new House(1, "张三", "112", "海淀区", 2000, "未出租");
    }

    /**
     * 显示房屋列表
     *
     * @return
     */
    public House[] list_house() {
        return houses;
    }

    /**
     * 添加一个房源信息
     *
     * @param newHouse
     * @return
     */
    public boolean add_house(House newHouse) {
        //定义一个变量 houseNum，用于记录房源数量，再判断容量是否已经满了
        if (houseNum == houses.length) {
//            System.out.println("容量已满...");
//            return false;
            //动态扩容数组  奈斯！！！
            House[] newArr = new House[houses.length + 1];
            for (int i = 0; i < houses.length; i++) {
                newArr[i] = houses[i];
            }
            newArr[newArr.length - 1] = newHouse;
            for (int i = 0; i < newArr.length; i++) {
                houses = newArr;
            }
        }
        //如果没满 就将新增的房源 放入房源计数器
        houses[houseNum++] = newHouse;
        //房源ID 应设置为自增的，而不是手动添加，因此在房源进入前先进行++操作,实现自动更新id
        newHouse.setId(++idCounter);
        return true;
    }

    /**
     * 根据ID删除房源信息
     *
     * @param id
     * @return
     */
    public boolean del_house(int id) {
        int index = -1; //用作元素下标
        for (int i = 0; i < houseNum; i++) {
            if (id == houses[i].getId()) {   //要删除的房源id，是数组下标为i的元素
                index = i;  // 使用index 记录 i的位置
            }
        }
        if (index == -1) {   //说明id不存在
            return false;
        }
        //如果找到了（巧妙）
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNum] = null;  //把当前存在的房屋信息的最后一个，设置为null;
        return true;
    }

    /**
     * 根据id查找房源，返回House对象或者null
     *
     * @param id
     * @return
     */
    public House findById(int id) {
        for (int i = 0; i < houseNum; i++) {
            if (id == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }
}
