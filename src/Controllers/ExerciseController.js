exports.tinhTong = (req, res) => {
  const { a, b } = req.query;
  res.send(`tong 2 so a va b: ${parseInt(a) + parseInt(b)}`);
};
//kiem tra NT
exports.kiemTraNT = (req, res) => {
  const { n } = req.query;
  function test_prime(n) {
    if (n === 1) {
      return `${n} khong la so nguyen to`;
    } else if (n === 2) {
      return `${n} la so nguyen to`;
    } else {
      for (var x = 2; x < n; x++) {
        if (n % x === 0) {
          return `${n} khong la so nguyen to`;
        }
      }
      return `${n} la so nguyen to`;
    }
  }
  res.send(test_prime(n));
};

//3. Tìm số lớn nhất trong một mảng.
exports.maxInArray = (req, res) => {
  const arr = req.body;
  // console.log(typeof arr)
  let temp = arr[0];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i + 1] > temp) {
      temp = arr[i + 1];
    }
  }
  res.send(`so lon nhat trong mang la: ${temp}`);
};
//. Đảo ngược một chuỗi.
exports.reverseString = (req, res) => {
  let { str } = req.query;
  // console.log(str);
  let reversedStr = str.split("").reverse().join("");
  res.send(reversedStr);
};
//5. Kiểm tra một chuỗi có phải là chuỗi palindrome hay không.
exports.palindrome = (req, res) => {
  const { str } = req.query;
  let reversedStr = str.split("").reverse().join("");
  if (str === reversedStr) {
    res.send(`${str} la chuoi palinerome`);
  } else res.send(`${str} khong la chuoi palinerome`);
};
// 6. Đếm số lần xuất hiện của một ký tự trong một chuỗi.
exports.countLetter = (req, res) => {
  const ask = req.body;
  let count = 0;
  // console.log(typeof(ask.str))
  for (let i = 0; i < ask.str.length; i++) {
    console.log(ask.str[i]);

    if (ask.letter === ask.str[i]) count++;
  }
  res.send(`so lan xuat hien cua ki tu ${ask.letter} la ${count}`);
};
//7. Tạo một chuỗi ngẫu nhiên với độ dài cho trước.
exports.createString = (req, res) => {
  const { length } = req.query;
  let result = "";
  const characters =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

  for (let i = 0; i < length; i++) {
    const randomIndex = Math.floor(Math.random() * characters.length);
    console.log(randomIndex);
    result += characters.charAt(randomIndex);
  }

  res.send(`chuoi random voi do dai ${length} do la: ${result}`);
};
//8. Tính giai thừa của một số.
exports.factorial = (req, res) => {
  const { n } = req.query;
  let temp = parseInt(n);
  let kq = 1;
  if (n == 0) kq = 0;
  else
    for (let i = 1; i <= temp; i++) {
      kq *= i;
    }
  res.send(`giai thua cua ${n} la: ${kq}`);
};
//9. Sắp xếp một mảng số theo thứ tự tăng dần.
exports.sortAsc = (req, res) => {
  const arr = req.body;
  let temp = arr[0];
  for (let i = 0; i < arr.length - 1; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[i]) {
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
      //    console.log(arr[i],arr[j]);
    }
  }
  res.send(`mang sau khi sap xep tang dan la: ${arr}`);
};
//10. Kiểm tra một chuỗi có phải là chuỗi anagram của chuỗi khác hay không.
exports.anagram = (req, res) => {
  const strs = req.body;
  function isAnagram(str1, str2) {
    const sortedStr1 = str1
      .replace(/\s/g, "")
      .toLowerCase()
      .split("")
      .sort()
      .join("");
    const sortedStr2 = str2
      .replace(/\s/g, "")
      .toLowerCase()
      .split("")
      .sort()
      .join("");

    return sortedStr1 === sortedStr2;
  }

  if (isAnagram(strs.str1, strs.str2)) {
    res.send(`${strs.str1} la anagram cua ${strs.str2}`);
  } else {
    res.send(`${strs.str1} khong la anagram cua ${strs.str2}`);
  }
};
//11. Tạo một đối tượng đại diện cho một quyển sách với các thuộc tính như tiêu đề, tác giả và năm xuất bản.
exports.createBook = (req, res) => {
  const { title, actor, year } = req.body;
  res.send({ title, actor, year });
};
//12. Tạo một đối tượng đại diện cho một hình chữ nhật với các thuộc tính như chiều dài, chiều rộng và tính diện tích.
exports.createRectangle = (req, res) => {
  const { width, height } = req.body;
  res.send({ width, height, acreage: width * height });
};
//13. Viết một hàm lấy một mảng số và trả về một mảng mới chỉ chứa các số chẵn.
exports.evenArray = (req, res) => {
  const arr = req.body;
  let evenArray = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 0) {
      evenArray.push(arr[i]);
    }
  }
  // console.log(evenArray);
  res.send(`Mang so chan: ${evenArray}`);
};
//14. Tạo một hàm tạo số ngẫu nhiên trong một khoảng cho trước.
exports.randomNumber = (req, res) => {
  const { min, max } = req.query;
  m = parseInt(max);
  n = parseInt(min);
  let num;
  num = Math.floor(Math.random() * (m - n + 1)) + n;
  res.send(`so ngau nhien trong khoang(${min},${max}) là ${num}`);
};
// 15. Tạo một hàm kiểm tra xem một số có phải là số hoàn hảo hay không (tổng các ước số bằng chính nó).
exports.perfectNum = (req, res) => {
  const { num } = req.query;
  const n = parseInt(num);
  let total = 0;
  for (let i = 0; i < n; i++) {
    if (n % i === 0) {
      total += i;
    }
  }
  console.log(total);
  if (total === n) res.send(`${num} la so hoan hao`);
  else res.send(`${num} khong la so hoan hao`);
};
// 16. Kiểm tra xem một mảng có phải là mảng tăng dần hay không.
exports.checkAsc = (req, res) => {
  const arr = req.body;

  if (
    (JSON.stringify(arr) ===
      JSON.stringify(
        arr.sort((a, b) => {
          if (a > b) return 1;
          if (a < b) return -1;
          return 0;
        })
      )) ===
    true
  )
    // true
    res.send(`${arr} la mang tang dan`);
  else res.send(`${arr} khong la mang tang dan`);
};
//17. Viết một hàm đảo ngược thứ tự các từ trong một chuỗi.
exports.reverseWord=(req,res)=>{
    const {str}=req.body

      var reversedStr=str.split(' ').reverse().join(" ");
        res.send(`${reversedStr} la chuoi da bien doi`);
           
}
//18. Tạo một hàm lấy một mảng số và trả về tổng của tất cả các số trong mảng.
exports.totalArray=(req,res)=>{
    const arr=req.body;
    // console.log(arr);
    let total =0
    for (let i=0;i<arr.length;i++){
        total+=arr[i];
    }
    res.send(`tong cua mang la ${total}`)
}
//19. Kiểm tra xem một chuỗi có bắt đầu bằng một chuỗi khác hay không.
exports.startWithArray=(req,res)=>{
    const strs=req.body
    lengthStr1=strs.str1.length;
    lengthStr2=strs.str2.length;
    if(lengthStr1<lengthStr2){
        res.send(`${strs.str1} khong bat dau bang ${strs.str2}`)

    }
    else{
        if(strs.str1.substring(0,lengthStr2)===strs.str2)
        {
            res.send(`${strs.str1} bat dau bang ${strs.str2}`)
        }
        else{
            res.send(`${strs.str1} khong bat dau bang ${strs.str2}`)
        }
    }
}
// 20. Tạo một hàm chuyển đổi một số thành chuỗi và ngược lại.
exports.reverseStringAndNumber=(req,res) => {
    const {args}= req.body
    try {
        if(typeof(args)=='number'){
            res.send({
                "args": args.toString(),
                "type": typeof(args.toString())
            })
        }
      
        else if(typeof(args)=='string'&& !isNaN(args)){
            
            res.send({
                "args": Number(args),
                "type": typeof(Number(args))
            })
        }
        else if(isNaN(args)){
            res.status(400).json({ message: "Can't change this" });
        }
        
        
    } catch (err) {
        res.status(400).json({ message: "Can't change this" });
    }
}
// 21. Tạo một hàm chuyển đổi định dạng thời gian từ 24 giờ sang 12 giờ.
exports.formatHour=(req,res)=>{
    const {hour}=req.body;
   const hourArr= hour.split(":");
   console.log(hourArr[0])
   if(parseInt(hourArr[0])>12&&parseInt(hourArr[0]<24)){
    hourArr[0]-=12;
    res.send(
        {
            "hourUpdated":hourArr.join(":")
        } 
            
    )
   }
   else if(parseInt(hourArr[0])===24){
    hourArr[0]-=24;
    res.send(
        {
            "hourUpdated":hourArr.join(":")
        } 
            
    )
   }
}

// 22. Tạo một hàm tạo ra một số ngẫu nhiên từ 1 đến 10 và cho phép người dùng đoán số đó.
num = Math.floor(Math.random() * (10 - 1 + 1)) + 1;
let count=1;
exports.guessNumber=(req,res)=>{

    const guess=req.body;
    // res.send(guess)
 console.log(num,count);
    if(guess.guess===num){
        res.send(
            {
                "result":num,
                "yourCountGuess":count
            }
        )
    }
    else if(guess.guess>num){
        ++count
        res.send("Please enter a smaller number")
    }
    else if(guess.guess<num){
        ++count;
        res.send("Please enter a bigger number")
    }
}
exports.devideNum=(req,res)=>{
    const {n}=req.query;
    const str=""
    const num=parseInt(n);
    if(num%3==0&&num%5!=0){
        res.send(`${str.concat("Fizz")}`)
    }
    if(num%5==0&&num%3!=0){
        res.send(`${str.concat("Buzz")}`)
    }
    if(num%15==0){
        res.send("FizzBuzz")
    }
}
exports.findLetter=(req,res)=>{
    const obj=req.body
    res.send(obj.str.at(obj.index-1))
}
//23. Tạo một hàm tìm ước số chung lớn nhất (UCLN) của hai số.

