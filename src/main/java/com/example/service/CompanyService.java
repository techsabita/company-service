package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CompanyDTO;
import com.example.entity.Company;
import com.example.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;

	public CompanyDTO create(CompanyDTO companyDTO) {
		Company company=new Company();
		
		company.setId(companyDTO.getId());
		company.setName(companyDTO.getName());
		company.setAge(companyDTO.getAge());
		company.setAddresss(companyDTO.getAddress());
		
		companyRepository.saveAndFlush(company);
		return companyDTO;
	}

	public CompanyDTO update(CompanyDTO companyDTO) {
		
		Company company=new Company();
		
		company.setId(companyDTO.getId());
		company.setName(companyDTO.getName());
		company.setAge(companyDTO.getAge());
		company.setAddresss(companyDTO.getAddress());
		
		companyRepository.saveAndFlush(company);
		return companyDTO;
	}
	

}
