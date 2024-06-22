package com.sb.orm.sb.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sb.orm.sb.enums.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.Builder;
import lombok.ToString;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class CustomerResponse {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("customerName")
    private String customerName;

    @JsonProperty("customerAge")
    private int customerAge;

    @JsonProperty("customerMobileNumber")
    private String customerMobileNumber;

    @JsonProperty("customerEmailAddress")
    private String customerEmailAddress;

    @JsonProperty("address")
    private AddressResponse address;

    @JsonProperty("status")
    private CustomerStatus status;

    @JsonProperty("verified")
    private boolean verified;

    @JsonProperty("createdDate")
    @JsonFormat(pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime createdDate;

    @JsonProperty("updatedDate")
    @JsonFormat(pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime updatedDate;
}
