package Service;

import org.springframework.web.multipart.MultipartFile;

public interface Email_Service {

	public String sendMail(MultipartFile[] file, String to, String[] cc, String subject, String body);

}
