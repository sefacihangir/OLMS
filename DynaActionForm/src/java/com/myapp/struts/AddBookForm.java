/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author ranveer
 */
public class AddBookForm extends org.apache.struts.action.ActionForm {
    
    private String title;
    private String ISBNNumber;
    private String Publication;
    private String Category;
    private int Edition;
    private float Price;
    private String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = "Succesfully added";
    }
    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getEdition() {
        return Edition;
    }

    public void setEdition(int Edition) {
        this.Edition = Edition;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getPublication() {
        return Publication;
    }

    public void setPublication(String Publication) {
        this.Publication = Publication;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }
    private String author;

    /**
     * @return
     */
    
    public AddBookForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
     public void reset(ActionMapping mapping, HttpServletRequest request)  
  {  
    super.reset(mapping,request);  
    settitle("");  
    setauthor("");
    setISBNNumber("");
  }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (gettitle() == null || gettitle().length() < 1) {
            errors.add("title", new ActionMessage("error.title.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    void setMessage() {
        this.Message = "Successfully added";
    }
}
