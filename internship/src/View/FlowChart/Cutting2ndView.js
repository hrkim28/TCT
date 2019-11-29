import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class Cutting2ndView extends Component {
    render() {
        return (
            <div className="Cutting2nd">
                <Step.Group>
                    {
                        this.props.cutting2nd.result === true ?
                            <Step completed>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>2차전단</Step.Title>
                                    <Step.Description>2차 전단 및 슬라브 가공</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>2차전단</Step.Title>
                                    <Step.Description>2차 전단 및 슬라브 가공</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default Cutting2ndView;
