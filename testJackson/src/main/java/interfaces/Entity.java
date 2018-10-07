package interfaces;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY)
@JsonIdentityInfo(generator = JSOGGenerator.class)
public interface Entity {

}