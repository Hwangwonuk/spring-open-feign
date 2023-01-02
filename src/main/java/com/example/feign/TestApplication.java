package com.example.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients
 * FeignClient를 사용하기 위해서는 해당 어노테이션을 필수로 적용해야 합니다.
 * 일반적으로 해당 어노테이션은 Main Application Class에 설정하고
 * 이 어노테이션은 하위 클래스를 탐색하면서 @FeignClient를 찾아 구현체를 생성하는 역할을 합니다.
 * basePackages 또는 basePackageClasses 속성을 통해 탐색할 범위를 설정할 수 있습니다.
 */
@EnableFeignClients
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
