import React from "react";
import ReactDOM from "react-dom/client";
import TodoContainer from "./components/TodoContainer";

class Car extends React.Component {
  // constructor() {
  //   super();
  //   this.state = { color: "red" };
  // }
  render() {
    return <h2>I am a {this.props.brand} Car!</h2>;
  }
}

// function Car2() {
//   return <h2>I am also a Car!</h2>;
// }

class Garage extends React.Component {
  render() {
    const carName = "Mustang";
    return (
      <div>
        <h1>Who lives in my garage?</h1>
        <Car brand={carName} />
        {/* <Car2 />*/}
      </div>
    );
  }
}
// const element = <h1>Hello, world!</h1>;
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<Garage />);

/*
import React from "react";
import ReactDOM from "react-dom/client";
import TodoContainer from "./components/TodoContainer";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <TodoContainer />
  </React.StrictMode>,
);
*/
