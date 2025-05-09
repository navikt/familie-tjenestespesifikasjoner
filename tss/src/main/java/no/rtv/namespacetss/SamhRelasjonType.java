//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dette er en type som beskriver elementene til samhandler relasjoner
 * 
 * <p>Java class for samhRelasjonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="samhRelasjonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="idOff" type="{http://www.rtv.no/NamespaceTSS}Tidoff"/>
 *         <element name="kodeIdentTypeU" type="{http://www.rtv.no/NamespaceTSS}TkodeIdenttype"/>
 *         <element name="beskrIdentTypeU" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/>
 *         <element name="kodeSamhTypeU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="beskrSamhTypeU" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/>
 *         <element name="kodeRelRolle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="beskrRelRolle" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/>
 *         <element name="datoRelasjonFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="datoRelasjonTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="gyldigRelasjon" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/>
 *         <element name="nivaRelasjon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kilde" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="brukerId" type="{http://www.rtv.no/NamespaceTSS}Tbrukerid"/>
 *         <element name="tidReg" type="{http://www.rtv.no/NamespaceTSS}Ttidreg"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhRelasjonType", propOrder = {
    "idOff",
    "kodeIdentTypeU",
    "beskrIdentTypeU",
    "kodeSamhTypeU",
    "beskrSamhTypeU",
    "kodeRelRolle",
    "beskrRelRolle",
    "datoRelasjonFom",
    "datoRelasjonTom",
    "gyldigRelasjon",
    "nivaRelasjon",
    "kilde",
    "brukerId",
    "tidReg"
})
@XmlSeeAlso({
    RelasjonSamhType.class
})
public class SamhRelasjonType {

    @XmlElement(required = true)
    protected String idOff;
    @XmlElement(required = true)
    protected String kodeIdentTypeU;
    @XmlElement(required = true)
    protected String beskrIdentTypeU;
    @XmlElement(required = true)
    protected String kodeSamhTypeU;
    @XmlElement(required = true)
    protected String beskrSamhTypeU;
    @XmlElement(required = true)
    protected String kodeRelRolle;
    @XmlElement(required = true)
    protected String beskrRelRolle;
    @XmlElement(required = true)
    protected String datoRelasjonFom;
    @XmlElement(required = true)
    protected String datoRelasjonTom;
    @XmlElement(required = true)
    protected String gyldigRelasjon;
    @XmlElement(required = true)
    protected String nivaRelasjon;
    @XmlElement(required = true)
    protected String kilde;
    @XmlElement(required = true)
    protected String brukerId;
    @XmlElement(required = true)
    protected String tidReg;

    /**
     * Gets the value of the idOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOff() {
        return idOff;
    }

    /**
     * Sets the value of the idOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOff(String value) {
        this.idOff = value;
    }

    /**
     * Gets the value of the kodeIdentTypeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeIdentTypeU() {
        return kodeIdentTypeU;
    }

    /**
     * Sets the value of the kodeIdentTypeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeIdentTypeU(String value) {
        this.kodeIdentTypeU = value;
    }

    /**
     * Gets the value of the beskrIdentTypeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrIdentTypeU() {
        return beskrIdentTypeU;
    }

    /**
     * Sets the value of the beskrIdentTypeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrIdentTypeU(String value) {
        this.beskrIdentTypeU = value;
    }

    /**
     * Gets the value of the kodeSamhTypeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeSamhTypeU() {
        return kodeSamhTypeU;
    }

    /**
     * Sets the value of the kodeSamhTypeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeSamhTypeU(String value) {
        this.kodeSamhTypeU = value;
    }

    /**
     * Gets the value of the beskrSamhTypeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrSamhTypeU() {
        return beskrSamhTypeU;
    }

    /**
     * Sets the value of the beskrSamhTypeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrSamhTypeU(String value) {
        this.beskrSamhTypeU = value;
    }

    /**
     * Gets the value of the kodeRelRolle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeRelRolle() {
        return kodeRelRolle;
    }

    /**
     * Sets the value of the kodeRelRolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeRelRolle(String value) {
        this.kodeRelRolle = value;
    }

    /**
     * Gets the value of the beskrRelRolle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrRelRolle() {
        return beskrRelRolle;
    }

    /**
     * Sets the value of the beskrRelRolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrRelRolle(String value) {
        this.beskrRelRolle = value;
    }

    /**
     * Gets the value of the datoRelasjonFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoRelasjonFom() {
        return datoRelasjonFom;
    }

    /**
     * Sets the value of the datoRelasjonFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoRelasjonFom(String value) {
        this.datoRelasjonFom = value;
    }

    /**
     * Gets the value of the datoRelasjonTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoRelasjonTom() {
        return datoRelasjonTom;
    }

    /**
     * Sets the value of the datoRelasjonTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoRelasjonTom(String value) {
        this.datoRelasjonTom = value;
    }

    /**
     * Gets the value of the gyldigRelasjon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGyldigRelasjon() {
        return gyldigRelasjon;
    }

    /**
     * Sets the value of the gyldigRelasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGyldigRelasjon(String value) {
        this.gyldigRelasjon = value;
    }

    /**
     * Gets the value of the nivaRelasjon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivaRelasjon() {
        return nivaRelasjon;
    }

    /**
     * Sets the value of the nivaRelasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivaRelasjon(String value) {
        this.nivaRelasjon = value;
    }

    /**
     * Gets the value of the kilde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKilde() {
        return kilde;
    }

    /**
     * Sets the value of the kilde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKilde(String value) {
        this.kilde = value;
    }

    /**
     * Gets the value of the brukerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukerId() {
        return brukerId;
    }

    /**
     * Sets the value of the brukerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukerId(String value) {
        this.brukerId = value;
    }

    /**
     * Gets the value of the tidReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTidReg() {
        return tidReg;
    }

    /**
     * Sets the value of the tidReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTidReg(String value) {
        this.tidReg = value;
    }

}
