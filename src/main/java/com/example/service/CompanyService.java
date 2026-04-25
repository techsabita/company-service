package com.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

	public List<CompanyDTO> getAll() {
		
		List<CompanyDTO> companyDTOList=new ArrayList<CompanyDTO>();
		List<Company> comList=companyRepository.findAll();
		
		for (Company company : comList) {
			
			CompanyDTO companyDTO=new CompanyDTO();
			
			companyDTO.setId(company.getId());
			companyDTO.setName(company.getName());
			companyDTO.setAge(company.getAge());
			companyDTO.setAddress(company.getAddresss());
			
			companyDTOList.add(companyDTO);
			
			
		}
		return companyDTOList;
	}
	

}
