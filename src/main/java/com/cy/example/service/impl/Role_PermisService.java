package com.cy.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cy.example.model.Page;
import com.cy.example.carrier.Role_Permis_Ca;
import com.cy.example.mapper.system.Role_PermisMapper;
import com.cy.example.service.IRole_PermisService;

@Service
public class Role_PermisService extends ServiceImpl<Role_PermisMapper, Role_Permis_Ca>
	implements IRole_PermisService{
	
	@Autowired
	private Role_PermisMapper mapper;

	public List<Role_Permis_Ca> searchAll(Role_Permis_Ca rp, Page page) {
		// TODO Auto-generated method stub
		return mapper.searchAll(rp, page);
	}

	public int searchAllCount(Role_Permis_Ca rp) {
		// TODO Auto-generated method stub
		return mapper.searchAllCount(rp);
	}

	public int findAllCount(Page page) {
		// TODO Auto-generated method stub
		return mapper.findAllCount(page);
	}

	public List<Role_Permis_Ca> findAll(Page page) {
		// TODO Auto-generated method stub
		return mapper.findAll(page);
	}

	
}
