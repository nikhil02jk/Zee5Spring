package com.zee.zee5_app.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.dto.Subscription;
import com.zee.zee5_app.repository.SubscriptionRepository;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.InvalidAmountException;
import com.zee.zee5_app.exception.InvalidIdLengthException;

public interface SubscriptionService {
	
	public String addSubscription(Subscription subscription) throws InvalidAmountException;
	public String deleteSubscription(String id) throws IdNotFoundException;
	public String modifySubscription(String id, Subscription subscription);
	public Optional<Subscription> getSubscriptionById(String id) throws IdNotFoundException, InvalidIdLengthException, InvalidAmountException;
	public Optional<List<Subscription>> getAllSubscription() throws InvalidIdLengthException, InvalidAmountException;


}