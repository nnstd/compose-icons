package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderZip: ImageVector
    get() {
        if (_FolderZip != null) {
            return _FolderZip!!
        }
        _FolderZip = ImageVector.Builder(
            name = "FolderZip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                moveTo(18f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FolderZip!!
    }

@Suppress("ObjectPropertyName")
private var _FolderZip: ImageVector? = null
