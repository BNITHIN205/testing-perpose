package com.example.springdemo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.minidev.json.annotate.JsonIgnore;
@Entity
@Table(name="client_projects_t")
public class ClientProjectsT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="project_id")
	private Integer projectId;
	@Column(name="project_name")
	private String projectName;
	@Column(name="project_Manager")
	private String projectManager;
	@ManyToOne
    @JoinColumn(name = "client_id")
	private ClientsT clientst;
	
	public ClientProjectsT() {}

	public ClientProjectsT(Integer projectId, String projectName, String projectManager, ClientsT clientst) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectManager = projectManager;
		this.clientst = clientst;
	}

	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the projectManager
	 */
	public String getProjectManager() {
		return projectManager;
	}

	/**
	 * @param projectManager the projectManager to set
	 */
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	/**
	 * @return the clientst
	 */
	@JsonIgnore
	public ClientsT getClientst() {
		return clientst;
	}

	/**
	 * @param clientst the clientst to set
	 */
	public void setClientst(ClientsT clientst) {
		this.clientst = clientst;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientProjectsT [projectId=" + projectId + ", projectName=" + projectName + ", projectManager="
				+ projectManager + ", clientst=" + clientst + "]";
	}
	
	
	

}
