package com.stcar.conversor;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import com.stcar.model.Variedade;
import com.stcar.service.VariedadeService;

public class VariedadeFormatter implements Formatter<Variedade> {
	
	@Autowired
	private VariedadeService variedadeService;

	@Override
	public String print(final Variedade object, final Locale locale) {
        return (object != null ? object.getId().toString() : "");
    }
	

	@Override
	 public Variedade parse(final String text, final Locale locale) throws ParseException {
        final Integer variedadeId = Integer.valueOf(text);
        return this.variedadeService.findById(variedadeId);
    }

}
