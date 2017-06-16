package com.spring.mvc.controllers;

import com.spring.mvc.been.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @RequestMapping("/{id}")
    public List<Message> getMessage(@PathVariable("id") long id) {
        return Stream.of(
                new Message(id, "a", "sdg", System.currentTimeMillis()),
                new Message(153, "abc", "dfgsd", System.currentTimeMillis()),
                new Message(1455, "gd", "gsgd", System.currentTimeMillis())
        )
                .filter(message -> message.getTitle().contains("a"))
                .collect(Collectors.toList());
    }

    public void setMessage(List<Message> messages) {
        messages.stream().forEach(message ->
            logger.debug(message.toString())
        );
    }
}
