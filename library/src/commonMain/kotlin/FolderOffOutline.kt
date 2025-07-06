package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderOffOutline: ImageVector
    get() {
        if (_FolderOffOutline != null) {
            return _FolderOffOutline!!
        }
        _FolderOffOutline = ImageVector.Builder(
            name = "FolderOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(2.64f, 4.53f)
                curveTo(2.25f, 4.9f, 2f, 5.42f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(4f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(6.11f)
                lineTo(16.11f, 18f)
                horizontalLineTo(4f)
                moveTo(11.2f, 8f)
                lineTo(7.2f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.1f, 6f, 22f, 6.89f, 22f, 8f)
                verticalLineTo(18f)
                curveTo(22f, 18.24f, 21.96f, 18.47f, 21.88f, 18.68f)
                lineTo(20f, 16.8f)
                verticalLineTo(8f)
                horizontalLineTo(11.2f)
                close()
            }
        }.build()

        return _FolderOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOffOutline: ImageVector? = null
