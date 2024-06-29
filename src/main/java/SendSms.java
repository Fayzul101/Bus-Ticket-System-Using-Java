import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.lookups.v1.PhoneNumber;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class SendSms {
	    public static final String ACCOUNT_SID = "ACe26d8c303fbf8284fe13d9f7b75b5826";
	    public static final String AUTH_TOKEN = "c779b25432259d7a02cf4d41c47e3e16";
	    
	    SendSms(String m){
	    	Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
	    	Message message = Message.creator(
	    			new com.twilio.type.PhoneNumber("+88019********"),
	    			new com.twilio.type.PhoneNumber("+190347*****"),
	    			m
	    			).create();
	    			
	    			System.out.println(message.getSid());
	    }
}
