package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseNetwork: ImageVector
    get() {
        if (_CloseNetwork != null) {
            return _CloseNetwork!!
        }
        _CloseNetwork = ImageVector.Builder(
            name = "CloseNetwork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.59f, 6f)
                lineTo(12f, 8.59f)
                lineTo(9.41f, 6f)
                lineTo(8f, 7.41f)
                lineTo(10.59f, 10f)
                lineTo(8f, 12.59f)
                lineTo(9.41f, 14f)
                lineTo(12f, 11.41f)
                lineTo(14.59f, 14f)
                lineTo(16f, 12.59f)
                lineTo(13.41f, 10f)
                lineTo(16f, 7.41f)
                lineTo(14.59f, 6f)
                moveTo(17f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 23f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                curveTo(5.89f, 17f, 5f, 16.1f, 5f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _CloseNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _CloseNetwork: ImageVector? = null
