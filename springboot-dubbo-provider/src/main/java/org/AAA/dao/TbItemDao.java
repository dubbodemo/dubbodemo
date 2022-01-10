package org.AAA.dao;

import org.AAA.pojo.TbItem;

import java.util.ArrayList;
import java.util.List;

public class TbItemDao {
    static List<TbItem> list;
    static{
        list = new ArrayList<TbItem>();
        for (int i=0;i<10;i++){
            list.add(new TbItem(i+1L,"哇哈哈哈哈哈哈"+i,100D));
        }

    }
    public static List<TbItem> getList() {
        return list;
    }
}
