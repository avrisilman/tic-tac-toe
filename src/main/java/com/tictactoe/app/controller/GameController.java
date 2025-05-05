package com.tictactoe.app.controller;

import com.tictactoe.app.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/")
    public String index(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) model.addAttribute("error", error);
        return "index";
    }

    @PostMapping("/start")
    public String startGame(@RequestParam int size, Model model) {
        if (size < 3 || size > 20) {
            return "redirect:/?error=Board size must be between 3 and 20";
        }
        gameService.initGame(size);
        model.addAttribute("board", gameService.getBoard());
        return "game";
    }

    @PostMapping("/move")
    public String makeMove(@RequestParam int row, @RequestParam int col, Model model) {
        gameService.makeMove(row, col);
        model.addAttribute("board", gameService.getBoard());
        model.addAttribute("winner", gameService.getWinner());
        return "game";
    }

}