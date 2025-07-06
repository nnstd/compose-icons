package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarthArrowLeft: ImageVector
    get() {
        if (_EarthArrowLeft != null) {
            return _EarthArrowLeft!!
        }
        _EarthArrowLeft = ImageVector.Builder(
            name = "EarthArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                lineTo(14f, 18f)
                lineTo(17f, 15f)
                moveTo(12f, 18f)
                curveTo(12f, 15.8f, 13.2f, 13.9f, 15f, 12.8f)
                curveTo(14.9f, 12.3f, 14.5f, 12f, 14f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                curveTo(10.6f, 10f, 11f, 9.6f, 11f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                curveTo(14.1f, 7f, 15f, 6.1f, 15f, 5f)
                verticalLineTo(4.6f)
                curveTo(17.9f, 5.8f, 20f, 8.6f, 20f, 12f)
                verticalLineTo(12.3f)
                curveTo(20.7f, 12.5f, 21.3f, 12.9f, 21.9f, 13.4f)
                curveTo(22f, 13f, 22f, 12.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                curveTo(12.5f, 22f, 13f, 22f, 13.4f, 21.9f)
                curveTo(12.5f, 20.8f, 12f, 19.5f, 12f, 18f)
                moveTo(11f, 19.9f)
                curveTo(7f, 19.4f, 4f, 16.1f, 4f, 12f)
                curveTo(4f, 11.4f, 4.1f, 10.8f, 4.2f, 10.2f)
                lineTo(9f, 15f)
                verticalLineTo(16f)
                curveTo(9f, 17.1f, 9.9f, 18f, 11f, 18f)
                verticalLineTo(19.9f)
                close()
            }
        }.build()

        return _EarthArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _EarthArrowLeft: ImageVector? = null
