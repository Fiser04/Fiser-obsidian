import React from "react";
import MainList from "./MainList";
import Header from "./Header";
import NavBar from "./NavBar";

class MainContainer extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      items: [
        {
          id: 1,
          name: "Item 1",
          description: "Description of Item 1",
          read: false,
        },
        {
          id: 2,
          name: "Item 2",
          description: "Description of Item 2",
          read: false,
        },
        {
          id: 3,
          name: "Item 3",
          description: "Description of Item 3",
          read: true,
        },
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
