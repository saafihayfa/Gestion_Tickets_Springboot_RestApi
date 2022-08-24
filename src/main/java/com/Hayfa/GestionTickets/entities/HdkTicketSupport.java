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
@Table(name = "HDK_TICKET_SUPPORT")
public class HdkTicketSupport implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigDecimal idTicket;
	private BigDecimal version;
	private BigDecimal idEntite;
	private BigDecimal idUser;
	private BigDecimal idTypeTicket;
	private BigDecimal periorite;
	private BigDecimal attributedTo;
	private String title;
	private String numTicket;
	private String commentTicket;
	private String description;
	private Date dtCreate;
	private Date dtModif;
	private Character status;

	public HdkTicketSupport() {
	}

	public HdkTicketSupport(BigDecimal version, BigDecimal idEntite, BigDecimal idUser, BigDecimal idTypeTicket,
			BigDecimal periorite, BigDecimal attributedTo, String title, String numTicket, String commentTicket,
			String description, Date dtCreate, Date dtModif, Character status) {
		super();
		this.version = version;
		this.idEntite = idEntite;
		this.idUser = idUser;
		this.idTypeTicket = idTypeTicket;
		this.periorite = periorite;
		this.attributedTo = attributedTo;
		this.title = title;
		this.numTicket = numTicket;
		this.commentTicket = commentTicket;
		this.description = description;
		this.dtCreate = dtCreate;
		this.dtModif = dtModif;
		this.status = status;
	}

	@Column(name = "ID_TICKET", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(BigDecimal idTicket) {
		this.idTicket = idTicket;
	}

	@Column(name = "ID_ENTITE")
	public BigDecimal getIdEntite() {
		return idEntite;
	}

	public void setIdEntite(BigDecimal idEntite) {
		this.idEntite = idEntite;
	}

	@Column(name = "ID_USER")
	public BigDecimal getIdUser() {
		return idUser;
	}

	public void setIdUser(BigDecimal idUser) {
		this.idUser = idUser;
	}

	@Column(name = "ID_TYPETICKET")
	public BigDecimal getIdTypeTicket() {
		return idTypeTicket;
	}

	public void setIdTypeTicket(BigDecimal idTypeTicket) {
		this.idTypeTicket = idTypeTicket;
	}

	@Column(name = "PERIORITE")
	public BigDecimal getPeriorite() {
		return periorite;
	}

	public void setPeriorite(BigDecimal periorite) {
		this.periorite = periorite;
	}

	@Column(name = "ATTRIBUTED_TO")
	public BigDecimal getAttributedTo() {
		return attributedTo;
	}

	public void setAttributedTo(BigDecimal attributedTo) {
		this.attributedTo = attributedTo;
	}

	@Column(name = "TITLE")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "NUM_TICKET")
	public String getNumTicket() {
		return numTicket;
	}

	public void setNumTicket(String numTicket) {
		this.numTicket = numTicket;
	}

	@Column(name = "COMMENT_TICKET")
	public String getCommentTicket() {
		return commentTicket;
	}

	public void setCommentTicket(String commentTicket) {
		this.commentTicket = commentTicket;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "STATUS")
	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
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

	@Override
	public String toString() {
		return "HdkTicketSupport [idTicket=" + idTicket + ", version=" + version + ", idEntite=" + idEntite
				+ ", idUser=" + idUser + ", idTypeTicket=" + idTypeTicket + ", periorite=" + periorite
				+ ", attributedTo=" + attributedTo + ", title=" + title + ", numTicket=" + numTicket
				+ ", commentTicket=" + commentTicket + ", description=" + description + ", dtCreate=" + dtCreate
				+ ", dtModif=" + dtModif + ", status=" + status + "]";
	}

}
