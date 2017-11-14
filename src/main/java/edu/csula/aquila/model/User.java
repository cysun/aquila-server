package edu.csula.aquila.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @JsonIgnore
    @Column(nullable = false)
    private String hash;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private boolean enabled = true;
    
    //relationship for timeline
    @JsonIgnore
    @ManyToOne
    Timeline timeline_form;


    //relationship for conflictOfInterestPInonPHS
    @JsonIgnore
    @ManyToOne
    ConflictOfInterestPINonPHS coi_pi_nonphs;
    
    public User()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    public String getHash()
    {
        return hash;
    }

    public void setHash( String hash )
    {
        this.hash = hash;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled( boolean enabled )
    {
        this.enabled = enabled;
    }

	public Timeline getTimeline_form() {
		return timeline_form;
	}

	public void setTimeline_form(Timeline timeline_form) {
		this.timeline_form = timeline_form;
	}

	public ConflictOfInterestPINonPHS getCoi_pi_nonphs() {
		return coi_pi_nonphs;
	}

	public void setCoi_pi_nonphs(ConflictOfInterestPINonPHS coi_pi_nonphs) {
		this.coi_pi_nonphs = coi_pi_nonphs;
	}






}
