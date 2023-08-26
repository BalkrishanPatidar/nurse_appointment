package com.krishna.online_nurse_appointment_system.Service;

import com.krishna.online_nurse_appointment_system.DTO.AdminDTO;

public interface AdminService {
    
    AdminDTO registerAdmin(AdminDTO adminDTO);
    
    void deleteAdmin(String adminUsername);
    
}