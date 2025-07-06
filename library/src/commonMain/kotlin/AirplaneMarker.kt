package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneMarker: ImageVector
    get() {
        if (_AirplaneMarker != null) {
            return _AirplaneMarker!!
        }
        _AirplaneMarker = ImageVector.Builder(
            name = "AirplaneMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.33f, 11.05f)
                curveTo(14.17f, 11.88f, 13.34f, 13.14f, 13.09f, 14.58f)
                lineTo(11.55f, 11.63f)
                lineTo(7.66f, 15.5f)
                lineTo(8f, 18f)
                lineTo(6.95f, 19.06f)
                lineTo(5.18f, 15.87f)
                lineTo(2f, 14.11f)
                lineTo(3.06f, 13.05f)
                lineTo(5.54f, 13.4f)
                lineTo(9.43f, 9.5f)
                lineTo(2f, 5.62f)
                lineTo(3.41f, 4.21f)
                lineTo(12.61f, 6.33f)
                lineTo(16.5f, 2.44f)
                curveTo(17.08f, 1.85f, 18.03f, 1.85f, 18.62f, 2.44f)
                curveTo(19.2f, 3.03f, 19.2f, 4f, 18.62f, 4.56f)
                lineTo(14.73f, 8.45f)
                lineTo(15.33f, 11.05f)
                moveTo(22f, 15.5f)
                curveTo(22f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(15f, 18.1f, 15f, 15.5f)
                curveTo(15f, 13.6f, 16.6f, 12f, 18.5f, 12f)
                reflectiveCurveTo(22f, 13.6f, 22f, 15.5f)
                moveTo(19.7f, 15.6f)
                curveTo(19.7f, 15f, 19.1f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                reflectiveCurveTo(19.8f, 16.2f, 19.7f, 15.6f)
            }
        }.build()

        return _AirplaneMarker!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneMarker: ImageVector? = null
