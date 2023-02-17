package in.jaiprakash.householdgroceries.service;

import lombok.extern.log4j.Log4j2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Log4j2
public class UserAccessService {

    private static final Set<String> allAppGroups = new HashSet<>();

    /**
     * filter out all unnecessary roles from user jwt token
     * @param allUserGroups
     * @return
     */

//    public List<String> convertGroupToRoles(List<String> allUserGroups){
//
//    }

}
