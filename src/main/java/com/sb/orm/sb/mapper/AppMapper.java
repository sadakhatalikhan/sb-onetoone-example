package com.sb.orm.sb.mapper;

import com.sb.orm.sb.enums.CustomerStatus;
import com.sb.orm.sb.model.AddressModel;
import com.sb.orm.sb.model.CustomerModel;
import com.sb.orm.sb.request.AddressRequest;
import com.sb.orm.sb.request.CustomerRequest;
import com.sb.orm.sb.response.AddressResponse;
import com.sb.orm.sb.response.CustomerResponse;

import static com.sb.orm.sb.utils.AppUtils.generateOtp;
import static com.sb.orm.sb.utils.AppUtils.generatePassword;

public class AppMapper {
    public static CustomerResponse modelToResponseMapper(CustomerModel customerModel) {
        return CustomerResponse.builder()
                .id(customerModel.getId())
                .customerName(customerModel.getCustomerName())
                .customerAge(customerModel.getCustomerAge())
                .customerMobileNumber(customerModel.getCustomerMobileNumber())
                .customerEmailAddress(customerModel.getCustomerEmailAddress())
                .address(modelToResponseAddressMapper(customerModel.getAddress()))
                .createdDate(customerModel.getCreatedDate())
                .status(customerModel.getStatus())
                .verified(customerModel.isVerified())
                .createdDate(customerModel.getCreatedDate())
                .updatedDate(customerModel.getUpdatedDate())
                .build();
    }

    public static CustomerModel requestToModel(CustomerRequest request) {
        return CustomerModel.builder()
                .customerName(request.getCustomerName())
                .customerPassword(generatePassword())
                .customerAge(request.getCustomerAge())
                .customerMobileNumber(request.getCustomerMobileNumber())
                .customerEmailAddress(request.getCustomerEmailAddress())
                .address(requestToModelAddressMapper(request.getAddress()))
                .status(CustomerStatus.INACTIVE)
                .customerOtp(generateOtp())
                .verified(Boolean.FALSE)
                .build();
    }

    private static AddressModel requestToModelAddressMapper(AddressRequest address) {
        return AddressModel.builder()
                .doorNumber(address.getDoorNumber())
                .street(address.getStreet())
                .landMark(address.getLandMark())
                .city(address.getCity())
                .state(address.getState())
                .country(address.getCountry())
                .pinCode(address.getPinCode())
                .build();
    }

    private static AddressResponse modelToResponseAddressMapper(AddressModel address) {
        return AddressResponse.builder()
                .doorNumber(address.getDoorNumber())
                .street(address.getStreet())
                .landMark(address.getLandMark())
                .city(address.getCity())
                .state(address.getState())
                .country(address.getCountry())
                .pinCode(address.getPinCode())
                .createdDate(address.getCreatedDate())
                .updatedDate(address.getUpdatedDate())
                .build();
    }
}
