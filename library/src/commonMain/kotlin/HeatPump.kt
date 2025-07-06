package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeatPump: ImageVector
    get() {
        if (_HeatPump != null) {
            return _HeatPump!!
        }
        _HeatPump = ImageVector.Builder(
            name = "HeatPump",
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
                moveTo(12.75f, 7.08f)
                curveTo(13.57f, 7.2f, 14.32f, 7.5f, 14.95f, 8f)
                lineTo(12.75f, 10.19f)
                verticalLineTo(7.08f)
                moveTo(11.25f, 7.08f)
                verticalLineTo(10.19f)
                lineTo(9.05f, 8f)
                curveTo(9.68f, 7.5f, 10.43f, 7.2f, 11.25f, 7.08f)
                moveTo(8f, 9.05f)
                lineTo(10.19f, 11.25f)
                horizontalLineTo(7.08f)
                curveTo(7.2f, 10.43f, 7.5f, 9.68f, 8f, 9.05f)
                moveTo(7.08f, 12.75f)
                horizontalLineTo(10.19f)
                lineTo(8f, 14.95f)
                curveTo(7.5f, 14.32f, 7.2f, 13.57f, 7.08f, 12.75f)
                moveTo(11.25f, 16.92f)
                curveTo(10.43f, 16.8f, 9.68f, 16.5f, 9.05f, 16f)
                lineTo(11.25f, 13.81f)
                verticalLineTo(16.92f)
                moveTo(12f, 13f)
                curveTo(11.45f, 13f, 11f, 12.55f, 11f, 12f)
                reflectiveCurveTo(11.45f, 11f, 12f, 11f)
                reflectiveCurveTo(13f, 11.45f, 13f, 12f)
                reflectiveCurveTo(12.55f, 13f, 12f, 13f)
                moveTo(12.75f, 16.92f)
                verticalLineTo(13.81f)
                lineTo(14.95f, 16f)
                curveTo(14.32f, 16.5f, 13.57f, 16.8f, 12.75f, 16.92f)
                moveTo(16f, 14.95f)
                lineTo(13.81f, 12.75f)
                horizontalLineTo(16.92f)
                curveTo(16.8f, 13.57f, 16.5f, 14.32f, 16f, 14.95f)
                moveTo(13.81f, 11.25f)
                lineTo(16f, 9.05f)
                curveTo(16.5f, 9.69f, 16.8f, 10.44f, 16.92f, 11.25f)
                horizontalLineTo(13.81f)
                close()
            }
        }.build()

        return _HeatPump!!
    }

@Suppress("ObjectPropertyName")
private var _HeatPump: ImageVector? = null
