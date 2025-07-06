package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileImportOutline: ImageVector
    get() {
        if (_FileImportOutline != null) {
            return _FileImportOutline!!
        }
        _FileImportOutline = ImageVector.Builder(
            name = "FileImportOutline",
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
                moveTo(15f, 11.93f)
                verticalLineTo(19f)
                horizontalLineTo(7.93f)
                lineTo(10.05f, 16.88f)
                lineTo(7.22f, 14.05f)
                lineTo(10.05f, 11.22f)
                lineTo(12.88f, 14.05f)
                lineTo(15f, 11.93f)
                close()
            }
        }.build()

        return _FileImportOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileImportOutline: ImageVector? = null
