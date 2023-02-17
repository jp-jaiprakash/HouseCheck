package in.jaiprakash.householdgroceries.configurations;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

@Component
public class CustomJwtConverter implements Converter<Jwt, AbstractAuthenticationToken> {
    @Override
    public AbstractAuthenticationToken convert(MappingContext<Jwt, AbstractAuthenticationToken> mappingContext) {
        return null;
    }
}
