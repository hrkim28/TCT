import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class ChargingView extends Component {
    render() {
        return (
            <div className="Charging">
                <Step.Group>
                    {
                        this.props.charging.result === true ?
                            <Step completed>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>장입</Step.Title>
                                    <Step.Description>주편 및 슬라브 장입</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>장입</Step.Title>
                                    <Step.Description>주편 및 슬라브 장입</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default ChargingView;
