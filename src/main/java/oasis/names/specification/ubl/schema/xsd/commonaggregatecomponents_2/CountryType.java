//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.12 at 09:12:08 PM AEDT 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IdentificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *           &lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;
 *           &lt;ccts:DictionaryEntryName&gt;Country. Details&lt;/ccts:DictionaryEntryName&gt;
 *           &lt;ccts:Definition&gt;Information about a geopolitical country.&lt;/ccts:Definition&gt;
 *           &lt;ccts:ObjectClass&gt;Country&lt;/ccts:ObjectClass&gt;
 *         &lt;/ccts:Component&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for CountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IdentificationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryType", propOrder = {
    "identificationCode",
    "name"
})
public class CountryType {

    @XmlElement(name = "IdentificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IdentificationCodeType identificationCode;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Country. Identification Code. Code&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An identifier for the Country.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Country&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Identification Code&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Country Identification_ Code. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link IdentificationCodeType }
     *     
     */
    public IdentificationCodeType getIdentificationCode() {
        return identificationCode;
    }

    /**
     * Sets the value of the identificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationCodeType }
     *     
     */
    public void setIdentificationCode(IdentificationCodeType value) {
        this.identificationCode = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Country. Name&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;The name of the Country.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Country&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Name&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;
     *               &lt;ccts:Examples&gt;“SOUTH AFRICA”&lt;/ccts:Examples&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

}
