//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.nav.tilbakekreving.typer.v1;

import java.time.LocalDate;
import io.github.threetenjaxb.core.LocalDateXmlAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PeriodeDto complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PeriodeDto">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="tom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodeDto", propOrder = {
    "fom",
    "tom"
})
public class PeriodeDto {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fom;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tom;

    /**
     * Gets the value of the fom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFom() {
        return fom;
    }

    /**
     * Sets the value of the fom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFom(LocalDate value) {
        this.fom = value;
    }

    /**
     * Gets the value of the tom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTom() {
        return tom;
    }

    /**
     * Sets the value of the tom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTom(LocalDate value) {
        this.tom = value;
    }

}
