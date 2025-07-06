package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ServerOff: ImageVector
    get() {
        if (_ServerOff != null) {
            return _ServerOff!!
        }
        _ServerOff = ImageVector.Builder(
            name = "ServerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 1f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 2f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 7f)
                horizontalLineTo(8.82f)
                lineTo(6.82f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(3.18f)
                lineTo(3.21f, 1.39f)
                curveTo(3.39f, 1.15f, 3.68f, 1f, 4f, 1f)
                moveTo(22f, 22.72f)
                lineTo(20.73f, 24f)
                lineTo(19.73f, 23f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 22f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 17f)
                horizontalLineTo(13.73f)
                lineTo(11.73f, 15f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9f)
                horizontalLineTo(5.73f)
                lineTo(3.68f, 6.95f)
                curveTo(3.38f, 6.85f, 3.15f, 6.62f, 3.05f, 6.32f)
                lineTo(1f, 4.27f)
                lineTo(2.28f, 3f)
                lineTo(22f, 22.72f)
                moveTo(20f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 15f)
                horizontalLineTo(16.82f)
                lineTo(10.82f, 9f)
                horizontalLineTo(20f)
                moveTo(20f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18f)
                verticalLineTo(19.18f)
                lineTo(18.82f, 17f)
                horizontalLineTo(20f)
                moveTo(9f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                moveTo(9f, 13f)
                horizontalLineTo(9.73f)
                lineTo(9f, 12.27f)
                verticalLineTo(13f)
                moveTo(9f, 21f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                moveTo(5f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                moveTo(5f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _ServerOff!!
    }

@Suppress("ObjectPropertyName")
private var _ServerOff: ImageVector? = null
