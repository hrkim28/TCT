import React, { Component } from 'react';
import { Segment } from 'semantic-ui-react';
import { Step } from 'semantic-ui-react'

class FlowChartView extends Component {

    render() {

        return (
            <div className="FlowChartSegment">
                <Segment>
                    <Step.Group ordered>
                        <Step >
                            <Step.Content>
                                <Step.Title>Shipping</Step.Title>
                                <Step.Description>Choose your shipping options</Step.Description>
                            </Step.Content>
                        </Step>
                        <Step completed>
                            <Step.Content>
                                <Step.Title>Billing</Step.Title>
                                <Step.Description>Enter billing information</Step.Description>
                            </Step.Content>
                        </Step>
                        <Step active>
                            <Step.Content>
                                <Step.Title>Confirm Order</Step.Title>
                            </Step.Content>
                        </Step>
                        <Step active>
                            <Step.Content>
                                <Step.Title>Success</Step.Title>
                            </Step.Content>
                        </Step>
                    </Step.Group>
                </Segment>
            </div>
        );
    }
}

export default FlowChartView;
