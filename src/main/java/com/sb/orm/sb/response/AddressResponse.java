package com.sb.orm.sb.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class AddressResponse {
    @JsonProperty("doorNumber")
    private String doorNumber;

    @JsonProperty("street")
    private String street;

    @JsonProperty("landMark")
    private String landMark;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("country")
    private String country;

    @JsonProperty("pinCode")
    private String pinCode;

    @JsonProperty("createdDate")
    @JsonFormat(pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime createdDate;

    @JsonProperty("updatedDate")
    @JsonFormat(pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime updatedDate;
}
