package no.difi.sdp.webclient.web;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import no.difi.sdp.client.domain.digital_post.Sikkerhetsnivaa;
import no.difi.sdp.webclient.validation.Attachment;
import no.difi.sdp.webclient.validation.Ssn;

public class MessageCommand {

	@Ssn(message = "Ugyldig fødselsnummer.")
	private String ssn;
	
	@Size(min = 1, message = "Du må oppgi sensitiv tittel.")
	private String sensitiveTitle;

	@Size(min = 1, message = "Du må oppgi ikke-sensitiv tittel.")
	private String insensitiveTitle;

	@Attachment(message = "Du må oppgi vedlegg.")
	private MultipartFile attachment;

	@NotNull
	private Sikkerhetsnivaa securityLevel;
	
	private String emailNotification;
	
	@Pattern(regexp = "^[0-9\\s,]*$", message = "Ugyldig verdi.")
	private String emailNotificationSchedule;
	
	private String mobileNotification;
	
	@Pattern(regexp = "^[0-9\\s,]*$", message = "Ugyldig verdi.")
	private String mobileNotificationSchedule;
	
	private boolean requiresMessageOpenedReciept;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date delayedAvailabilityDate;
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSensitiveTitle() {
		return sensitiveTitle;
	}

	public void setSensitiveTitle(String sensitiveTitle) {
		this.sensitiveTitle = sensitiveTitle;
	}

	public String getInsensitiveTitle() {
		return insensitiveTitle;
	}
	
	public void setInsensitiveTitle(String insensitiveTitle) {
		this.insensitiveTitle = insensitiveTitle;
	}
	
	public MultipartFile getAttachment() {
		return attachment;
	}

	public void setAttachment(MultipartFile attachment) {
		this.attachment = attachment;
	}
	
	public Sikkerhetsnivaa getSecurityLevel() {
		return securityLevel;
	}
	
	public void setSecurityLevel(Sikkerhetsnivaa securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getEmailNotification() {
		return emailNotification;
	}

	public void setEmailNotification(String emailNotification) {
		this.emailNotification = emailNotification;
	}

	public String getEmailNotificationSchedule() {
		return emailNotificationSchedule;
	}

	public void setEmailNotificationSchedule(String emailNotificationSchedule) {
		this.emailNotificationSchedule = emailNotificationSchedule;
	}

	public String getMobileNotification() {
		return mobileNotification;
	}

	public void setMobileNotification(String mobileNotification) {
		this.mobileNotification = mobileNotification;
	}

	public String getMobileNotificationSchedule() {
		return mobileNotificationSchedule;
	}

	public void setMobileNotificationSchedule(String mobileNotificationSchedule) {
		this.mobileNotificationSchedule = mobileNotificationSchedule;
	}

	public boolean getRequiresMessageOpenedReciept() {
		return requiresMessageOpenedReciept;
	}

	public void setRequiresMessageOpenedReciept(boolean requiresMessageOpenedReciept) {
		this.requiresMessageOpenedReciept = requiresMessageOpenedReciept;
	}

	public Date getDelayedAvailabilityDate() {
		return delayedAvailabilityDate;
	}

	public void setDelayedAvailabilityDate(Date delayedAvailabilityDate) {
		this.delayedAvailabilityDate = delayedAvailabilityDate;
	}

}