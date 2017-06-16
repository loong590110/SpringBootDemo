package com.spring.mvc.controllers; 

import com.spring.mvc.been.User;
import com.spring.mvc.mapper.UserMapper;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** 
* UserController Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 16, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    UserMapper userMapper;

    @Before
    public void before() throws Exception {

    } 
    
    @After
    public void after() throws Exception { 
    } 
    
        /** 
    * 
    * Method: getUsers() 
    * 
    */ 
    @Test
    public void testGetUsers() throws Exception {

    }
    
        /** 
    * 
    * Method: getUser(Long id) 
    * 
    */ 
    @Test
    public void testGetUser() throws Exception { 
    //TODO: Test goes here... 
    } 
    
        /** 
    * 
    * Method: save(User user) 
    * 
    */ 
    @Test
    public void testSave() throws Exception {
        userMapper.insert(new User("job", 23));
    } 
    
        /** 
    * 
    * Method: update(User user) 
    * 
    */ 
    @Test
    public void testUpdate() throws Exception { 
    //TODO: Test goes here... 
    } 
    
        /** 
    * 
    * Method: delete(@PathVariable("id") Long id) 
    * 
    */ 
    @Test
    public void testDelete() throws Exception { 
    //TODO: Test goes here... 
    } 
    
        
        
} 
