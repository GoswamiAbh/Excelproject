package com.abhi;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReportRestController {
	

	@Autowired
	private ReportService reportService;

	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws IOException {
        
		//which format we are send to the client
		response.setContentType("application/octet-stream");
        
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=courses.xls";
		response.setHeader(headerKey, headerValue);

		reportService.generateExcel(response);
	}
}
