package edu.csula.aquila.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.model.Proposal;
import edu.csula.aquila.model.ProposalDao;
import edu.csula.aquila.model.User;
import edu.csula.aquila.model.UserDao;

@RestController
public class ProposalController {

	@Autowired
	private ProposalDao proposalDao;
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "api/proposal", method = RequestMethod.GET)
	public Proposal getProposal(@RequestParam Long id){
		return proposalDao.getProposal(id);
	}
	
	@RequestMapping(value = "api/proposal", method = RequestMethod.POST)
	public Proposal saveProposal(Proposal proposal, @RequestParam Long userId) {
		User user = userDao.getUser(userId);
		proposal.setUser(user);
		proposal.setStatus("In Progress");
		proposal.setDateCreated(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		return proposalDao.saveProposal(proposal);
	}
	
	@RequestMapping(value = "api/getproposals", method = RequestMethod.GET)
	public List<Proposal> getProposalsOfUser(@RequestParam Long id){
		
		return proposalDao.getProposalsOfUser(id);
	}
}
