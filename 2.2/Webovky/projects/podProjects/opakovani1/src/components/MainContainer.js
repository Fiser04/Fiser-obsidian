import React from "react";
import MainList from "./MainList";
import Header from "./Header";
import NavBar from "./NavBar";

class MainContainer extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      items: [
        { id: 1, name: "Item 1", description: "Description of Item 1" },
        { id: 2, name: "Item 2", description: "Description of Item 2" },
        { id: 3, name: "Item 3", description: "Description of Item 3" },
      ],
    };
  }

  render() {
    return (
      <div className="main-container">
        <Header />
        <NavBar />
        <h1>Main Container</h1>
        <MainList items={this.state.items} />
      </div>
    );
  }
}

export default MainContainer;
