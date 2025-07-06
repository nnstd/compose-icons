package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageSizeSelectActual: ImageVector
    get() {
        if (_ImageSizeSelectActual != null) {
            return _ImageSizeSelectActual!!
        }
        _ImageSizeSelectActual = ImageVector.Builder(
            name = "ImageSizeSelectActual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveTo(2f, 3f, 1f, 4f, 1f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                horizontalLineTo(21f)
                curveTo(22f, 21f, 23f, 20f, 23f, 19f)
                verticalLineTo(5f)
                curveTo(23f, 4f, 22f, 3f, 21f, 3f)
                moveTo(5f, 17f)
                lineTo(8.5f, 12.5f)
                lineTo(11f, 15.5f)
                lineTo(14.5f, 11f)
                lineTo(19f, 17f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _ImageSizeSelectActual!!
    }

@Suppress("ObjectPropertyName")
private var _ImageSizeSelectActual: ImageVector? = null
