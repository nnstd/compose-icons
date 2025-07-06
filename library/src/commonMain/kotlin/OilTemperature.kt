package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OilTemperature: ImageVector
    get() {
        if (_OilTemperature != null) {
            return _OilTemperature!!
        }
        _OilTemperature = ImageVector.Builder(
            name = "OilTemperature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                curveTo(10f, 1.4f, 9.6f, 1f, 9f, 1f)
                reflectiveCurveTo(8f, 1.4f, 8f, 2f)
                verticalLineTo(15.3f)
                curveTo(7.4f, 15.6f, 7f, 16.3f, 7f, 17f)
                curveTo(7f, 18.1f, 7.9f, 19f, 9f, 19f)
                reflectiveCurveTo(11f, 18.1f, 11f, 17f)
                curveTo(11f, 16.3f, 10.6f, 15.6f, 10f, 15.3f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                moveTo(22f, 17.5f)
                curveTo(22f, 17.5f, 24f, 19.7f, 24f, 21f)
                curveTo(24f, 22.1f, 23.1f, 23f, 22f, 23f)
                reflectiveCurveTo(20f, 22.1f, 20f, 21f)
                curveTo(20f, 19.7f, 22f, 17.5f, 22f, 17.5f)
                moveTo(22.9f, 15.5f)
                curveTo(22.6f, 16f, 22f, 16.1f, 21.5f, 15.9f)
                lineTo(19.4f, 14.7f)
                lineTo(15.8f, 21f)
                curveTo(15.5f, 21.6f, 14.8f, 22f, 14f, 22f)
                horizontalLineTo(5f)
                curveTo(3.9f, 22f, 3f, 21.1f, 3f, 20f)
                verticalLineTo(17f)
                curveTo(3f, 15.9f, 3.9f, 15f, 5f, 15f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                lineTo(16.1f, 16.4f)
                lineTo(13f, 18.2f)
                verticalLineTo(15.8f)
                lineTo(19.2f, 12.2f)
                lineTo(22.5f, 14.1f)
                curveTo(23f, 14.4f, 23.1f, 15f, 22.9f, 15.5f)
                moveTo(3.5f, 13.9f)
                lineTo(1.8f, 15.6f)
                curveTo(1.4f, 16f, 0.8f, 16f, 0.4f, 15.6f)
                reflectiveCurveTo(0f, 14.6f, 0.4f, 14.2f)
                lineTo(2.1f, 12.5f)
                curveTo(2.5f, 12.1f, 3.1f, 12.1f, 3.5f, 12.5f)
                reflectiveCurveTo(3.9f, 13.5f, 3.5f, 13.9f)
                close()
            }
        }.build()

        return _OilTemperature!!
    }

@Suppress("ObjectPropertyName")
private var _OilTemperature: ImageVector? = null
