// const name = "John";
// const element = <h1>Hello, {name}</h1>;
// ReactDOM.render(element, document.getElementById("root"));

function formatUser(user) {
  return `${user.name} (${user.age})`;
}

const user = {
  name: "John",
  age: 30,
};

const element = <h1>Hello, {formatUser(user)}</h1>;

ReactDOM.render(element, document.getElementById("root"));
