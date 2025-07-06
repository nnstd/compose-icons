package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoImage: ImageVector
    get() {
        if (_VideoImage != null) {
            return _VideoImage!!
        }
        _VideoImage = ImageVector.Builder(
            name = "VideoImage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10.5f)
                lineTo(21f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(17f, 13.5f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 6f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                verticalLineTo(10.5f)
                moveTo(10.91f, 9.55f)
                lineTo(9.2f, 11.82f)
                lineTo(10.5f, 13.55f)
                lineTo(9.77f, 14.09f)
                lineTo(7.73f, 11.36f)
                lineTo(5f, 15f)
                horizontalLineTo(15f)
                lineTo(10.91f, 9.55f)
                close()
            }
        }.build()

        return _VideoImage!!
    }

@Suppress("ObjectPropertyName")
private var _VideoImage: ImageVector? = null
