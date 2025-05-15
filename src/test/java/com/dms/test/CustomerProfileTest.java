package com.dms.test;

import com.dms.entity.CustomerProfile;
import com.dms.repository.CustomerProfileRepo;
import com.dms.serviceimpl.CustomerProfileImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
}
