package com.dms.test;

import com.dms.entity.Address;
import com.dms.repository.AddressRepo;
import com.dms.serviceimpl.AddressImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class AddressServiceTest {

    @InjectMocks
    private AddressImpl addressService;

    @Mock
    private AddressRepo addressRepo;

    @Test
    public void testSaveAddress() {
        Address address = new Address("1", "13", "Street", "City", "State", "Country", 123456);
        when(addressRepo.save(address)).thenReturn(address);
        assertEquals(address, addressService.saveAddress(address));
    }

    @Test
    public void testGetAddressById() {
        Address address = new Address("1", "13", "Street", "City", "State", "Country", 123456);
        when(addressRepo.findById("1")).thenReturn(Optional.of(address));
        assertEquals("1", addressService.getAddressById("1").getAddressId());
    }

    @Test
    public void testGetAllAddresses() {
        List<Address> list = List.of(new Address("1", "13", "Street", "City", "State", "Country", 123456));
        when(addressRepo.findAll()).thenReturn(list);
        assertEquals(1, addressService.getAllAddresses().size());
    }

    @Test
    public void testDeleteAddress() {
        doNothing().when(addressRepo).deleteById("1");
        addressService.deleteAddress("1");
        verify(addressRepo, times(1)).deleteById("1");
    }

    @Test
    public void testGetAddressByIdNotFound() {
        when(addressRepo.findById("100")).thenReturn(Optional.empty());
        assertNull(addressService.getAddressById("100"));
    }
}