package cn.bishiti.base.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bishiti.base.dao.TUserMapper;
import cn.bishiti.base.model.TUser;
import cn.bishiti.base.service.TUserService;

@Service
public class TUserServiceImpl implements TUserService{

	@Autowired
	private TUserMapper tUserMapper;
	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tUserMapper.deleteByPrimaryKey(id);
	}

	public int insert(TUser record) {
		// TODO Auto-generated method stub
		return tUserMapper.insert(record);
	}

	public int insertSelective(TUser record) {
		// TODO Auto-generated method stub
		return tUserMapper.insertSelective(record);
	}

	public TUser selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tUserMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(TUser record) {
		// TODO Auto-generated method stub
		return tUserMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TUser record) {
		// TODO Auto-generated method stub
		return tUserMapper.updateByPrimaryKey(record);
	}

}