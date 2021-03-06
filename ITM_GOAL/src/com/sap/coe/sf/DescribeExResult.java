package com.sap.coe.sf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for DescribeExResult complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeExResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityInfo" type="{urn:sfobject.sfapi.successfactors.com}EntityInfo" minOccurs="0"/>
 *         &lt;element name="field" type="{urn:sfobject.sfapi.successfactors.com}FieldEx" maxOccurs="unbounded"/>
 *         &lt;element name="feature" type="{urn:sfobject.sfapi.successfactors.com}featureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="error" type="{urn:sfobject.sfapi.successfactors.com}Error" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeExResult", propOrder =
{ "type", "entityInfo", "field", "feature", "error" })
public class DescribeExResult
{
	
	@XmlElement(required = true, nillable = true) protected String type;
	protected EntityInfo entityInfo;
	@XmlElement(required = true, nillable = true) protected List<FieldEx> field;
	protected List<FeatureType> feature;
	@XmlElement(nillable = true) protected List<Error> error;
	
	
	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType()
	{
		return type;
	}
	
	
	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value)
	{
		this.type = value;
	}
	
	
	/**
	 * Gets the value of the entityInfo property.
	 * 
	 * @return possible object is {@link EntityInfo }
	 * 
	 */
	public EntityInfo getEntityInfo()
	{
		return entityInfo;
	}
	
	
	/**
	 * Sets the value of the entityInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link EntityInfo }
	 * 
	 */
	public void setEntityInfo(EntityInfo value)
	{
		this.entityInfo = value;
	}
	
	
	/**
	 * Gets the value of the field property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the field property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getField().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link FieldEx }
	 * 
	 * 
	 */
	public List<FieldEx> getField()
	{
		if (field == null)
		{
			field = new ArrayList<FieldEx>();
		}
		return this.field;
	}
	
	
	/**
	 * Gets the value of the feature property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the feature property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFeature().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link FeatureType }
	 * 
	 * 
	 */
	public List<FeatureType> getFeature()
	{
		if (feature == null)
		{
			feature = new ArrayList<FeatureType>();
		}
		return this.feature;
	}
	
	
	/**
	 * Gets the value of the error property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the error property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getError().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Error }
	 * 
	 * 
	 */
	public List<Error> getError()
	{
		if (error == null)
		{
			error = new ArrayList<Error>();
		}
		return this.error;
	}
	
}
