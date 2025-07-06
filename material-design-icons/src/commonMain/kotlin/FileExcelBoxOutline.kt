package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileExcelBoxOutline: ImageVector
    get() {
        if (_FileExcelBoxOutline != null) {
            return _FileExcelBoxOutline!!
        }
        _FileExcelBoxOutline = ImageVector.Builder(
            name = "FileExcelBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(5f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(13f, 12f)
                lineTo(16.2f, 17f)
                horizontalLineTo(14.2f)
                lineTo(12f, 13.2f)
                lineTo(9.8f, 17f)
                horizontalLineTo(7.8f)
                lineTo(11f, 12f)
                lineTo(7.8f, 7f)
                horizontalLineTo(9.8f)
                lineTo(12f, 10.8f)
                lineTo(14.2f, 7f)
                horizontalLineTo(16.2f)
                lineTo(13f, 12f)
                close()
            }
        }.build()

        return _FileExcelBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileExcelBoxOutline: ImageVector? = null
