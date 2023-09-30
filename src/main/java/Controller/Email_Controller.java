package Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Service.Email_Service;

@RestController
@RequestMapping("/mail")
public class Email_Controller {

	private Email_Service emailservice;

	public Email_Controller(Email_Service emailservice) {
		this.emailservice = emailservice;
	}

	@PostMapping("/sendmail")
	public String sendMail(@RequestParam(value = "file", required = false) MultipartFile[] file, String to, String[] cc,
			String subject, String body) {
		return emailservice.sendMail(file, to, cc, subject, body);
	}

}
