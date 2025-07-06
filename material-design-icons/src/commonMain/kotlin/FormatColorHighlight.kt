package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatColorHighlight: ImageVector
    get() {
        if (_FormatColorHighlight != null) {
            return _FormatColorHighlight!!
        }
        _FormatColorHighlight = ImageVector.Builder(
            name = "FormatColorHighlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 17f)
                lineTo(6.75f, 14.25f)
                lineTo(6.72f, 14.23f)
                curveTo(6.14f, 13.64f, 6.14f, 12.69f, 6.72f, 12.11f)
                lineTo(11.46f, 7.37f)
                lineTo(15.7f, 11.61f)
                lineTo(10.96f, 16.35f)
                curveTo(10.39f, 16.93f, 9.46f, 16.93f, 8.87f, 16.37f)
                lineTo(8.24f, 17f)
                horizontalLineTo(4f)
                moveTo(15.91f, 2.91f)
                curveTo(16.5f, 2.33f, 17.45f, 2.33f, 18.03f, 2.91f)
                lineTo(20.16f, 5.03f)
                curveTo(20.74f, 5.62f, 20.74f, 6.57f, 20.16f, 7.16f)
                lineTo(16.86f, 10.45f)
                lineTo(12.62f, 6.21f)
                lineTo(15.91f, 2.91f)
                close()
            }
        }.build()

        return _FormatColorHighlight!!
    }

@Suppress("ObjectPropertyName")
private var _FormatColorHighlight: ImageVector? = null
