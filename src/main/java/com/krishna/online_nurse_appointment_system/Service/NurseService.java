package com.krishna.online_nurse_appointment_system.Service;

import com.krishna.online_nurse_appointment_system.DTO.NurseDTO;
import com.krishna.online_nurse_appointment_system.DTO.NurseRegistrationDTO;

public interface NurseService {
    
    NurseRegistrationDTO registerNurse(NurseRegistrationDTO nurseRegistrationDTO);
    
    NurseDTO updateNurse(Integer nurseID, NurseDTO nurseDTO);
    
    void deleteNurse(Integer nurseID);
    
}