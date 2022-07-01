package com.Hayfa.GestionTickets.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HDK_USER")
public class HdkUser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigDecimal idUser;
	
	private BigDecimal idEntite;
	private BigDecimal idTiers;
	private BigDecimal version;
	@Column(unique = true)
	private String userName;
	private String userLogin;
	private String userPwd;
	private Date modifiedDate;
	private Date createdDate;
	private Character isBlocked;
	private Character isActive;
	private BigDecimal userFunction;
	private String userMail;
	private String userAdress;
	private String userVille;
	private byte[] userLogo;
	private Date startDate;
	private Date endDate;
	private BigDecimal userMobile;

	public HdkUser() {
	}

	public HdkUser(BigDecimal idUser) {
		this.idUser = idUser;
	}

	
	
	public HdkUser(BigDecimal idEntite, BigDecimal idTiers, BigDecimal version, String userName, String userLogin,
			String userPwd, Date modifiedDate, Date createdDate, Character isBlocked, Character isActive,
			BigDecimal userFunction, String userMail, String userAdress, String userVille, byte[] userLogo,
			Date startDate, Date endDate, BigDecimal userMobile) {
		super();
		this.idEntite = idEntite;
		this.idTiers = idTiers;
		this.version = version;
		this.userName = userName;
		this.userLogin = userLogin;
		this.userPwd = userPwd;
		this.modifiedDate = modifiedDate;
		this.createdDate = createdDate;
		this.isBlocked = isBlocked;
		this.isActive = isActive;
		this.userFunction = userFunction;
		this.userMail = userMail;
		this.userAdress = userAdress;
		this.userVille = userVille;
		this.userLogo = userLogo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.userMobile = userMobile;
	}

	@Column(name = "ID_USER", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdUser() {
		return idUser;
	}

	public void setIdUser(BigDecimal idUser) {
		this.idUser = idUser;
	}

	@Column(name = "VERSION", precision = 22, scale = 0)
	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	@Column(name = "USER_NAME")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_LOGIN")
	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	@Column(name = "USER_PWD")
	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Column(name = "MODIFIED_DATE")

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "CREATED_DATE")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "IS_BLOCKED")
	public Character getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(Character isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Column(name = "IS_ACTIF")
	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	@Column(name = "USER_MAIL")
	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	@Column(name = "USER_ADRESS")
	public String getUserAdress() {
		return userAdress;
	}

	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}

	@Column(name = "USER_VILLE")
	public String getUserVille() {
		return userVille;
	}

	public void setUserVille(String userVille) {
		this.userVille = userVille;
	}

	@Column(name = "USER_LOGO")
	public byte[] getUserLogo() {
		return userLogo;
	}

	public void setUserLogo(byte[] userLogo) {
		this.userLogo = userLogo;
	}

	@Column(name = "START_DATE")
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "END_DATE")
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "USER_MOBILE")
	public BigDecimal getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(BigDecimal userMobile) {
		this.userMobile = userMobile;
	}

	@Column(name = "USER_FUNCTION")
	public BigDecimal getUserFunction() {
		return userFunction;
	}

	public void setUserFunction(BigDecimal userFunction) {
		this.userFunction = userFunction;
	}

	@Column(name = "ID_TIERS")
	public BigDecimal getIdTiers() {
		return idTiers;
	}

	public void setIdTiers(BigDecimal idTiers) {
		this.idTiers = idTiers;
	}

	@Column(name = "ID_ENTITE")
	public BigDecimal getIdEntite() {
		return idEntite;
	}

	public void setIdEntite(BigDecimal idEntite) {
		this.idEntite = idEntite;
	}

}
