package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileStar: ImageVector
    get() {
        if (_FileStar != null) {
            return _FileStar!!
        }
        _FileStar = ImageVector.Builder(
            name = "FileStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(14.5f, 18.9f)
                lineTo(12f, 17.5f)
                lineTo(9.5f, 19f)
                lineTo(10.2f, 16.2f)
                lineTo(8f, 14.3f)
                lineTo(10.9f, 14.1f)
                lineTo(12f, 11.4f)
                lineTo(13.1f, 14f)
                lineTo(16f, 14.2f)
                lineTo(13.8f, 16.1f)
                lineTo(14.5f, 18.9f)
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FileStar!!
    }

@Suppress("ObjectPropertyName")
private var _FileStar: ImageVector? = null
