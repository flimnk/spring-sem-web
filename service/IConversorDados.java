package br.com.alura.baheanet.service;

public interface IConversorDados {
    <T> T converterDados(String Json, Class <T>  classe);



}
