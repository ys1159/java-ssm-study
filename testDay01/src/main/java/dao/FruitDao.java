package dao;

import pojo.Fruit;

import java.util.List;

public interface FruitDao {
    //获取所有的库存列表信息
    List<Fruit> getFruitList();
    //新增库存
    boolean addFruit(Fruit fruit);

    //修改库存
    boolean updateFruit(Fruit fruit);

    //根据名称查询特定库存
    Fruit getFruitByFname(String fname);

    //删除特定库存记录
    boolean delFruit(String fname);
}