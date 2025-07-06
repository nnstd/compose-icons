package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopRightBoldBoxOutline: ImageVector
    get() {
        if (_ArrowTopRightBoldBoxOutline != null) {
            return _ArrowTopRightBoldBoxOutline!!
        }
        _ArrowTopRightBoldBoxOutline = ImageVector.Builder(
            name = "ArrowTopRightBoldBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                verticalLineTo(15.1f)
                lineTo(13.9f, 13f)
                lineTo(9.8f, 16.9f)
                lineTo(7f, 14f)
                lineTo(11.1f, 10.1f)
                lineTo(8.9f, 8f)
                horizontalLineTo(16f)
                moveTo(3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                moveTo(5f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ArrowTopRightBoldBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopRightBoldBoxOutline: ImageVector? = null
