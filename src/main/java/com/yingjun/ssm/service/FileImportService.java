package com.yingjun.ssm.service;

import java.io.File;
/**
 * 文件导入
 * @author yang
 *
 */
public interface FileImportService {

	/**
	 * 导入商户信息
	 * @param file
	 * @return
	 */
	String importShopInfo(File file);
	
	/**
	 * 导入开卡信息
	 * @param file
	 * @return
	 */
	String importCardInfo(File file);
	
	/**
	 * 导入交易信息
	 * @param file
	 * @return
	 */
	String importTransactionInfo(File file);
	 
}
