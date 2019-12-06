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
                                <Icon name='clone' />
                                <Step.Content>
                                    <Step.Title>PCR</Step.Title>
                                    <Step.Description>특정 DNA 조각 추출 증식</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='clone' />
                                <Step.Content>
                                    <Step.Title>PCR</Step.Title>
                                    <Step.Description>특정 DNA 조각 추출 증식</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default Cutting2ndView;
