/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.kayo08.aula11;

import com.github.kyriosdata.parser.Expressao;
import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;
import com.github.kyriosdata.parser.Token;
import java.util.List;

/**
 * 
 * @author Kayo Martins Freitas.
 *  
 * Classe onde será realizada o reconhecimento da expressão e a resolução
 * da mesma.
 * 
 */
public class Calculo {
    public static float Expressao(final String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao().valor();
    }
}
