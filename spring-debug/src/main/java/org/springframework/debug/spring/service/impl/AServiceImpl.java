package org.springframework.debug.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.debug.spring.service.BService;
import org.springframework.stereotype.Service;

/**
 * @Author: zhoudong
 * @Description:
 * @Date: 2023-03-06 17:55
 * @Version:
 **/
@Service
public class AServiceImpl {

	@Autowired
	private BService bService;
}
