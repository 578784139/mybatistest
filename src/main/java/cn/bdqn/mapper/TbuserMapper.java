package cn.bdqn.mapper;

import cn.bdqn.entity.Tbuser;

import java.util.List;

/**
 * Created by HP on 2017/5/18.
 */
public interface TbuserMapper {
    public Tbuser login(Tbuser users);
    public int add(Tbuser users);
    public void update(Tbuser users);
    public int delete(int userid);
    public List<Tbuser> queryall();
    public int count();
    public Tbuser querybyid(int userid);
}

