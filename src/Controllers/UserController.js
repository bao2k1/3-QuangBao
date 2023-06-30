const userData = require("../data/userData");
exports.getAllUsers = (req, res) => {
  res.send([
    { email: "quangbao0205@gmail.com", fullname: "Quang Bao" },
    { admin: "admin@gmail.com", fullname: "Admin" },
  ]);
};
exports.getUserById = (req, res) => {
  const userId = req.params.userId;
  console.log("userId: ", userId);
  res.send({ userId });
};
exports.getUserByNameAndAge = (req, res) => {
  const { name, age } = req.query;
  console.log("name: ", name);
  console.log("age: ", age);
  res.send({
    name,
    age,
  });
};

exports.createUser =  (req, res) => {
  const { username, password, age } = req.body;
  res.status(201).json({ message: "User Added" });
  // res.send({
  //   username,
  //   password,
  //   age,
  // });
  // res.send("ok")
};
exports.createManyUsers = (req, res) => {
  const users = [];
  userData.forEach((user) => {
    let userInput = {
        id: user.id,
      username: user.username,
      password: user.password,
      age: user.age,
    };
    users.push(userInput);

  });
  res.send(users);
};
// module.exports = {getAllBooks};
