package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoOffOutline: ImageVector
    get() {
        if (_VideoOffOutline != null) {
            return _VideoOffOutline!!
        }
        _VideoOffOutline = ImageVector.Builder(
            name = "VideoOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.41f, 1.86f)
                lineTo(2f, 3.27f)
                lineTo(4.73f, 6f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 7f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                horizontalLineTo(16f)
                curveTo(16.21f, 18f, 16.39f, 17.92f, 16.55f, 17.82f)
                lineTo(19.73f, 21f)
                lineTo(21.14f, 19.59f)
                lineTo(12.28f, 10.73f)
                lineTo(3.41f, 1.86f)
                moveTo(5f, 16f)
                verticalLineTo(8f)
                horizontalLineTo(6.73f)
                lineTo(14.73f, 16f)
                horizontalLineTo(5f)
                moveTo(15f, 8f)
                verticalLineTo(10.61f)
                lineTo(21f, 16.61f)
                verticalLineTo(6.5f)
                lineTo(17f, 10.5f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 6f)
                horizontalLineTo(10.39f)
                lineTo(12.39f, 8f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _VideoOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOffOutline: ImageVector? = null
