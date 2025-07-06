package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileSendOutline: ImageVector
    get() {
        if (_FileSendOutline != null) {
            return _FileSendOutline!!
        }
        _FileSendOutline = ImageVector.Builder(
            name = "FileSendOutline",
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
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(12.54f, 18.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(8.54f)
                verticalLineTo(14.5f)
                horizontalLineTo(12.54f)
                verticalLineTo(12.5f)
                lineTo(15.54f, 15.5f)
                lineTo(12.54f, 18.5f)
                close()
            }
        }.build()

        return _FileSendOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileSendOutline: ImageVector? = null
