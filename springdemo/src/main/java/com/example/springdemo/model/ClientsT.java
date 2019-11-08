package com.example.springdemo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name="clients_t")
public class ClientsT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="client_id")
	private Integer clientId;
	@Column(name="client_name")
	private String clientName;
	@Column(name="client_location")
	private String clientLocation;
	@Column(name="submitted_time")
	private Date submittedTime;
	@OneToMany(cascade={CascadeType.ALL})
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="client_id", referencedColumnName="client_id")
	private Set<ClientProjectsT> clientProjects;
	
	public ClientsT() {}

	public ClientsT(Integer clientId, String clientName, String clientLocation, Date submittedTime,
			Set<ClientProjectsT> clientProjects) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientLocation = clientLocation;
		this.submittedTime = submittedTime;
		this.clientProjects = clientProjects;
	}

	/**
	 * @return the clientId
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the clientLocation
	 */
	public String getClientLocation() {
		return clientLocation;
	}

	/**
	 * @param clientLocation the clientLocation to set
	 */
	public void setClientLocation(String clientLocation) {
		this.clientLocation = clientLocation;
	}

	/**
	 * @return the submittedTime
	 */
	public Date getSubmittedTime() {
		return submittedTime;
	}

	/**
	 * @param submittedTime the submittedTime to set
	 */
	public void setSubmittedTime(Date submittedTime) {
		this.submittedTime = submittedTime;
	}

	/**
	 * @return the clientProjects
	 */
	public Set<ClientProjectsT> getClientProjects() {
		return clientProjects;
	}

	/**
	 * @param clientProjects the clientProjects to set
	 */
	public void setClientProjects(Set<ClientProjectsT> clientProjects) {
		this.clientProjects = clientProjects;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientsT [clientId=" + clientId + ", clientName=" + clientName + ", clientLocation=" + clientLocation
				+ ", submittedTime=" + submittedTime + ", clientProjects=" + clientProjects + "]";
	}
	
	
}
