package com.cj.service;

import java.util.List;

import com.cj.dto.FreeDTO;

public interface FreeService {
	public List<FreeDTO> freeList() throws Exception;
	public FreeDTO freeDetail(int seq) throws Exception;
	public void freeInsert(FreeDTO dto) throws Exception;
	public void freeDelete(int seq) throws Exception;
	public void freeEdit(FreeDTO dto) throws Exception;
}
