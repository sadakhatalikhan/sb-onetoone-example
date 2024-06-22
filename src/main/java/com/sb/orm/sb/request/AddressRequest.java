package com.sb.orm.sb.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class AddressRequest {

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
}
