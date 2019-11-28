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
                    onRestart={this.props.onRestart}
                    process={this.props.process} />
                <FlowChartView
                    process={this.props.process} />
            </Fragment>
        );
    }
}

export default MainView;