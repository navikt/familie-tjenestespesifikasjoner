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
 * Her beskrives returfeltene fra 992
 * 
 * <p>Java class for typeOD992 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeOD992"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="antKodeVerk" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/&gt;
 *         &lt;element name="kodeVerk" type="{http://www.rtv.no/NamespaceTSS}kodeVerkType1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOD992", propOrder = {
    "antKodeVerk",
    "kodeVerk"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class TypeOD992 {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String antKodeVerk;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected List<KodeVerkType1> kodeVerk;

    /**
     * Gets the value of the antKodeVerk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getAntKodeVerk() {
        return antKodeVerk;
    }

    /**
     * Sets the value of the antKodeVerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setAntKodeVerk(String value) {
        this.antKodeVerk = value;
    }

    /**
     * Gets the value of the kodeVerk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kodeVerk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKodeVerk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KodeVerkType1 }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public List<KodeVerkType1> getKodeVerk() {
        if (kodeVerk == null) {
            kodeVerk = new ArrayList<KodeVerkType1>();
        }
        return this.kodeVerk;
    }

}
