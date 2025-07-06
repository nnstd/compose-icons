package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ControllerOff: ImageVector
    get() {
        if (_ControllerOff != null) {
            return _ControllerOff!!
        }
        _ControllerOff = ImageVector.Builder(
            name = "ControllerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(12.73f, 16f)
                horizontalLineTo(7.97f)
                lineTo(5f, 19f)
                curveTo(4.67f, 19.3f, 4.23f, 19.5f, 3.75f, 19.5f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17.75f)
                verticalLineTo(17.5f)
                lineTo(3f, 10.12f)
                curveTo(3.1f, 9.09f, 3.53f, 8.17f, 4.19f, 7.46f)
                lineTo(2f, 5.27f)
                moveTo(5f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(11.27f)
                lineTo(6.73f, 10f)
                horizontalLineTo(5f)
                moveTo(16.5f, 6f)
                curveTo(18.86f, 6f, 20.79f, 7.81f, 21f, 10.12f)
                lineTo(22f, 17.5f)
                verticalLineTo(17.75f)
                curveTo(22f, 18.41f, 21.64f, 19f, 21.1f, 19.28f)
                lineTo(7.82f, 6f)
                horizontalLineTo(16.5f)
                moveTo(16.5f, 8f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.75f, 8.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 9.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 8.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 8f)
                moveTo(14.75f, 9.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 10.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.75f, 11.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 10.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.75f, 9.75f)
                moveTo(18.25f, 9.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 10.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.25f, 11.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.25f, 9.75f)
                moveTo(16.5f, 11.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.75f, 12.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 13f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 12.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 11.5f)
                close()
            }
        }.build()

        return _ControllerOff!!
    }

@Suppress("ObjectPropertyName")
private var _ControllerOff: ImageVector? = null
