package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeatPumpOutline: ImageVector
    get() {
        if (_HeatPumpOutline != null) {
            return _HeatPumpOutline!!
        }
        _HeatPumpOutline = ImageVector.Builder(
            name = "HeatPumpOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(12f, 18f)
                curveTo(15.31f, 18f, 18f, 15.31f, 18f, 12f)
                reflectiveCurveTo(15.31f, 6f, 12f, 6f)
                reflectiveCurveTo(6f, 8.69f, 6f, 12f)
                reflectiveCurveTo(8.69f, 18f, 12f, 18f)
                moveTo(11.25f, 15.92f)
                curveTo(10.7f, 15.82f, 10.2f, 15.6f, 9.75f, 15.3f)
                lineTo(11.25f, 13.8f)
                verticalLineTo(15.92f)
                moveTo(12.75f, 15.92f)
                verticalLineTo(13.81f)
                lineTo(14.25f, 15.31f)
                curveTo(13.8f, 15.61f, 13.3f, 15.82f, 12.75f, 15.92f)
                moveTo(15.31f, 14.25f)
                lineTo(13.81f, 12.75f)
                horizontalLineTo(15.92f)
                curveTo(15.82f, 13.3f, 15.61f, 13.8f, 15.31f, 14.25f)
                moveTo(15.92f, 11.25f)
                horizontalLineTo(13.81f)
                lineTo(15.31f, 9.75f)
                curveTo(15.61f, 10.2f, 15.82f, 10.7f, 15.92f, 11.25f)
                moveTo(12.75f, 8.08f)
                curveTo(13.3f, 8.18f, 13.8f, 8.4f, 14.25f, 8.7f)
                lineTo(12.75f, 10.2f)
                verticalLineTo(8.08f)
                moveTo(12f, 11f)
                curveTo(12.55f, 11f, 13f, 11.45f, 13f, 12f)
                reflectiveCurveTo(12.55f, 13f, 12f, 13f)
                reflectiveCurveTo(11f, 12.55f, 11f, 12f)
                reflectiveCurveTo(11.45f, 11f, 12f, 11f)
                moveTo(11.25f, 8.08f)
                verticalLineTo(10.19f)
                lineTo(9.75f, 8.69f)
                curveTo(10.2f, 8.39f, 10.7f, 8.18f, 11.25f, 8.08f)
                moveTo(8.69f, 9.75f)
                lineTo(10.19f, 11.25f)
                horizontalLineTo(8.08f)
                curveTo(8.18f, 10.7f, 8.39f, 10.2f, 8.69f, 9.75f)
                moveTo(10.19f, 12.75f)
                lineTo(8.69f, 14.25f)
                curveTo(8.39f, 13.81f, 8.18f, 13.3f, 8.07f, 12.75f)
                horizontalLineTo(10.19f)
                close()
            }
        }.build()

        return _HeatPumpOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeatPumpOutline: ImageVector? = null
