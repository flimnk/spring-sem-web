package br.com.alura.baheanet.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;

public class ConverteDados  implements  IConversorDados{
   private ObjectMapper mapper= new  ObjectMapper();
    @Override
    public <T> T converterDados(String Json, Class<T> classe) {
        try {
          return   mapper.readValue(Json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
