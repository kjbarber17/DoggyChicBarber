/*package controller;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ServicesCategoryConverter implements AttributeConverter<String,Integer> {

	@Override
	public Integer convertToDatabaseColumn(String attribute) {
		// TODO Auto-generated method stub
		return (attribute == null ? null : Integer.valueOf(attribute));
	}

	@Override
	public String convertToEntityAttribute(Integer dbData) {
		// TODO Auto-generated method stub
		return (dbData == null ? null : dbData.toString());
	}
}


*/