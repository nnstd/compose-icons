package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CamcorderOff: ImageVector
    get() {
        if (_CamcorderOff != null) {
            return _CamcorderOff!!
        }
        _CamcorderOff = ImageVector.Builder(
            name = "CamcorderOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(9.4f, 8.8f)
                lineTo(2.4f, 1.8f)
                lineTo(1.1f, 3f)
                lineTo(2.7f, 4.6f)
                curveTo(2.2f, 5.3f, 2f, 6.1f, 2f, 7f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(10f)
                curveTo(11.1f, 22f, 12f, 21.1f, 12f, 20f)
                verticalLineTo(13.9f)
                lineTo(13f, 14.9f)
                verticalLineTo(16f)
                horizontalLineTo(14.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(5f, 20f)
                curveTo(4.5f, 20f, 4f, 19.5f, 4f, 19f)
                reflectiveCurveTo(4.5f, 18f, 5f, 18f)
                reflectiveCurveTo(6f, 18.5f, 6f, 19f)
                reflectiveCurveTo(5.5f, 20f, 5f, 20f)
                moveTo(7f, 10f)
                curveTo(5.3f, 10f, 4f, 8.7f, 4f, 7f)
                curveTo(4f, 6.7f, 4.1f, 6.4f, 4.2f, 6.1f)
                lineTo(8f, 9.9f)
                curveTo(7.6f, 9.9f, 7.3f, 10f, 7f, 10f)
                moveTo(7.2f, 4f)
                lineTo(5.5f, 2.3f)
                curveTo(6f, 2.1f, 6.5f, 2f, 7f, 2f)
                curveTo(9.8f, 2f, 12f, 4.2f, 12f, 7f)
                verticalLineTo(8.8f)
                lineTo(10f, 6.8f)
                curveTo(9.9f, 5.3f, 8.7f, 4.1f, 7.2f, 4f)
                moveTo(20f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                curveTo(21.1f, 7f, 22f, 7.9f, 22f, 9f)
                verticalLineTo(14f)
                curveTo(22f, 15.1f, 21.1f, 16f, 20f, 16f)
                horizontalLineTo(19.2f)
                lineTo(17.2f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _CamcorderOff!!
    }

@Suppress("ObjectPropertyName")
private var _CamcorderOff: ImageVector? = null
