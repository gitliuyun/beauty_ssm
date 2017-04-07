package com.yingjun.ssm.service;

import java.util.List;
import java.util.Map;
/**
 * 交易分析
 * @author yang
 *
 */
public interface TransactionAnalyzeService {

	/**
	 * 分析机型使用信息
	 * @param machineType
	 */
	void analyzeMachine(String machineType);
	
	/**
	 * 获取使用率前十名的机型以及使用率
	 * @return
	 */
	List<Map<String, Float>> getTopTenMachine(); 
	 
}
