//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:43 PM CET 
//


package no.nav.tilbakekreving.typer.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeGjelderDto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TypeGjelderDto"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PERSON"/&gt;
 *     &lt;enumeration value="ORGANISASJON"/&gt;
 *     &lt;enumeration value="SAMHANDLER"/&gt;
 *     &lt;enumeration value="APPBRUKER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeGjelderDto")
@XmlEnum
public enum TypeGjelderDto {

    PERSON,
    ORGANISASJON,
    SAMHANDLER,
    APPBRUKER;

    public String value() {
        return name();
    }

    public static TypeGjelderDto fromValue(String v) {
        return valueOf(v);
    }

}
