import React from "react";
import ReactDOM from "react-dom/client";
// import TodoContainer from "./components/TodoContainer";

class Car extends React.Component {
  // constructor() {
  //   super();
  //   this.state = { color: "red" };
  // }
  constructor(props) {
    super(props);
    this.state = {
      brand: "Ford",
      model: "Mustang",
      color: "red",
      year: 1964,
    };
  }
  changeColor = () => {
    this.setState({ color: "blue" });
  };
  render() {
    return (
      <div>
        <h2> I am a {this.state.brand} </h2>
        <p>
          I am a {this.state.color} {this.state.brand} {this.state.model} from{" "}
          {this.state.year}.
        </p>
        <button type="button" onClick={this.changeColor}>
          Change color
        </button>
      </div>
    );
  }
}

// function Car2() {
//   return <h2>I am also a Car!</h2>;
// }

class Garage extends React.Component {
  render() {
    const carInfo = {
      brand: "Ford",
      year: 1964,
    };
    return (
      <div>
        <h1>Who lives in my garage?</h1>
        <Car brand={carInfo} />
        {/* {<Car />}*/}
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
