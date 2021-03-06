//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:29:24 AM PDT 
//


package com.prairiesky.transform.cobieifc.settings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}DurationPropertyNames"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}FrequencyPropertyNames"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}StartPropertyNames"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobSettingsType", propOrder = {
    "durationPropertyNames",
    "frequencyPropertyNames",
    "startPropertyNames"
})
public class JobSettingsType {

    @XmlElement(name = "DurationPropertyNames", required = true)
    protected NameCollectionType durationPropertyNames;
    @XmlElement(name = "FrequencyPropertyNames", required = true)
    protected NameCollectionType frequencyPropertyNames;
    @XmlElement(name = "StartPropertyNames", required = true)
    protected NameCollectionType startPropertyNames;

    /**
     * Gets the value of the durationPropertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link NameCollectionType }
     *     
     */
    public NameCollectionType getDurationPropertyNames() {
        return durationPropertyNames;
    }

    /**
     * Sets the value of the durationPropertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCollectionType }
     *     
     */
    public void setDurationPropertyNames(NameCollectionType value) {
        this.durationPropertyNames = value;
    }

    /**
     * Gets the value of the frequencyPropertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link NameCollectionType }
     *     
     */
    public NameCollectionType getFrequencyPropertyNames() {
        return frequencyPropertyNames;
    }

    /**
     * Sets the value of the frequencyPropertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCollectionType }
     *     
     */
    public void setFrequencyPropertyNames(NameCollectionType value) {
        this.frequencyPropertyNames = value;
    }

    /**
     * Gets the value of the startPropertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link NameCollectionType }
     *     
     */
    public NameCollectionType getStartPropertyNames() {
        return startPropertyNames;
    }

    /**
     * Sets the value of the startPropertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCollectionType }
     *     
     */
    public void setStartPropertyNames(NameCollectionType value) {
        this.startPropertyNames = value;
    }

}
