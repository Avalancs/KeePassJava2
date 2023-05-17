//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.17 at 11:23:19 AM BST 
//


package org.linguafranca.pwdb.kdbx.jaxb.binding;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastModificationTime" type="{}keepassDateTime"/>
 *         &lt;element name="CreationTime" type="{}keepassDateTime"/>
 *         &lt;element name="LastAccessTime" type="{}keepassDateTime"/>
 *         &lt;element name="ExpiryTime" type="{}keepassDateTime"/>
 *         &lt;element name="Expires" type="{}keepassBoolean"/>
 *         &lt;element name="UsageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationChanged" type="{}keepassDateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastModificationTime",
    "creationTime",
    "lastAccessTime",
    "expiryTime",
    "expires",
    "usageCount",
    "locationChanged"
})
@XmlRootElement(name = "Times")
public class Times {

    @XmlElement(name = "LastModificationTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date lastModificationTime;
    @XmlElement(name = "CreationTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date creationTime;
    @XmlElement(name = "LastAccessTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date lastAccessTime;
    @XmlElement(name = "ExpiryTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date expiryTime;
    @XmlElement(name = "Expires", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Boolean expires;
    @XmlElement(name = "UsageCount")
    protected int usageCount;
    @XmlElement(name = "LocationChanged", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date locationChanged;

    /**
     * Gets the value of the lastModificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastModificationTime() {
        return lastModificationTime;
    }

    /**
     * Sets the value of the lastModificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModificationTime(Date value) {
        this.lastModificationTime = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTime(Date value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the lastAccessTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * Sets the value of the lastAccessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAccessTime(Date value) {
        this.lastAccessTime = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryTime(Date value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpires(Boolean value) {
        this.expires = value;
    }

    /**
     * Gets the value of the usageCount property.
     * 
     */
    public int getUsageCount() {
        return usageCount;
    }

    /**
     * Sets the value of the usageCount property.
     * 
     */
    public void setUsageCount(int value) {
        this.usageCount = value;
    }

    /**
     * Gets the value of the locationChanged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLocationChanged() {
        return locationChanged;
    }

    /**
     * Sets the value of the locationChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationChanged(Date value) {
        this.locationChanged = value;
    }

}
