package com.zee.zee5_app.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.zee.zee5_app.dto.Login;

public class CustomListSerializer extends StdSerializer<Login> {
	@Override
	public void serialize(Login value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		// TODO Auto-generated method stub
		gen.writeObject(value);
		
		
	}

	public CustomListSerializer( ) {
		// TODO Auto-generated constructor stub
		this(null);
	}

	public CustomListSerializer(Class<Login> t) {
		// TODO Auto-generated constructor stub
		super(t);
	}
	
	

}