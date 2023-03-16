//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 09:21:05 PM CET 
//


package no.rtv.namespacetss;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Typen beskriver alle feltene i en enkelt samhandlerrelasjon.
 * 
 * <p>Java class for typeRelasjoner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeRelasjoner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.rtv.no/NamespaceTSS}typeRelAvt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="samhandler110" type="{http://www.rtv.no/NamespaceTSS}typeSamhandler"/&gt;
 *         &lt;element name="relasjoner180" type="{http://www.rtv.no/NamespaceTSS}typeRelAvtaler"/&gt;
 *         &lt;element name="avtaler190" type="{http://www.rtv.no/NamespaceTSS}typeAvtaler"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRelasjoner", propOrder = {
    "samhandler110",
    "relasjoner180",
    "avtaler190"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class TypeRelasjoner
    extends TypeRelAvt
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected TypeSamhandler samhandler110;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected TypeRelAvtaler relasjoner180;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected TypeAvtaler avtaler190;

    /**
     * Gets the value of the samhandler110 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSamhandler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public TypeSamhandler getSamhandler110() {
        return samhandler110;
    }

    /**
     * Sets the value of the samhandler110 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSamhandler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setSamhandler110(TypeSamhandler value) {
        this.samhandler110 = value;
    }

    /**
     * Gets the value of the relasjoner180 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRelAvtaler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public TypeRelAvtaler getRelasjoner180() {
        return relasjoner180;
    }

    /**
     * Sets the value of the relasjoner180 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRelAvtaler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setRelasjoner180(TypeRelAvtaler value) {
        this.relasjoner180 = value;
    }

    /**
     * Gets the value of the avtaler190 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAvtaler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public TypeAvtaler getAvtaler190() {
        return avtaler190;
    }

    /**
     * Sets the value of the avtaler190 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAvtaler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setAvtaler190(TypeAvtaler value) {
        this.avtaler190 = value;
    }

}
