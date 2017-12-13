
package com.demo.first.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://first.demo.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @return
     *     returns java.util.List<com.demo.first.service.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.FindAllResponse")
    @Action(input = "http://first.demo.com/UserService/findAllRequest", output = "http://first.demo.com/UserService/findAllResponse")
    public List<User> findAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "say", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.Say")
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.SayResponse")
    @Action(input = "http://first.demo.com/UserService/sayRequest", output = "http://first.demo.com/UserService/sayResponse")
    public String say(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.AddUserResponse")
    @Action(input = "http://first.demo.com/UserService/addUserRequest", output = "http://first.demo.com/UserService/addUserResponse")
    public boolean addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.demo.first.service.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUserById", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.FindUserById")
    @ResponseWrapper(localName = "findUserByIdResponse", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.FindUserByIdResponse")
    @Action(input = "http://first.demo.com/UserService/findUserByIdRequest", output = "http://first.demo.com/UserService/findUserByIdResponse")
    public User findUserById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addStudent", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.AddStudent")
    @ResponseWrapper(localName = "addStudentResponse", targetNamespace = "http://first.demo.com/", className = "com.demo.first.service.AddStudentResponse")
    @Action(input = "http://first.demo.com/UserService/addStudentRequest", output = "http://first.demo.com/UserService/addStudentResponse")
    public boolean addStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        Student arg0);

}