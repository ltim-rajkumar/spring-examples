package com.ltim.practice.service;

import com.ltim.practice.model.Booking;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class BookingService {

    private Booking booking;

    public void printBooking() {
        System.out.println("Booking details are: " + booking);
    }

}
