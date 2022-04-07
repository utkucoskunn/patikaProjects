const Koa = require("koa");
const Router = require("koa-router");

const app = new Koa();
const router = new Router();

router.get("/index", (ctx) => {
  ctx.body = "<h1>WELCOME TO INDEX PAGE.</h1>";
  ctx.status = 200;
});
router.get("/hakkimda", (ctx) => {
  ctx.body = "<h1>WELCOME TO ABOUT ME PAGE!</h1>";
  ctx.status = 200;
});
router.get("/iletisim", (ctx) => {
  ctx.body = "<h1>WELCOME TO CONTACT PAGE!</h1>";
  ctx.status = 200;
});
app.use(router.routes());
const port = 3000;

app.listen(port, () => {
  console.log(`Server ${port} Portunda Çalışıyor.`);
});