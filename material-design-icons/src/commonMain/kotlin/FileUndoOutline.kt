package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileUndoOutline: ImageVector
    get() {
        if (_FileUndoOutline != null) {
            return _FileUndoOutline!!
        }
        _FileUndoOutline = ImageVector.Builder(
            name = "FileUndoOutline",
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
                moveTo(17f, 17.61f)
                lineTo(15.84f, 18f)
                curveTo(15.33f, 16.44f, 13.86f, 15.31f, 12.13f, 15.31f)
                curveTo(11.17f, 15.31f, 10.31f, 15.66f, 9.63f, 16.23f)
                lineTo(11.4f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(13.6f)
                lineTo(8.76f, 15.36f)
                curveTo(9.66f, 14.57f, 10.83f, 14.09f, 12.13f, 14.09f)
                curveTo(14.4f, 14.09f, 16.33f, 15.57f, 17f, 17.61f)
                close()
            }
        }.build()

        return _FileUndoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileUndoOutline: ImageVector? = null
