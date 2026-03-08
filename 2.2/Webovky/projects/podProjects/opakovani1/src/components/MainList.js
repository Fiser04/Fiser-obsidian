import React from "react";
import MainItemForList from "./MainItemForList.js";

class MainList extends React.Component {
  render() {
    return (
      <div className="main-list">
        {this.props.items.map((item) => (
          <MainItemForList
            key={item.id}
            name={item.name}
            description={item.description}
            read={item.read}
          />
        ))}
      </div>
    );
  }
}

export default MainList;
