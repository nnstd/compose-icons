package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileMultiple: ImageVector
    get() {
        if (_FileMultiple != null) {
            return _FileMultiple!!
        }
        _FileMultiple = ImageVector.Builder(
            name = "FileMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7f)
                horizontalLineTo(20.5f)
                lineTo(15f, 1.5f)
                verticalLineTo(7f)
                moveTo(8f, 0f)
                horizontalLineTo(16f)
                lineTo(22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(8f)
                curveTo(6.89f, 20f, 6f, 19.1f, 6f, 18f)
                verticalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                moveTo(4f, 4f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(24f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 22f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _FileMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _FileMultiple: ImageVector? = null
