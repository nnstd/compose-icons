package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageSizeSelectSmall: ImageVector
    get() {
        if (_ImageSizeSelectSmall != null) {
            return _ImageSizeSelectSmall!!
        }
        _ImageSizeSelectSmall = ImageVector.Builder(
            name = "ImageSizeSelectSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                moveTo(23f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                moveTo(23f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                curveTo(22f, 21f, 23f, 20f, 23f, 19f)
                moveTo(15f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                moveTo(23f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                moveTo(21f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(23f)
                curveTo(23f, 4f, 22f, 3f, 21f, 3f)
                moveTo(3f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                moveTo(3f, 7f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(15f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                moveTo(19f, 19f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(3f, 3f)
                curveTo(2f, 3f, 1f, 4f, 1f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(3f, 11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(11f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                moveTo(7f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _ImageSizeSelectSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ImageSizeSelectSmall: ImageVector? = null
