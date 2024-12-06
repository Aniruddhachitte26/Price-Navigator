/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.LogisticPartner;

import java.util.ArrayList;
import model.Personnel.Person;

/**
 *
 * @author Aniruddha
 */
public class LogisticPartnerDirectory {
    
    ArrayList<LogisticPartnerProfile> logisticpartnerprofilelist;

    public LogisticPartnerDirectory() {
        logisticpartnerprofilelist = new ArrayList();

    }

    public LogisticPartnerProfile newLogisticPartnerUserProfile(Person p) {

        LogisticPartnerProfile lp = new LogisticPartnerProfile(p);
        logisticpartnerprofilelist.add(lp);
        return lp;
    }

    public LogisticPartnerProfile findLogisticPartnerUserUser(String id) {

        for (LogisticPartnerProfile lp : logisticpartnerprofilelist) {

            if (lp.isMatch(id)) {
                return lp;
            }
        }
            return null; //not found after going through the whole list
         }

}
