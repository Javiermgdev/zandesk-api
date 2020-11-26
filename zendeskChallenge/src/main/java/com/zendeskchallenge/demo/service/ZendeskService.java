package com.zendeskchallenge.demo.service;

import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Comment;

public interface ZendeskService {

    Zendesk credentials();

    Iterable<Comment> getAllCommentByIdTicket(int ticket_id);

    void sendComment(int ticket_id, Comment comment);
}
