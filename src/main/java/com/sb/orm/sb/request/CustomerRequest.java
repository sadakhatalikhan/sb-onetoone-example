package com.sb.orm.sb.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Builder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class CustomerRequest {

    @JsonProperty("customerName")
    private String customerName;

    @JsonProperty("customerAge")
    private int customerAge;

    @JsonProperty("customerMobileNumber")
    private String customerMobileNumber;

    @JsonProperty("customerEmailAddress")
    private String customerEmailAddress;

    @JsonProperty("customerAddress")
    private AddressRequest address;
}
