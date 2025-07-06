package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileAlertOutline: ImageVector
    get() {
        if (_FileAlertOutline != null) {
            return _FileAlertOutline!!
        }
        _FileAlertOutline = ImageVector.Builder(
            name = "FileAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                moveTo(20f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                moveTo(4f, 2f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.89f, 22f, 4f, 22f)
                horizontalLineTo(16f)
                curveTo(17.11f, 22f, 18f, 21.11f, 18f, 20f)
                verticalLineTo(8f)
                lineTo(12f, 2f)
                moveTo(4f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _FileAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileAlertOutline: ImageVector? = null
