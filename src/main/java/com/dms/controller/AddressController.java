package com.dms.controller;

import com.dms.entity.Address;
import com.dms.service.IAddress;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
@Tag(name = "Address ", description = " Address Management APIs")
public class AddressController {

    @Autowired
    private IAddress addressService;
    @Operation(summary = "Customer Profile", description = "Customer profile management APIs")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Customer profile create successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PostMapping("/save")
    public Address save(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }
    @Operation(summary = "Get All Customers",
            description = "Retrieves all customer profiles from the system")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved all customers"),
            @ApiResponse(responseCode = "204", description = "No customers found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })

    @GetMapping("/all")
    public List<Address> getAll() {
        return addressService.getAllAddresses();
    }
    @Operation(summary = "Get All Customers",
            description = "Retrieves particular customer with ID profile from the system")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved all customers"),
            @ApiResponse(responseCode = "204", description = "No customers found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })

    @GetMapping("/{id}")
    public Address getById(@PathVariable String id) {
        return addressService.getAddressById(id);
    }
    @Operation(summary = "Delete  Customers",
            description = "Delete all customer profiles from the system")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully Deleted all customers"),
            @ApiResponse(responseCode = "204", description = "No customers found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        addressService.deleteAddress(id);
    }
}