package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Mine: ImageVector
    get() {
        if (_Mine != null) {
            return _Mine!!
        }
        _Mine = ImageVector.Builder(
            name = "Mine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(19.93f)
                curveTo(19.75f, 9.58f, 19.19f, 8.23f, 18.31f, 7.1f)
                lineTo(20.5f, 4.93f)
                lineTo(19.07f, 3.5f)
                lineTo(16.9f, 5.69f)
                curveTo(15.77f, 4.81f, 14.42f, 4.25f, 13f, 4.07f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                verticalLineTo(4.07f)
                curveTo(9.58f, 4.25f, 8.23f, 4.81f, 7.1f, 5.69f)
                lineTo(4.93f, 3.5f)
                lineTo(3.5f, 4.93f)
                lineTo(5.69f, 7.1f)
                curveTo(4.81f, 8.23f, 4.25f, 9.58f, 4.07f, 11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(4.07f)
                curveTo(4.25f, 14.42f, 4.81f, 15.77f, 5.69f, 16.9f)
                lineTo(3.5f, 19.07f)
                lineTo(4.93f, 20.5f)
                lineTo(7.1f, 18.31f)
                curveTo(8.23f, 19.19f, 9.58f, 19.75f, 11f, 19.93f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(19.93f)
                curveTo(14.42f, 19.75f, 15.77f, 19.19f, 16.9f, 18.31f)
                lineTo(19.07f, 20.5f)
                lineTo(20.5f, 19.07f)
                lineTo(18.31f, 16.9f)
                curveTo(19.19f, 15.77f, 19.75f, 14.42f, 19.93f, 13f)
                horizontalLineTo(23f)
                moveTo(12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                horizontalLineTo(6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _Mine!!
    }

@Suppress("ObjectPropertyName")
private var _Mine: ImageVector? = null
