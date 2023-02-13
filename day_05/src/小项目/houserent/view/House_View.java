package 小项目.houserent.view;

import 小项目.houserent.model.House;
import 小项目.houserent.service.House_Service;
import 小项目.houserent.utils.Utility;

public class House_View {

    private boolean falg = true;    //控制显示菜单
    private char key;    //接收用户选择
    private House_Service house_service = new House_Service(2);


    public void exit() {
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            falg = false;
        }
    }

    public void updateHouse(){
        System.out.println("=========================修改房屋信息=========================");
        System.out.println("请选择待修改的房屋编号(-1退出)：");
        int id = Utility.readInt();
        if (id == -1){
            System.out.println("=========================放弃修改房屋信息=========================");
            return;
        }

        House house = house_service.findById(id);
        if (house == null){
            System.out.println("=========================房源号不存在,修改房源信息失败!=========================");
            return;
        }else {
            System.out.print("姓名("+house.getName()+"):");
            String name = Utility.readString(8,"");
            if (!"".equals(name)){
                house.setName(name);
            }
            System.out.print("电话("+house.getPhone()+"):");
            String phone = Utility.readString(12,"");
            if (!"".equals(phone)){
                house.setPhone(phone);
            }
            System.out.print("地址("+house.getAddress()+"):");
            String address = Utility.readString(16,"");
            if (!"".equals(address)){
                house.setAddress(address);
            }
            System.out.print("租金("+house.getRent()+"):");
            int rent = Utility.readInt(-1);
            if (rent != -1){
                house.setRent(rent);
            }
            System.out.print("状态("+house.getState()+"):");
            String state = Utility.readString(3,"");
            if (!"".equals(state)){
                house.setState(state);
            }
            System.out.println("=========================修改房源信息成功!=========================");
        }
    }

    public void findHouse() {
        System.out.println("=========================查找房屋=========================");
        System.out.print("请输入你要查找的id:");
        int id = Utility.readInt();
        House house_serviceById = house_service.findById(id);
        if (house_serviceById != null){
            System.out.println(house_serviceById);
        }else {
            System.out.println("=========================房源号不存在,查找房源信息失败!=========================");
        }

    }

    public void delHouse() {
        System.out.println("请选择待删除房屋编号(-1退出)：");
        int id = Utility.readInt();
        if (id == -1) {
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (house_service.del_house(id)) {
                System.out.println("=========================删除房源信息成功=========================");
            } else {
                System.out.println("=========================房源号不存在,删除房源信息失败!=========================");
            }
        } else {
            System.out.println("=========================放弃删除房源信息=========================");
        }
    }

    public void addHouse() {
        System.out.println("=========================房屋出租系统=========================");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态(未出租/已出租)：");
        String state = Utility.readString(3);
        House houses = new House(0, name, phone, address, rent, state);
        if (house_service.add_house(houses)) {
            System.out.println("=========================添加房源成功=========================\n");
        } else {
            System.out.println("=========================添加房源失败=========================\n");
        }
    }

    public void listHouse() {
        System.out.println("=========================房屋出租系统=========================");
        System.out.println("编号\t\t租客\t\t电话\t\t地址\t\t租金\t\t状态(未出租/已出租):");
        House[] houses = house_service.list_house();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=========================房源列表显示完成=========================\n");
    }

    //显示主菜单
    public void mainMenu() {

        do {
            System.out.println("====================房屋出租系统====================");
            System.out.println("\t\t\t 1 新 增 房 源");
            System.out.println("\t\t\t 2 查 找 房 源");
            System.out.println("\t\t\t 3 删 除 房 源");
            System.out.println("\t\t\t 4 修 改 房 源 信 息");
            System.out.println("\t\t\t 5 房 源 列 表");
            System.out.println("\t\t\t 6 退       出");

            System.out.print("请选择菜单列表(1-6)：");
            key = Utility.readMenuSelection();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
                default:
            }
        } while (falg);
    }
}
