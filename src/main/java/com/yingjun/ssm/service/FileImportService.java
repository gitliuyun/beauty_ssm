package com.yingjun.ssm.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
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
	String importShopInfo(List<List<Object>> list);
	
	/**
	 * 导入开卡信息
	 * @param file
	 * @return
	 */
	String importCardInfo(List<List<Object>> list);
	
	/**
	 * 导入交易信息
	 * @param file
	 * @return
	 */
	String importTransactionInfo(File file)throws IOException, CloneNotSupportedException;
}
