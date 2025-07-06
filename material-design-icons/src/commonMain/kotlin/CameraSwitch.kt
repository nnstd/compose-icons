package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraSwitch: ImageVector
    get() {
        if (_CameraSwitch != null) {
            return _CameraSwitch!!
        }
        _CameraSwitch = ImageVector.Builder(
            name = "CameraSwitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15.5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(15.5f)
                lineTo(5.5f, 12f)
                lineTo(9f, 8.5f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(8.5f)
                lineTo(18.5f, 12f)
                moveTo(20f, 4f)
                horizontalLineTo(16.83f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7.17f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                close()
            }
        }.build()

        return _CameraSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _CameraSwitch: ImageVector? = null
