package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileUndo: ImageVector
    get() {
        if (_FileUndo != null) {
            return _FileUndo!!
        }
        _FileUndo = ImageVector.Builder(
            name = "FileUndo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(18.5f)
                lineTo(13f, 3.5f)
                verticalLineTo(9f)
                moveTo(6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.89f, 4.89f, 2f, 6f, 2f)
                moveTo(12.16f, 14.31f)
                curveTo(10.6f, 14.31f, 9.19f, 14.89f, 8.11f, 15.83f)
                lineTo(6f, 13.72f)
                verticalLineTo(19f)
                horizontalLineTo(11.28f)
                lineTo(9.15f, 16.88f)
                curveTo(9.97f, 16.2f, 11f, 15.78f, 12.16f, 15.78f)
                curveTo(14.23f, 15.78f, 16f, 17.13f, 16.61f, 19f)
                lineTo(18f, 18.54f)
                curveTo(17.19f, 16.09f, 14.88f, 14.31f, 12.16f, 14.31f)
                close()
            }
        }.build()

        return _FileUndo!!
    }

@Suppress("ObjectPropertyName")
private var _FileUndo: ImageVector? = null
