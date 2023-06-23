const express = require('express');
const exerciseRouter = express.Router();
const exerciseController = require("../Controllers/ExerciseController");
exerciseRouter.get("/cau1",exerciseController.tinhTong);
exerciseRouter.get("/cau2",exerciseController.kiemTraNT);
exerciseRouter.get("/cau3",exerciseController.maxInArray);
exerciseRouter.get("/cau4",exerciseController.reverseString);
exerciseRouter.get("/cau5",exerciseController.palindrome);
exerciseRouter.get("/cau6",exerciseController.countLetter);
exerciseRouter.get("/cau7",exerciseController.createString);
exerciseRouter.get("/cau8",exerciseController.factorial);
exerciseRouter.get("/cau9",exerciseController.sortAsc);
exerciseRouter.get("/cau10",exerciseController.anagram);
exerciseRouter.post("/cau11",exerciseController.createBook);
exerciseRouter.post("/cau12",exerciseController.createRectangle);
exerciseRouter.get("/cau13",exerciseController.evenArray);
exerciseRouter.get("/cau14",exerciseController.randomNumber);
exerciseRouter.get("/cau15",exerciseController.perfectNum);
exerciseRouter.get("/cau16",exerciseController.checkAsc);
exerciseRouter.get("/cau17",exerciseController.reverseWord);
exerciseRouter.get("/cau18",exerciseController.totalArray);
exerciseRouter.get("/cau19",exerciseController.startWithArray);
exerciseRouter.get("/cau20",exerciseController.reverseStringAndNumber);
exerciseRouter.get("/cau21",exerciseController.formatHour);
exerciseRouter.post("/cau22",exerciseController.guessNumber);
exerciseRouter.get("/cau21a",exerciseController.devideNum);
exerciseRouter.get("/cau21b",exerciseController.findLetter);












module.exports=exerciseRouter;