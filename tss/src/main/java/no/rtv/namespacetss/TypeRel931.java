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
 * <p>Java class for typeRel931 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeRel931"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.rtv.no/NamespaceTSS}typeRela"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="samhandler110" type="{http://www.rtv.no/NamespaceTSS}typeSamhandler"/&gt;
 *         &lt;element name="alternativId111" type="{http://www.rtv.no/NamespaceTSS}typeAltId"/&gt;
 *         &lt;element name="samhandlerAvd125" type="{http://www.rtv.no/NamespaceTSS}typeSamhAvd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRel931", propOrder = {
    "samhandler110",
    "alternativId111",
    "samhandlerAvd125"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class TypeRel931
    extends TypeRela
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected TypeSamhandler samhandler110;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected TypeAltId alternativId111;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected TypeSamhAvd samhandlerAvd125;

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
     * Gets the value of the alternativId111 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAltId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public TypeAltId getAlternativId111() {
        return alternativId111;
    }

    /**
     * Sets the value of the alternativId111 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAltId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setAlternativId111(TypeAltId value) {
        this.alternativId111 = value;
    }

    /**
     * Gets the value of the samhandlerAvd125 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSamhAvd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public TypeSamhAvd getSamhandlerAvd125() {
        return samhandlerAvd125;
    }

    /**
     * Sets the value of the samhandlerAvd125 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSamhAvd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setSamhandlerAvd125(TypeSamhAvd value) {
        this.samhandlerAvd125 = value;
    }

}
