package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileSend: ImageVector
    get() {
        if (_FileSend != null) {
            return _FileSend!!
        }
        _FileSend = ImageVector.Builder(
            name = "FileSend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(12.54f, 19.37f)
                verticalLineTo(17.37f)
                horizontalLineTo(8.54f)
                verticalLineTo(15.38f)
                horizontalLineTo(12.54f)
                verticalLineTo(13.38f)
                lineTo(15.54f, 16.38f)
                lineTo(12.54f, 19.37f)
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FileSend!!
    }

@Suppress("ObjectPropertyName")
private var _FileSend: ImageVector? = null
