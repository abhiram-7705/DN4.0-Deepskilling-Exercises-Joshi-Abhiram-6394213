import React from "react";
class Cart extends React.Component {
  render() {
    return (
      <table style={{ margin: "0 auto", borderCollapse: "collapse", textAlign: "center" }} border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Item Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {this.props.item.map((item, index) => (
            <tr key={index}>
              <td>{item.itemname}</td>
              <td>{item.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    );
  }
}

export default Cart;
