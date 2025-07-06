package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileTreeOutline: ImageVector
    get() {
        if (_FileTreeOutline != null) {
            return _FileTreeOutline!!
        }
        _FileTreeOutline = ImageVector.Builder(
            name = "FileTreeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                moveTo(8f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                moveTo(10f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                moveTo(20f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                moveTo(22f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                moveTo(20f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                moveTo(22f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _FileTreeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileTreeOutline: ImageVector? = null
