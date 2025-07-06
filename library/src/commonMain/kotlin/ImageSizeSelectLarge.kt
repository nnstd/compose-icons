package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageSizeSelectLarge: ImageVector
    get() {
        if (_ImageSizeSelectLarge != null) {
            return _ImageSizeSelectLarge!!
        }
        _ImageSizeSelectLarge = ImageVector.Builder(
            name = "ImageSizeSelectLarge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                moveTo(21f, 11f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                moveTo(23f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                curveTo(22f, 21f, 23f, 20f, 23f, 19f)
                moveTo(13f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                moveTo(21f, 7f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                moveTo(21f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(23f)
                curveTo(23f, 4f, 22f, 3f, 21f, 3f)
                moveTo(1f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                moveTo(17f, 3f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                moveTo(17f, 19f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                moveTo(3f, 3f)
                curveTo(2f, 3f, 1f, 4f, 1f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(9f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                moveTo(5f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                moveTo(1f, 11f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                moveTo(3f, 19f)
                lineTo(5.5f, 15.79f)
                lineTo(7.29f, 17.94f)
                lineTo(9.79f, 14.72f)
                lineTo(13f, 19f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _ImageSizeSelectLarge!!
    }

@Suppress("ObjectPropertyName")
private var _ImageSizeSelectLarge: ImageVector? = null
