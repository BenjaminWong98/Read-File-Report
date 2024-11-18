package com.benjamin.read_file_report;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class ReadFileReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadFileReportApplication.class, args);
	}

}
