package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindTurbineAlert: ImageVector
    get() {
        if (_WindTurbineAlert != null) {
            return _WindTurbineAlert!!
        }
        _WindTurbineAlert = ImageVector.Builder(
            name = "WindTurbineAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.33f, 11.67f)
                lineTo(15.21f, 14.58f)
                curveTo(16.62f, 13.16f, 15.21f, 11.75f, 15.21f, 11.75f)
                lineTo(13.72f, 10.24f)
                curveTo(13.9f, 9.86f, 14f, 9.44f, 14f, 9f)
                curveTo(14f, 7.95f, 13.46f, 7.03f, 12.64f, 6.5f)
                lineTo(14f, 2.11f)
                curveTo(12.09f, 1.53f, 11.5f, 3.44f, 11.5f, 3.44f)
                lineTo(10.69f, 6.03f)
                curveTo(9.46f, 6.16f, 8.46f, 7f, 8.13f, 8.18f)
                lineTo(3.67f, 9.63f)
                curveTo(4.31f, 11.53f, 6.2f, 10.9f, 6.2f, 10.9f)
                lineTo(8.27f, 10.23f)
                curveTo(8.61f, 10.97f, 9.23f, 11.54f, 10f, 11.82f)
                verticalLineTo(19f)
                curveTo(10f, 19f, 8f, 19f, 8f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                curveTo(14f, 21f, 14f, 19f, 12f, 19f)
                verticalLineTo(11.82f)
                curveTo(12.12f, 11.78f, 12.23f, 11.72f, 12.33f, 11.67f)
                moveTo(9.5f, 9f)
                curveTo(9.5f, 8.17f, 10.17f, 7.5f, 11f, 7.5f)
                reflectiveCurveTo(12.5f, 8.17f, 12.5f, 9f)
                reflectiveCurveTo(11.83f, 10.5f, 11f, 10.5f)
                reflectiveCurveTo(9.5f, 9.83f, 9.5f, 9f)
                moveTo(18f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                moveTo(18f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _WindTurbineAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WindTurbineAlert: ImageVector? = null
