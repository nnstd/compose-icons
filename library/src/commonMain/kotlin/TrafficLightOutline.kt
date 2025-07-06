package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrafficLightOutline: ImageVector
    get() {
        if (_TrafficLightOutline != null) {
            return _TrafficLightOutline!!
        }
        _TrafficLightOutline = ImageVector.Builder(
            name = "TrafficLightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(8.86f)
                curveTo(18.72f, 8.41f, 20f, 6.86f, 20f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                curveTo(17f, 3.45f, 16.55f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                curveTo(7.45f, 3f, 7f, 3.45f, 7f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                curveTo(4f, 6.86f, 5.28f, 8.41f, 7f, 8.86f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                curveTo(4f, 11.86f, 5.28f, 13.41f, 7f, 13.86f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                curveTo(4f, 16.86f, 5.28f, 18.41f, 7f, 18.86f)
                verticalLineTo(20f)
                curveTo(7f, 20.55f, 7.45f, 21f, 8f, 21f)
                horizontalLineTo(16f)
                curveTo(16.55f, 21f, 17f, 20.55f, 17f, 20f)
                verticalLineTo(18.86f)
                curveTo(18.72f, 18.41f, 20f, 16.86f, 20f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(13.86f)
                curveTo(18.72f, 13.41f, 20f, 11.86f, 20f, 10f)
                moveTo(15f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                moveTo(12f, 18f)
                curveTo(12.83f, 18f, 13.5f, 17.33f, 13.5f, 16.5f)
                reflectiveCurveTo(12.83f, 15f, 12f, 15f)
                reflectiveCurveTo(10.5f, 15.67f, 10.5f, 16.5f)
                reflectiveCurveTo(11.17f, 18f, 12f, 18f)
                moveTo(12f, 13.5f)
                curveTo(12.83f, 13.5f, 13.5f, 12.83f, 13.5f, 12f)
                reflectiveCurveTo(12.83f, 10.5f, 12f, 10.5f)
                reflectiveCurveTo(10.5f, 11.17f, 10.5f, 12f)
                reflectiveCurveTo(11.17f, 13.5f, 12f, 13.5f)
                moveTo(12f, 9f)
                curveTo(12.83f, 9f, 13.5f, 8.33f, 13.5f, 7.5f)
                reflectiveCurveTo(12.83f, 6f, 12f, 6f)
                reflectiveCurveTo(10.5f, 6.67f, 10.5f, 7.5f)
                reflectiveCurveTo(11.17f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _TrafficLightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficLightOutline: ImageVector? = null
