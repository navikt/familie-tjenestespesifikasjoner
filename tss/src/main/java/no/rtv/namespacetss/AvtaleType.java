//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:48 PM CET 
//


package no.rtv.namespacetss;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dette er en type som beskriver elementene til samhandler  avtaler
 * 
 * <p>Java class for avtaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="avtaleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idOff" type="{http://www.rtv.no/NamespaceTSS}Tidoff"/&gt;
 *         &lt;element name="kodeIdentTypeU" type="{http://www.rtv.no/NamespaceTSS}TkodeIdenttype"/&gt;
 *         &lt;element name="kodeSamhTypeU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kodeAvtaleType" type="{http://www.rtv.no/NamespaceTSS}Tkodeavtaletype"/&gt;
 *         &lt;element name="beskrAvtaleType" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/&gt;
 *         &lt;element name="datoAvtaleFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="datoAvtaleTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="avtaleNr"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="prosentAndel"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{0}"/&gt;
 *               &lt;pattern value="\d{1}"/&gt;
 *               &lt;pattern value="\d{2}"/&gt;
 *               &lt;pattern value="\d{3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="kommNrTjeneste"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gyldigAvtale" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/&gt;
 *         &lt;element name="kilde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brukerId" type="{http://www.rtv.no/NamespaceTSS}Tbrukerid"/&gt;
 *         &lt;element name="tidReg" type="{http://www.rtv.no/NamespaceTSS}Ttidreg"/&gt;
 *         &lt;element name="antAvtRett" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/&gt;
 *         &lt;element name="avtRettInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="avtaleRettighet" type="{http://www.rtv.no/NamespaceTSS}avtaleRettType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "avtaleType", propOrder = {
    "idOff",
    "kodeIdentTypeU",
    "kodeSamhTypeU",
    "kodeAvtaleType",
    "beskrAvtaleType",
    "datoAvtaleFom",
    "datoAvtaleTom",
    "avtaleNr",
    "prosentAndel",
    "kommNrTjeneste",
    "gyldigAvtale",
    "kilde",
    "brukerId",
    "tidReg",
    "antAvtRett",
    "avtRettInfo"
})
public class AvtaleType {

    @XmlElement(required = true)
    protected String idOff;
    @XmlElement(required = true)
    protected String kodeIdentTypeU;
    @XmlElement(required = true)
    protected String kodeSamhTypeU;
    @XmlElement(required = true)
    protected String kodeAvtaleType;
    @XmlElement(required = true)
    protected String beskrAvtaleType;
    @XmlElement(required = true)
    protected String datoAvtaleFom;
    @XmlElement(required = true)
    protected String datoAvtaleTom;
    @XmlElement(required = true)
    protected String avtaleNr;
    @XmlElement(required = true)
    protected String prosentAndel;
    @XmlElement(required = true)
    protected String kommNrTjeneste;
    @XmlElement(required = true)
    protected String gyldigAvtale;
    @XmlElement(required = true)
    protected String kilde;
    @XmlElement(required = true)
    protected String brukerId;
    @XmlElement(required = true)
    protected String tidReg;
    @XmlElement(required = true)
    protected String antAvtRett;
    protected AvtaleType.AvtRettInfo avtRettInfo;

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
     * Gets the value of the kodeAvtaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeAvtaleType() {
        return kodeAvtaleType;
    }

    /**
     * Sets the value of the kodeAvtaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeAvtaleType(String value) {
        this.kodeAvtaleType = value;
    }

    /**
     * Gets the value of the beskrAvtaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrAvtaleType() {
        return beskrAvtaleType;
    }

    /**
     * Sets the value of the beskrAvtaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrAvtaleType(String value) {
        this.beskrAvtaleType = value;
    }

    /**
     * Gets the value of the datoAvtaleFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoAvtaleFom() {
        return datoAvtaleFom;
    }

    /**
     * Sets the value of the datoAvtaleFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoAvtaleFom(String value) {
        this.datoAvtaleFom = value;
    }

    /**
     * Gets the value of the datoAvtaleTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoAvtaleTom() {
        return datoAvtaleTom;
    }

    /**
     * Sets the value of the datoAvtaleTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoAvtaleTom(String value) {
        this.datoAvtaleTom = value;
    }

    /**
     * Gets the value of the avtaleNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvtaleNr() {
        return avtaleNr;
    }

    /**
     * Sets the value of the avtaleNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvtaleNr(String value) {
        this.avtaleNr = value;
    }

    /**
     * Gets the value of the prosentAndel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProsentAndel() {
        return prosentAndel;
    }

    /**
     * Sets the value of the prosentAndel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProsentAndel(String value) {
        this.prosentAndel = value;
    }

    /**
     * Gets the value of the kommNrTjeneste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommNrTjeneste() {
        return kommNrTjeneste;
    }

    /**
     * Sets the value of the kommNrTjeneste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommNrTjeneste(String value) {
        this.kommNrTjeneste = value;
    }

    /**
     * Gets the value of the gyldigAvtale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGyldigAvtale() {
        return gyldigAvtale;
    }

    /**
     * Sets the value of the gyldigAvtale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGyldigAvtale(String value) {
        this.gyldigAvtale = value;
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

    /**
     * Gets the value of the antAvtRett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntAvtRett() {
        return antAvtRett;
    }

    /**
     * Sets the value of the antAvtRett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntAvtRett(String value) {
        this.antAvtRett = value;
    }

    /**
     * Gets the value of the avtRettInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AvtaleType.AvtRettInfo }
     *     
     */
    public AvtaleType.AvtRettInfo getAvtRettInfo() {
        return avtRettInfo;
    }

    /**
     * Sets the value of the avtRettInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvtaleType.AvtRettInfo }
     *     
     */
    public void setAvtRettInfo(AvtaleType.AvtRettInfo value) {
        this.avtRettInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="avtaleRettighet" type="{http://www.rtv.no/NamespaceTSS}avtaleRettType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "avtaleRettighet"
    })
    public static class AvtRettInfo {

        @XmlElement(required = true)
        protected List<AvtaleRettType> avtaleRettighet;

        /**
         * Gets the value of the avtaleRettighet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the avtaleRettighet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvtaleRettighet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvtaleRettType }
         * 
         * 
         */
        public List<AvtaleRettType> getAvtaleRettighet() {
            if (avtaleRettighet == null) {
                avtaleRettighet = new ArrayList<AvtaleRettType>();
            }
            return this.avtaleRettighet;
        }

    }

}
