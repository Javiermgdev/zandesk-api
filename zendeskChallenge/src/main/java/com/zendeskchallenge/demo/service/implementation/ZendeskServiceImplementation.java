package com.zendeskchallenge.demo.service.implementation;

import com.zendeskchallenge.demo.service.ZendeskService;
import org.springframework.stereotype.Service;
import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Comment;

@Service
public class ZendeskServiceImplementation implements ZendeskService{
    public Zendesk credentials(){
        Zendesk zd = new Zendesk.Builder("https://teclab1593636133.zendesk.com")
                .setUsername("jorge.danni@teclab.edu.ar")
                .setPassword("Abril2019")
                .build();

        return zd;
    }
    public Iterable<Comment> getAllCommentByIdTicket(int ticket_id){
        return credentials().getTicketComments(ticket_id);
    }

    public void sendComment(int ticket_id, Comment comment) {
        credentials().createComment(ticket_id, comment);

    }
}
