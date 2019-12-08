package com.application.service;

import java.util.List;

import com.application.dto.ShareHistory;

public interface ShareHistoryService {
	
	List<ShareHistory> getShareHistory(String shareSymbol) throws Exception;

}
