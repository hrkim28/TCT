import React, { Fragment } from 'react';
import './App.css';
import FlowChartContainer from './Container/FlowChartContainer';
import { hot } from 'react-hot-loader'

function App() {
  return (
    <Fragment>
      <FlowChartContainer />
    </Fragment>
  );
}

export default hot(module)(App);
