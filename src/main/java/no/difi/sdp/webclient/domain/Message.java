package no.difi.sdp.webclient.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import no.difi.begrep.Reservasjon;
import no.difi.begrep.Status;
import no.difi.sdp.client.domain.digital_post.Sikkerhetsnivaa;
import no.difi.sdp.webclient.validation.Ssn;

@Entity
public class Message {

	@Id
	@GeneratedValue
	private Long id;
	
	@Ssn
	private String ssn;
	
	@NotNull
	@Size(min = 1)
	private String sensitiveTitle;
	
	@NotNull
	@Size(min = 1)
	private String insensitiveTitle;
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] attachment;
	
	private String attachmentFilename;
	
	private String attachmentMimetype;
	
	@NotNull
	private Sikkerhetsnivaa securityLevel;
	
	private String emailNotification;
	
	private String emailNotificationSchedule;
	
	private String mobileNotification;
	
	private String mobileNotificationSchedule;
	
	private boolean requiresMessageOpenedReciept;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date delayedAvailabilityDate;
	
	@Enumerated(EnumType.STRING)
	private Status contactRegisterStatus;
	
	@Enumerated(EnumType.STRING)
	private Reservasjon reservationStatus;
	
	private String email;
	
	private String mobile;
	
	@Lob
	private byte[] postboxCertificate;
	
	private String postboxAddress;
	
	private String postboxVendorOrgNumber;
	
	private String conversationId;
	
	@Lob
	private String xmlRetrievePersonsRequest;
	
	@Lob
	private String xmlRetrievePersonsRequestPayload;
	
	@Lob
	private String xmlRetrievePersonsResponse;
	
	@Lob
	private String xmlRetrievePersonsResponsePayload;
	
	@Lob
	private String xmlSendMessageRequest;
	
	@Lob
	private String xmlSendMessageRequestPayload;
	
	@Lob
	private String xmlSendMessageResponse;
	
	@Lob
	private String xmlRetrieveMessageRecieptRequest;
	
	@Lob
	private String xmlRetrieveMessageRecieptResponse;
	
	@Lob
	private String xmlRetrieveMessageRecieptResponsePayload;
	
	private MessageStatus status;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}


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
	
	public byte[] getAttachment() {
		return attachment;
	}
	
	public Message setAttachment(byte[] attachment) {
        this.attachment = attachment;
        return this;
    }
	
	public String getAttachmentFilename() {
		return attachmentFilename;
	}

	public Message setAttachmentFilename(String attachmentFilename) {
        this.attachmentFilename = attachmentFilename;
        return this;
    }

	public String getAttachmentMimetype() {
		return attachmentMimetype;
	}

	public Message setAttachmentMimetype(String attachmentMimetype) {
        this.attachmentMimetype = attachmentMimetype;
        return this;
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

	public Status getContactRegisterStatus() {
		return contactRegisterStatus;
	}

	public void setContactRegisterStatus(Status contactRegisterStatus) {
		this.contactRegisterStatus = contactRegisterStatus;
	}

	public Reservasjon getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(Reservasjon reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public byte[] getPostboxCertificate() {
		return postboxCertificate;
	}

	public void setPostboxCertificate(byte[] postboxCertificate) {
		this.postboxCertificate = postboxCertificate;
	}

	public String getPostboxAddress() {
		return postboxAddress;
	}

	public void setPostboxAddress(String postboxAddress) {
		this.postboxAddress = postboxAddress;
	}

	public String getPostboxVendorOrgNumber() {
		return postboxVendorOrgNumber;
	}

	public void setPostboxVendorOrgNumber(String postboxVendorOrgNumber) {
		this.postboxVendorOrgNumber = postboxVendorOrgNumber;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	
	public String getXmlRetrievePersonsRequest() {
		return xmlRetrievePersonsRequest;
	}

	public void setXmlRetrievePersonsRequest(String xmlRetrievePersonsRequest) {
		this.xmlRetrievePersonsRequest = xmlRetrievePersonsRequest;
	}

	public String getXmlRetrievePersonsRequestPayload() {
		return xmlRetrievePersonsRequestPayload;
	}

	public void setXmlRetrievePersonsRequestPayload(String xmlRetrievePersonsRequestPayload) {
		this.xmlRetrievePersonsRequestPayload = xmlRetrievePersonsRequestPayload;
	}

	public String getXmlRetrievePersonsResponse() {
		return xmlRetrievePersonsResponse;
	}

	public void setXmlRetrievePersonsResponse(String xmlRetrievePersonsResponse) {
		this.xmlRetrievePersonsResponse = xmlRetrievePersonsResponse;
	}

	public String getXmlRetrievePersonsResponsePayload() {
		return xmlRetrievePersonsResponsePayload;
	}

	public void setXmlRetrievePersonsResponsePayload(String xmlRetrievePersonsResponsePayload) {
		this.xmlRetrievePersonsResponsePayload = xmlRetrievePersonsResponsePayload;
	}

	public String getXmlSendMessageRequest() {
		return xmlSendMessageRequest;
	}

	public void setXmlSendMessageRequest(String xmlSendMessageRequest) {
		this.xmlSendMessageRequest = xmlSendMessageRequest;
	}

	public String getXmlSendMessageRequestPayload() {
		return xmlSendMessageRequestPayload;
	}

	public void setXmlSendMessageRequestPayload(String xmlSendMessageRequestPayload) {
		this.xmlSendMessageRequestPayload = xmlSendMessageRequestPayload;
	}

	public String getXmlSendMessageResponse() {
		return xmlSendMessageResponse;
	}

	public void setXmlSendMessageResponse(String xmlSendMessageResponse) {
		this.xmlSendMessageResponse = xmlSendMessageResponse;
	}

	public String getXmlRetrieveMessageRecieptRequest() {
		return xmlRetrieveMessageRecieptRequest;
	}

	public void setXmlRetrieveMessageRecieptRequest(String xmlRetrieveMessageRecieptRequest) {
		this.xmlRetrieveMessageRecieptRequest = xmlRetrieveMessageRecieptRequest;
	}

	public String getXmlRetrieveMessageRecieptResponse() {
		return xmlRetrieveMessageRecieptResponse;
	}

	public void setXmlRetrieveMessageRecieptResponse(String xmlRetrieveMessageRecieptResponse) {
		this.xmlRetrieveMessageRecieptResponse = xmlRetrieveMessageRecieptResponse;
	}

	public String getXmlRetrieveMessageRecieptResponsePayload() {
		return xmlRetrieveMessageRecieptResponsePayload;
	}

	public void setXmlRetrieveMessageRecieptResponsePayload(String xmlRetrieveMessageRecieptResponsePayload) {
		this.xmlRetrieveMessageRecieptResponsePayload = xmlRetrieveMessageRecieptResponsePayload;
	}

	public MessageStatus getStatus() {
		return status;
	}

	public void setStatus(MessageStatus status) {
		this.status = status;
	}
	
	public static List<Integer> toIntList(String string) {
		if (string == null || string.isEmpty()) {
			return null;
		}
		List<Integer> intList = new ArrayList<Integer>();
		String[] intStrings = string.split(",");
		for (String intString : intStrings) {
			intList.add(Integer.valueOf(intString));
		}
		return intList;
	}

}