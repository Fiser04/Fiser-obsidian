import React from "react";
import ReactDOM from "react-dom/client";

class Car extends React.Component {
  render() {
    return <h2>I am a Car!</h2>;
  }
}

function Car2() {
  return <h2>I am also a Car!</h2>;
}

class Garage extends React.Component {
  render() {
    return (
      <div>
        <h1>Who lives in my garage?</h1>
        <Car />
        <Car2 />
      </div>
    );
  }
}

// const element = <h1>Hello, world!</h1>;
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<Garage />);
