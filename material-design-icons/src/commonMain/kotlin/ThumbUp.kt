package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThumbUp: ImageVector
    get() {
        if (_ThumbUp != null) {
            return _ThumbUp!!
        }
        _ThumbUp = ImageVector.Builder(
            name = "ThumbUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 10f)
                curveTo(23f, 8.89f, 22.1f, 8f, 21f, 8f)
                horizontalLineTo(14.68f)
                lineTo(15.64f, 3.43f)
                curveTo(15.66f, 3.33f, 15.67f, 3.22f, 15.67f, 3.11f)
                curveTo(15.67f, 2.7f, 15.5f, 2.32f, 15.23f, 2.05f)
                lineTo(14.17f, 1f)
                lineTo(7.59f, 7.58f)
                curveTo(7.22f, 7.95f, 7f, 8.45f, 7f, 9f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 21f)
                horizontalLineTo(18f)
                curveTo(18.83f, 21f, 19.54f, 20.5f, 19.84f, 19.78f)
                lineTo(22.86f, 12.73f)
                curveTo(22.95f, 12.5f, 23f, 12.26f, 23f, 12f)
                verticalLineTo(10f)
                moveTo(1f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _ThumbUp!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbUp: ImageVector? = null
