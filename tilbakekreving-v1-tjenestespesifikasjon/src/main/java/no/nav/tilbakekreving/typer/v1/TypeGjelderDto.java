
package no.nav.tilbakekreving.typer.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeGjelderDto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeGjelderDto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERSON"/>
 *     &lt;enumeration value="ORGANISASJON"/>
 *     &lt;enumeration value="SAMHANDLER"/>
 *     &lt;enumeration value="APPBRUKER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
