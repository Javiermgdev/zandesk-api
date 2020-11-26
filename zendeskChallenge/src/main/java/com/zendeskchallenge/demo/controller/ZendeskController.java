package com.zendeskchallenge.demo.controller;

import com.zendeskchallenge.demo.service.implementation.ZendeskServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zendesk.client.v2.model.Comment;

@RestController
@RequestMapping("/api/v2/tickets/")
public class ZendeskController {

    @Autowired
    ZendeskServiceImplementation zendeskServiceImplementation;

    @GetMapping("{ticket_id}/comments.json")
    public Iterable<Comment> getAllCommentByIdTicket(@PathVariable int ticket_id){
        return zendeskServiceImplementation.getAllCommentByIdTicket(ticket_id);
    }

    @PostMapping("{ticket_id}/comments.json")
    public void sendCommentByIdTicket(@PathVariable int ticket_id, @RequestBody Comment newComment){
        zendeskServiceImplementation.sendComment(ticket_id, newComment);
    }
}
