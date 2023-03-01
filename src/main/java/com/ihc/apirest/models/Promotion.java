package com.ihc.apirest.models;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(schema="appmall", name = "promotions")
public class Promotion implements Serializable
{

  private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_promotion")
	private Long idPromotion;

	@JoinColumn(name = "idStore")
	@ManyToOne(optional = false)
	private Store store;

  @Basic(optional = false)
	@Column(name = "id_state")
	private Long idState;

  @Basic(optional = false)
	@Column(name = "name")
	private String name;

  @Basic(optional = false)
	@Column(name = "description")
	private String description;

  @Basic(optional = false)
	@Column(name = "start_date")
	private String startDate;

  @Basic(optional = false)
	@Column(name = "end_date")
	private String endDate;

  @Basic(optional = false)
	@Column(name = "url_image")
	private String urlImage;

  @Basic(optional = false)
	@Column(name = "creation_date")
	private Date creationDate;
}
