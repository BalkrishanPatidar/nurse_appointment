package com.krishna.online_nurse_appointment_system.Service;

import com.krishna.online_nurse_appointment_system.DTO.HealthCareDTO;

public interface HealthCareService {
    
    HealthCareDTO registerHealthCare(HealthCareDTO healthCareDTO);
    
    HealthCareDTO updateHealthCare(Integer healthCareID, HealthCareDTO healthCareDTO);
    
    void deleteHealthCare(Integer healthCareID);
    
}