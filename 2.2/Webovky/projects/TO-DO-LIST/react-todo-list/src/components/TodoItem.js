import React from "react";

class TodoItem extends React.Component {
  render() {
    const { todo } = this.props;
    return (
      <li>
        {todo.title} {todo.completed ? "✅" : "❌"}
      </li>
    );
  }
}

export default TodoItem;
