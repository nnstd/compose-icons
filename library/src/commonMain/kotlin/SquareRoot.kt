package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareRoot: ImageVector
    get() {
        if (_SquareRoot != null) {
            return _SquareRoot!!
        }
        _SquareRoot = ImageVector.Builder(
            name = "SquareRoot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.76f, 16.83f)
                lineTo(14.59f, 14f)
                lineTo(11.76f, 11.17f)
                lineTo(13.17f, 9.76f)
                lineTo(16f, 12.59f)
                lineTo(18.83f, 9.76f)
                lineTo(20.24f, 11.17f)
                lineTo(17.41f, 14f)
                lineTo(20.24f, 16.83f)
                lineTo(18.83f, 18.24f)
                lineTo(16f, 15.41f)
                lineTo(13.17f, 18.24f)
                lineTo(11.76f, 16.83f)
                moveTo(2f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                lineTo(7.29f, 16.4f)
                lineTo(10f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(11.55f)
                lineTo(8.68f, 19f)
                horizontalLineTo(6.22f)
                lineTo(3.68f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _SquareRoot!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRoot: ImageVector? = null
