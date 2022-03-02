package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientResponseException;

import java.util.ArrayList;
import java.util.List;
@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    @RequestMapping(path = "/hotels", method = RequestMethod.POST)
    public void addHotel(Hotel hotel){
        if (hotel != null){
            list().add(hotel);
        }
    }
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> listByCityAndState(
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String state) {
        List<Hotel> hotels = hotelDao.list();

        if (state == null && city == null) {
            return hotels;
        }
        List<Hotel> filteredList = new ArrayList<>();
        for(Hotel hotel: hotels){
            String hotelCity = hotel.getAddress().getCity();
            String hotelState = hotel.getAddress().getState();

            if(hotelCity.equalsIgnoreCase(city) && hotelState.equalsIgnoreCase(state)){
                filteredList.add(hotel);
            } else if(hotelCity.equalsIgnoreCase(city) && state == null){
                filteredList.add(hotel);
            } else if (hotelState.equalsIgnoreCase(state) && city == null){
                filteredList.add(hotel);

            }
        }

            return filteredList;

    }
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    //@GetMapping("/reservations")
    public List<Reservation> getReservations (){
        return this.reservationDao.findAll();
    }

    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    //@GetMapping("/reservations/{id}")
    public Reservation getReservationsById (@PathVariable int id) {
        try {
            return this.reservationDao.get(id);
        } catch (RestClientResponseException e) {
            e.getStatusText();
        }

        return reservationDao.get(id);


    }

    @RequestMapping(path = "/reservations", method = RequestMethod.POST)
    //@PostMapping("/reservations")
    public Reservation createReservations (@ RequestBody Reservation newReservation) {
        if (newReservation != null) {
           newReservation = reservationDao.create(newReservation, newReservation.getHotelID());
        }
        return newReservation;
    }

    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    //@GetMapping("/reservations/{id}")
    public List<Reservation> getReservationsByHotelId (@PathVariable int hotelId) {
        return this.reservationDao.findByHotel(hotelId);
    }


}
