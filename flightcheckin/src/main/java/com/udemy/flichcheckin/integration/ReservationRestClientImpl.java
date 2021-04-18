package com.udemy.flichcheckin.integration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.udemy.flichcheckin.integration.dto.Reservation;
import com.udemy.flichcheckin.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	@Value("${com.udemy.flichcheckin.integration.url}")
	private  String RESERVATION_REST_URL;// = "http://localhost:8686/fr/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate
				.getForObject(RESERVATION_REST_URL+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
		
		return reservation;
	}

}
