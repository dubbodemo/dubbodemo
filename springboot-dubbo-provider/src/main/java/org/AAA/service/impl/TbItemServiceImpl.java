package org.AAA.service.impl;

import org.AAA.dao.TbItemDao;
import org.AAA.pojo.TbItem;
import org.AAA.service.TbItemService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;
@DubboService
public class TbItemServiceImpl implements TbItemService {

    @Override
    public List<TbItem> findAll() {
        return TbItemDao.getList();
    }
}
