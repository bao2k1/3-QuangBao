const express = require("express");

const userRouter = require("./Routes/UserRoute");
const orderRouter = require("./Routes/OrderRoute");
const productRouter = require("./Routes/ProductRoute");
const countryRouter = require("./Routes/CountryRouter");
const app = express();
const port = 8000;
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// app.use("/api/v1/bs", bookRoute);
app.use("/api/v1/countries", countryRouter);
app.use("/api/v1/users", userRouter);
app.use("/api/v1/orders", orderRouter);
app.use("/api/v1/products", productRouter);


// app.get("/message/:msg", (req, res) => {
//   let msg = req.params.msg;
//   console.log("Message: " + msg);
//   res.send("Message was sent to ");
// });
// app.get("/", (req, res) => {
//   res.send("hello Bao");
// });
app.listen(port, () => {
  console.log(`listening on port ${port}`);
});
