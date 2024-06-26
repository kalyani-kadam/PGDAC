package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// id | name    | party    | votes
@Entity
@Table(name="candidates")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer candidateId;
	@Column(name="name")
	private String candidateName;
	private String party;
	private int votes;
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	public Candidate(int candidateId, String candidateName, String party, int votes) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.party = party;
		this.votes = votes;
	}
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", party=" + party
				+ ", votes=" + votes + "]";
	}
	
}
