package com.rays.service02.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service03", url = "http://localhost:8083")
public interface Service03FeignClient {

	@GetMapping("/service03/User/display")
	public String display();
}
