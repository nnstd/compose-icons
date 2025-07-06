package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightTop: ImageVector
    get() {
        if (_ArrowRightTop != null) {
            return _ArrowRightTop!!
        }
        _ArrowRightTop = ImageVector.Builder(
            name = "ArrowRightTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                lineTo(14.5f, 13.5f)
                lineTo(13.09f, 12.09f)
                lineTo(16.17f, 9f)
                horizontalLineTo(10.5f)
                curveTo(8f, 9f, 6f, 11f, 6f, 13.5f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(13.5f)
                curveTo(4f, 9.91f, 6.91f, 7f, 10.5f, 7f)
                horizontalLineTo(16.17f)
                lineTo(13.08f, 3.91f)
                lineTo(14.5f, 2.5f)
                lineTo(20f, 8f)
                close()
            }
        }.build()

        return _ArrowRightTop!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightTop: ImageVector? = null
