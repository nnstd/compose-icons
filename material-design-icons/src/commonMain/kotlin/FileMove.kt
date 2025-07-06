package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileMove: ImageVector
    get() {
        if (_FileMove != null) {
            return _FileMove!!
        }
        _FileMove = ImageVector.Builder(
            name = "FileMove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                lineTo(23f, 18.5f)
                lineTo(18f, 23f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(13f, 9f)
                horizontalLineTo(18.5f)
                lineTo(13f, 3.5f)
                verticalLineTo(9f)
                moveTo(6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(12.34f)
                curveTo(19.37f, 12.12f, 18.7f, 12f, 18f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                curveTo(12f, 19.54f, 12.58f, 20.94f, 13.53f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                close()
            }
        }.build()

        return _FileMove!!
    }

@Suppress("ObjectPropertyName")
private var _FileMove: ImageVector? = null
