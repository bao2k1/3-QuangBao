const express = require("express");
const userRouter = express.Router();
const userController = require("../Controllers/UserController");
const { validateUser } = require("../Middleware/Validate");
//GetAllUsers
userRouter.get("/", userController.getAllUsers);
//find user by name and age
userRouter.get("/find-by-name-and-age/", userController.getUserByNameAndAge);
//createUser
userRouter.post("/",validateUser, userController.createUser);
userRouter.post("/import-many-users", userController.createManyUsers);
//GetUser
userRouter.get("/:userId", userController.getUserById);


module.exports = userRouter;
