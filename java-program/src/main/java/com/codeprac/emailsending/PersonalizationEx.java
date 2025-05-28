package com.codeprac.emailsending;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;

import java.io.IOException;

public class PersonalizationEx {
    public static void main(String[] args) throws IOException {
        Email from = new Email("deep@gmail.com");
        Email to = new Email("abc@gmail.com");
        Mail mail = new Mail();
        mail.setFrom(from);
        mail.setTemplateId("d-1245555787878787878");


        Personalization personalization = new Personalization();
        personalization.setFrom(from);
        personalization.addTo(to);
        mail.addPersonalization(personalization);

        SendGrid sg = new SendGrid("YOUR_API_KEY");
        Request request = new Request();
        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());

        Response response = sg.api(request);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
        System.out.println(response.getHeaders());
    }
}
