package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileExportOutline: ImageVector
    get() {
        if (_FileExportOutline != null) {
            return _FileExportOutline!!
        }
        _FileExportOutline = ImageVector.Builder(
            name = "FileExportOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(16f, 11f)
                verticalLineTo(18.1f)
                lineTo(13.9f, 16f)
                lineTo(11.1f, 18.8f)
                lineTo(8.3f, 16f)
                lineTo(11.1f, 13.2f)
                lineTo(8.9f, 11f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _FileExportOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileExportOutline: ImageVector? = null
