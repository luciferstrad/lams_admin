/**************************************************************** 
 * Copyright (C) 2005 LAMS Foundation (http://lamsfoundation.org) 
 * ============================================================= 
 * License Information: http://lamsfoundation.org/licensing/lams/2.0/ 
 * 
 * This program is free software; you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License version 2.0 
 * as published by the Free Software Foundation. 
 * 
 * This program is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 * GNU General Public License for more details. 
 * 
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 * USA 
 * 
 * http://www.gnu.org/licenses/gpl.txt 
 * **************************************************************** 
 */  
 
/* $Id: EmailForm.java,v 1.1 2010-03-06 22:39:02 andreyb Exp $ */  
package org.lamsfoundation.lams.admin.web.form;

import org.apache.struts.action.ActionForm;

/**
 * 
 * Form for email composing
 * 
 * @author Andrey Balan
 * 
 * @struts.form name="emailForm"
 */
public class EmailForm extends ActionForm {

    private static final long serialVersionUID = 7775887425863041037L;
   
    private Integer userId;
    
    private String to;
    private String subject;
    private String body;
    
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public String getTo() {
        return to;
    }
    public void setTo(String name) {
        this.to = name;
    }
    
    public String getSubject() {
        return subject;
    }
    public void setSubject(String description) {
        this.subject = description;
    }
    
    public String getBody() {
        return body;
    }
    public void setBody(String imageDirectory) {
        this.body = imageDirectory;
    }

}
	
