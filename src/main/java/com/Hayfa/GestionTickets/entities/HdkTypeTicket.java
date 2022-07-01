package com.Hayfa.GestionTickets.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HDK_TYPE_TICKET")
public class HdkTypeTicket implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigDecimal idType;
	private BigDecimal version;

	private String libType;
	private String codeType;

	private Date dtCreate;
	private Date dtModif;

	public HdkTypeTicket() {
	}

	
	@Column(name = "ID_TICKET", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdType() {
		return idType;
	}

	public void setIdType(BigDecimal idType) {
		this.idType = idType;
	}

	@Column(name = "VERSION", precision = 22, scale = 0)
	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	@Column(name = "DT_CREATE")
	public Date getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_MODIF", length = 7)
	public Date getDtModif() {
		return this.dtModif;
	}

	public void setDtModif(Date dtModif) {
		this.dtModif = dtModif;
	}

	@Column(name = "LIB_TYPE")
	public String getLibType() {
		return libType;
	}

	public void setLibType(String libType) {
		this.libType = libType;
	}

	@Column(name = "CODE_TYPE")
	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

}
