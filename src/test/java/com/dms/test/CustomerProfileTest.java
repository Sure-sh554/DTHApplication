package com.dms.test;

import com.dms.entity.CustomerProfile;
import com.dms.repository.CustomerProfileRepo;
import com.dms.serviceimpl.CustomerProfileImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CustomerProfileTest {
    @InjectMocks
    private CustomerProfileImpl profile;
    @Mock
    private CustomerProfileRepo customerProfileRepo;

    @Test
    public void testSaveCustomerProfile() {
        CustomerProfile mockProfile = new CustomerProfile();
        mockProfile.setFirstName("Suresh");
        when(customerProfileRepo.save(mockProfile)).thenReturn(mockProfile);
        CustomerProfile customerProfile = customerProfileRepo.save(mockProfile);
        assertEquals("Suresh", customerProfile.getFirstName());
        verify(customerProfileRepo, times(1)).save(mockProfile);


    }
@Test
    public void testGetAllCustomerProfiles(){
        List<CustomerProfile> customerProfiles=new ArrayList<>();
        customerProfiles.add(new CustomerProfile());
        customerProfiles.add(new CustomerProfile());
        when(customerProfileRepo.findAll()).thenReturn(customerProfiles);
        List<CustomerProfile> setCustomerProfile=profile.getAll();
        assertEquals(2,setCustomerProfile.size());
        verify(customerProfileRepo,times(1)).findAll();
    }


}
