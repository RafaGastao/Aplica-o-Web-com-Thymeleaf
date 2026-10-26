package com.portfolio;

import java.time.Year;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
    @GetMapping({"/", "/index.html"})
    public String index(Model model) {
        model.addAttribute("apresentacao", "Construindo projetos práticos em HTML, CSS, JavaScript e React, com foco em interfaces\n            modernas, performance e código bem estruturado.");
        model.addAttribute("sobre", "Tenho 21 anos e sou apaixonado por tecnologia e desenvolvimento de software. Atualmente, estudo  com desenvolvimento Full Stack, criando interfaces modernas e responsivas com React e SASS, além de desenvolver a lógica de aplicações e gerenciar bancos de dados com Python e MySQL.\nGosto de desafios e de aprender novas tecnologias para resolver problemas do mundo real. Meu foco é sempre criar aplicações eficientes e bem estruturadas.");
        model.addAttribute("habilidades", List.of("HTML & CSS", "JavaScript", "React", "Git & GitHub", "SASS", "Python", "MySQL"));
        model.addAttribute("certificados", List.of(Map.of("titulo", "Desenvolvedor(a) FullStack — Vai na Web", "descricao", "Formação concluída com 234h de carga horária."), Map.of("titulo", "Carreira em Cibersegurança", "descricao", "Certificação de trilha focada em fundamentos e práticas de segurança."), Map.of("titulo", "HTML e CSS para Iniciantes", "descricao", "Curso completo da Origamid, com 46 horas de estudo sobre estrutura, semântica e estilização de páginas web.")));
        model.addAttribute("projetos", List.of(Map.of("titulo", "Desafio Final — Biblioteca", "descricao", "Projeto web desenvolvido como desafio final, com foco em interface responsiva, organização de conteúdo e navegação intuitiva para uma experiência de uso clara e agradável."), Map.of("titulo", "Cemitério Online", "descricao", "Sistema web para gestão de cemitérios, com foco em organização de informações e operações administrativas."), Map.of("titulo", "Bikcraft", "descricao", "Landing page responsiva desenvolvida com HTML, CSS e JavaScript, utilizando Flexbox, CSS Grid e organização de componentes para criar as páginas de produtos, seguros e contato.")));
        model.addAttribute("nome", "Rafael Gastão");
        model.addAttribute("cargo", "Desenvolvedor Front-end");
        model.addAttribute("ano", Year.now().getValue());
        return "index";
    }
}
