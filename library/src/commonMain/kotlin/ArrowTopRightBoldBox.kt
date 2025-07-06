package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopRightBoldBox: ImageVector
    get() {
        if (_ArrowTopRightBoldBox != null) {
            return _ArrowTopRightBoldBox!!
        }
        _ArrowTopRightBoldBox = ImageVector.Builder(
            name = "ArrowTopRightBoldBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(8.7f, 8f)
                lineTo(10.8f, 10.1f)
                lineTo(7f, 14f)
                lineTo(9.8f, 16.8f)
                lineTo(13.6f, 12.9f)
                lineTo(15.7f, 15f)
                verticalLineTo(8f)
                horizontalLineTo(8.7f)
                close()
            }
        }.build()

        return _ArrowTopRightBoldBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopRightBoldBox: ImageVector? = null
