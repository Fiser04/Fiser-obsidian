import React from "react";

class MainItemForList extends React.Component {
  render() {
    return (
      <div className="main-item-for-list">
        <h3>{this.props.name}</h3>
        <p>{this.props.description}</p>
      </div>
    );
  }
}

export default MainItemForList;
