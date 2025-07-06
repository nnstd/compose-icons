package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraOff: ImageVector
    get() {
        if (_CameraOff != null) {
            return _CameraOff!!
        }
        _CameraOff = ImageVector.Builder(
            name = "CameraOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.2f, 4.47f)
                lineTo(2.5f, 3.2f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(16.73f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.78f, 2.04f, 5.57f, 2.1f, 5.37f)
                lineTo(1.2f, 4.47f)
                moveTo(7f, 4f)
                lineTo(9f, 2f)
                horizontalLineTo(15f)
                lineTo(17f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 18.6f, 21.74f, 19.13f, 21.32f, 19.5f)
                lineTo(16.33f, 14.5f)
                curveTo(16.76f, 13.77f, 17f, 12.91f, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                curveTo(11.09f, 7f, 10.23f, 7.24f, 9.5f, 7.67f)
                lineTo(5.82f, 4f)
                horizontalLineTo(7f)
                moveTo(7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                curveTo(12.5f, 17f, 13.03f, 16.92f, 13.5f, 16.77f)
                lineTo(11.72f, 15f)
                curveTo(10.29f, 14.85f, 9.15f, 13.71f, 9f, 12.28f)
                lineTo(7.23f, 10.5f)
                curveTo(7.08f, 10.97f, 7f, 11.5f, 7f, 12f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                curveTo(15f, 12.35f, 14.94f, 12.69f, 14.83f, 13f)
                lineTo(11f, 9.17f)
                curveTo(11.31f, 9.06f, 11.65f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _CameraOff!!
    }

@Suppress("ObjectPropertyName")
private var _CameraOff: ImageVector? = null
