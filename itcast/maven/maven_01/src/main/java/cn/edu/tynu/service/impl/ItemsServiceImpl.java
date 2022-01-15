package cn.edu.tynu.service.impl;
import cn.edu.tynu.dao.ItemsDao;
import cn.edu.tynu.domain.Items;
import cn.edu.tynu.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
