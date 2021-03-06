/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ox.oii.sigmaexporter.model;

import java.util.HashMap;

/**
 *
 * @author shale
 */
public class GraphElement {
	
	private String id;
	private HashMap<String,String> attributes;
        private String color;
        protected double size;
	
	public GraphElement(String id) {
		this.id=id;
		attributes=new HashMap<String,String>();
                color="";
	}
	
	public void putAttribute(String key, String value) {
		attributes.put(key, value);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HashMap<String, String> getAttributes() {
		return attributes;
	}

	public void putAttributes(HashMap<String, String> attributes) {
		this.attributes = attributes;
	}
        
        public String getColor() {
		return color;
	}
        
        public void setColor(String color) {
		this.color = color;
	}

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }

	
}

