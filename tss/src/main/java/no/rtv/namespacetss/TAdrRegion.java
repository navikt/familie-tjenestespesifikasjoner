//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 09:21:05 PM CET 
//


package no.rtv.namespacetss;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAdrRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAdrRegion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adrRegion" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="avdNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="kodeAdrType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="kodeRegion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="datoRegionFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *                   &lt;element name="datoRegionTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *                   &lt;element name="gyldigRegion" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/&gt;
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
@XmlType(name = "TAdrRegion", propOrder = {
    "adrRegion"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class TAdrRegion {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected List<TAdrRegion.AdrRegion> adrRegion;

    /**
     * Gets the value of the adrRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adrRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAdrRegion.AdrRegion }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public List<TAdrRegion.AdrRegion> getAdrRegion() {
        if (adrRegion == null) {
            adrRegion = new ArrayList<TAdrRegion.AdrRegion>();
        }
        return this.adrRegion;
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
     *         &lt;element name="avdNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="kodeAdrType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="kodeRegion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="datoRegionFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
     *         &lt;element name="datoRegionTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
     *         &lt;element name="gyldigRegion" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/&gt;
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
        "avdNr",
        "kodeAdrType",
        "kodeRegion",
        "datoRegionFom",
        "datoRegionTom",
        "gyldigRegion"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public static class AdrRegion {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String avdNr;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String kodeAdrType;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String kodeRegion;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String datoRegionFom;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String datoRegionTom;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String gyldigRegion;

        /**
         * Gets the value of the avdNr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getAvdNr() {
            return avdNr;
        }

        /**
         * Sets the value of the avdNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setAvdNr(String value) {
            this.avdNr = value;
        }

        /**
         * Gets the value of the kodeAdrType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getKodeAdrType() {
            return kodeAdrType;
        }

        /**
         * Sets the value of the kodeAdrType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setKodeAdrType(String value) {
            this.kodeAdrType = value;
        }

        /**
         * Gets the value of the kodeRegion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getKodeRegion() {
            return kodeRegion;
        }

        /**
         * Sets the value of the kodeRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setKodeRegion(String value) {
            this.kodeRegion = value;
        }

        /**
         * Gets the value of the datoRegionFom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getDatoRegionFom() {
            return datoRegionFom;
        }

        /**
         * Sets the value of the datoRegionFom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setDatoRegionFom(String value) {
            this.datoRegionFom = value;
        }

        /**
         * Gets the value of the datoRegionTom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getDatoRegionTom() {
            return datoRegionTom;
        }

        /**
         * Sets the value of the datoRegionTom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setDatoRegionTom(String value) {
            this.datoRegionTom = value;
        }

        /**
         * Gets the value of the gyldigRegion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getGyldigRegion() {
            return gyldigRegion;
        }

        /**
         * Sets the value of the gyldigRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setGyldigRegion(String value) {
            this.gyldigRegion = value;
        }

    }

}