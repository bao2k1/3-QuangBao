const express = require("express");
const userRouter = express.Router();
const userController = require("../Controllers/UserController");
//GetAllUsers
userRouter.get("/", userController.getAllUsers);
//find user by name and age
userRouter.get("/find/", userController.getUserByNameAndAge);
//createUser
userRouter.post("/create-user", userController.createUser);
userRouter.post("/create-many-users", userController.createManyUsers);
//GetUser
userRouter.get("/:userId", userController.getUserById);


module.exports = userRouter;
