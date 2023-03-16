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
 * <p>Java class for TAutorRettInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAutorRettInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autorRettighet" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="kodeAutorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="kodeAutorRettighet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="datoARFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *                   &lt;element name="datoARTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *                   &lt;element name="datoVedtakGitt" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *                   &lt;element name="datoVedtakMistet" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *                   &lt;element name="gyldigAutor" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/&gt;
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
@XmlType(name = "TAutorRettInfo", propOrder = {
    "autorRettighet"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class TAutorRettInfo {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected List<TAutorRettInfo.AutorRettighet> autorRettighet;

    /**
     * Gets the value of the autorRettighet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autorRettighet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutorRettighet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAutorRettInfo.AutorRettighet }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public List<TAutorRettInfo.AutorRettighet> getAutorRettighet() {
        if (autorRettighet == null) {
            autorRettighet = new ArrayList<TAutorRettInfo.AutorRettighet>();
        }
        return this.autorRettighet;
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
     *         &lt;element name="kodeAutorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="kodeAutorRettighet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="datoARFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
     *         &lt;element name="datoARTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
     *         &lt;element name="datoVedtakGitt" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
     *         &lt;element name="datoVedtakMistet" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
     *         &lt;element name="gyldigAutor" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/&gt;
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
        "kodeAutorType",
        "kodeAutorRettighet",
        "datoARFom",
        "datoARTom",
        "datoVedtakGitt",
        "datoVedtakMistet",
        "gyldigAutor"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public static class AutorRettighet {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String kodeAutorType;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String kodeAutorRettighet;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String datoARFom;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String datoARTom;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String datoVedtakGitt;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String datoVedtakMistet;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        protected String gyldigAutor;

        /**
         * Gets the value of the kodeAutorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getKodeAutorType() {
            return kodeAutorType;
        }

        /**
         * Sets the value of the kodeAutorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setKodeAutorType(String value) {
            this.kodeAutorType = value;
        }

        /**
         * Gets the value of the kodeAutorRettighet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getKodeAutorRettighet() {
            return kodeAutorRettighet;
        }

        /**
         * Sets the value of the kodeAutorRettighet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setKodeAutorRettighet(String value) {
            this.kodeAutorRettighet = value;
        }

        /**
         * Gets the value of the datoARFom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getDatoARFom() {
            return datoARFom;
        }

        /**
         * Sets the value of the datoARFom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setDatoARFom(String value) {
            this.datoARFom = value;
        }

        /**
         * Gets the value of the datoARTom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getDatoARTom() {
            return datoARTom;
        }

        /**
         * Sets the value of the datoARTom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setDatoARTom(String value) {
            this.datoARTom = value;
        }

        /**
         * Gets the value of the datoVedtakGitt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getDatoVedtakGitt() {
            return datoVedtakGitt;
        }

        /**
         * Sets the value of the datoVedtakGitt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setDatoVedtakGitt(String value) {
            this.datoVedtakGitt = value;
        }

        /**
         * Gets the value of the datoVedtakMistet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getDatoVedtakMistet() {
            return datoVedtakMistet;
        }

        /**
         * Sets the value of the datoVedtakMistet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setDatoVedtakMistet(String value) {
            this.datoVedtakMistet = value;
        }

        /**
         * Gets the value of the gyldigAutor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public String getGyldigAutor() {
            return gyldigAutor;
        }

        /**
         * Sets the value of the gyldigAutor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
        public void setGyldigAutor(String value) {
            this.gyldigAutor = value;
        }

    }

}
