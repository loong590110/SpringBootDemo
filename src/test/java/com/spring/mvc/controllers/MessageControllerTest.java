package com.spring.mvc.controllers; 

import com.spring.mvc.been.Message;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
* MessageController Tester. 
* 
* @author <Authors name> 
* @since <pre>ÁùÔÂ 16, 2017</pre> 
* @version 1.0 
*/ 
public class MessageControllerTest { 

    @Before
    public void before() throws Exception {
        System.out.println("@Before");
    } 
    
    @After
    public void after() throws Exception {
        System.out.println("@After");
    } 
    
        /** 
    * 
    * Method: getMessage(@PathVariable("id") long id) 
    * 
    */ 
    @Test
    public void testGetMessage() throws Exception {
        new MessageController()
                .getMessage(124)
                .stream()
                .forEach(message ->
                        System.out.println(message.getId())
                );
    } 
    
        /** 
    * 
    * Method: setMessage(List<Message> messages) 
    * 
    */ 
    @Test
    public void testSetMessage() throws Exception {
        new MessageController()
                .setMessage(Stream.of(new Message(1535, "dgfs",
                        "sgsd", System.currentTimeMillis()))
                        .collect(Collectors.toList()));
    } 
    
        
        
} 
