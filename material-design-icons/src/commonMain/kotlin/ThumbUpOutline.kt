package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThumbUpOutline: ImageVector
    get() {
        if (_ThumbUpOutline != null) {
            return _ThumbUpOutline!!
        }
        _ThumbUpOutline = ImageVector.Builder(
            name = "ThumbUpOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                moveTo(9f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 19f)
                verticalLineTo(9f)
                curveTo(7f, 8.45f, 7.22f, 7.95f, 7.59f, 7.59f)
                lineTo(14.17f, 1f)
                lineTo(15.23f, 2.06f)
                curveTo(15.5f, 2.33f, 15.67f, 2.7f, 15.67f, 3.11f)
                lineTo(15.64f, 3.43f)
                lineTo(14.69f, 8f)
                horizontalLineTo(21f)
                curveTo(22.11f, 8f, 23f, 8.9f, 23f, 10f)
                verticalLineTo(12f)
                curveTo(23f, 12.26f, 22.95f, 12.5f, 22.86f, 12.73f)
                lineTo(19.84f, 19.78f)
                curveTo(19.54f, 20.5f, 18.83f, 21f, 18f, 21f)
                horizontalLineTo(9f)
                moveTo(9f, 19f)
                horizontalLineTo(18.03f)
                lineTo(21f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(12.21f)
                lineTo(13.34f, 4.68f)
                lineTo(9f, 9.03f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ThumbUpOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbUpOutline: ImageVector? = null
