package com.ardublock.translator.block.letsgoING;
import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class LGIQtouchButton1IsTouched extends TranslatorBlock
{
	public LGIQtouchButton1IsTouched(Long blockId, Translator translator, String codePrefix,	String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}


	
	public String toCode() throws SocketNullException, SubroutineNotDeclaredException
	{
		
		 // Header hinzuf�gen
		translator.addHeaderFile("LGI_QTouch.h");
		
		
		// Deklarationen hinzuf�gen
		//translator.addDefinitionCommand(serialEventFunction);

		String ret = "Button1.isTouched()";
		

		return codePrefix + ret + codeSuffix;
	}
	
}