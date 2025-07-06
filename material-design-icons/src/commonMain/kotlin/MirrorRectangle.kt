package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MirrorRectangle: ImageVector
    get() {
        if (_MirrorRectangle != null) {
            return _MirrorRectangle!!
        }
        _MirrorRectangle = ImageVector.Builder(
            name = "MirrorRectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.29f, 10.28f)
                lineTo(11.53f, 7.03f)
                lineTo(12.59f, 8.09f)
                lineTo(9.35f, 11.34f)
                lineTo(8.29f, 10.28f)
                moveTo(8.7f, 14.61f)
                lineTo(14.36f, 8.95f)
                lineTo(15.42f, 10f)
                lineTo(9.76f, 15.67f)
                lineTo(8.7f, 14.61f)
                moveTo(18f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                moveTo(20f, 1f)
                horizontalLineTo(4f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(1f)
                close()
            }
        }.build()

        return _MirrorRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _MirrorRectangle: ImageVector? = null
