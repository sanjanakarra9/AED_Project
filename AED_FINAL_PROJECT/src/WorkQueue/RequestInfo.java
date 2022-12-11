/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import UserAccount.AccountUser;
import java.util.Date;

/**
 *
 * @author Sonur
 */
public class RequestInfo {
    private String message;
    private AccountUser send;
    private AccountUser receive;
    private String status;
    private Date reqDate;
    private Date resDate;
    
    public RequestInfo(){
        reqDate= new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AccountUser getSend() {
        return send;
    }

    public void setSend(AccountUser send) {
        this.send = send;
    }

    public AccountUser getReceive() {
        return receive;
    }

    public void setReceive(AccountUser receive) {
        this.receive = receive;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getResDate() {
        return resDate;
    }

    public void setResDate(Date resDate) {
        this.resDate = resDate;
    }
    
    
}
