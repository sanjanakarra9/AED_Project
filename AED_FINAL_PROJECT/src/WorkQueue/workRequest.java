/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import UserAccount.UserAcnt;
import java.util.Date;

/**
 *
 * @author Sonur
 */
public abstract class workRequest {
    private String message;
    private UserAcnt send;
    private UserAcnt receive;
    private String status;
    private Date reqDate;
    private Date resDate;
    
    public workRequest(){
        reqDate= new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAcnt getSend() {
        return send;
    }

    public void setSend(UserAcnt send) {
        this.send = send;
    }

    public UserAcnt getReceive() {
        return receive;
    }

    public void setReceive(UserAcnt receive) {
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
