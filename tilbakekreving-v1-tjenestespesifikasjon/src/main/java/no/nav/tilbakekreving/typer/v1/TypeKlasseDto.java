//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.nav.tilbakekreving.typer.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for TypeKlasseDto</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TypeKlasseDto">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FEIL"/>
 *     <enumeration value="JUST"/>
 *     <enumeration value="SKAT"/>
 *     <enumeration value="TREK"/>
 *     <enumeration value="YTEL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeKlasseDto")
@XmlEnum
public enum TypeKlasseDto {

    FEIL,
    JUST,
    SKAT,
    TREK,
    YTEL;

    public String value() {
        return name();
    }

    public static TypeKlasseDto fromValue(String v) {
        return valueOf(v);
    }

}
