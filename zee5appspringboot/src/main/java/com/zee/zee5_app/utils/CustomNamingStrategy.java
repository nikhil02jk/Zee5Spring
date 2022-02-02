package com.zee.zee5_app.utils;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomNamingStrategy extends PhysicalNamingStrategyStandardImpl {
	
	private final static String POSTFIX="_table";
	//by default all tables should be ended with name _table.
	//we dont want to apply this_table for each and very entity spec 
	//we set it as a thumb rule.
	
	@Override
	public Identifier toPhysicalTableName(Identifier identifier, JdbcEnvironment context) {
		// TODO Auto-generated method stub
		if(identifier==null) {
			return null;
		}
		final String newName =identifier.getText()+POSTFIX;
		return identifier.toIdentifier(identifier.getText().toLowerCase());
				
	}

}
