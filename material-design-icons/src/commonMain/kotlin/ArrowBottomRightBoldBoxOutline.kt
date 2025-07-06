package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomRightBoldBoxOutline: ImageVector
    get() {
        if (_ArrowBottomRightBoldBoxOutline != null) {
            return _ArrowBottomRightBoldBoxOutline!!
        }
        _ArrowBottomRightBoldBoxOutline = ImageVector.Builder(
            name = "ArrowBottomRightBoldBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 16f)
                horizontalLineTo(8.9f)
                lineTo(11f, 13.9f)
                lineTo(7f, 10f)
                lineTo(9.8f, 7.2f)
                lineTo(13.9f, 11.1f)
                lineTo(16f, 8.9f)
                verticalLineTo(16f)
                moveTo(5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                moveTo(5f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ArrowBottomRightBoldBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomRightBoldBoxOutline: ImageVector? = null
