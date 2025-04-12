package com.ltim.practice;

import com.ltim.practice.model.Address;
import com.ltim.practice.model.Booking;
import com.ltim.practice.service.BookingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args) {

//        BookingService bookingService = new BookingService();
//        Booking booking = Booking.builder()
//                .id(1)
//                .price(200.0)
//                .address(
//                    Address.builder()
//                    .addressLine1("ABC APT")
//                    .addressLine2("Marine Road")
//                    .city("Mumbai")
//                    .build()
//                ).build();
//
//        bookingService.setBooking(booking);
//        bookingService.printBooking();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BookingService bookingService = context.getBean("bookingService", BookingService.class);
        bookingService.printBooking();
    }
}
