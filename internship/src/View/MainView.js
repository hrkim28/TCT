import React, { Component, Fragment } from 'react';
import HeaderView from './HeaderView';
import ControlView from './ControlView';
import FlowChartView from './FlowChartView';

class MainView extends Component {
    render() {
        return (
            <Fragment>
                <HeaderView />
                <ControlView
                    onProgress={this.props.onProgress}
                    onIncrement={this.props.onIncrement}
                    onRestart={this.props.onRestart} />
                <FlowChartView
                    process={this.props.process}
                    percent={this.props.percent} />
            </Fragment>
        );
    }
}

export default MainView;