package edu.csula.aquila.model;

import java.util.List;

public interface ProposalDao {
	
	Proposal getProposal( Long id );
	
	Proposal saveProposal( Proposal proposal);

	List<Proposal> getProposalsOfUser( Long id );
	

}
