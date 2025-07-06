package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocumentMultipleOutline: ImageVector
    get() {
        if (_FileDocumentMultipleOutline != null) {
            return _FileDocumentMultipleOutline!!
        }
        _FileDocumentMultipleOutline = ImageVector.Builder(
            name = "FileDocumentMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 0f)
                horizontalLineTo(8f)
                curveTo(6.9f, 0f, 6f, 0.9f, 6f, 2f)
                verticalLineTo(18f)
                curveTo(6f, 19.1f, 6.9f, 20f, 8f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(6f)
                lineTo(16f, 0f)
                moveTo(20f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(4f, 4f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(24f)
                horizontalLineTo(4f)
                curveTo(2.9f, 24f, 2f, 23.1f, 2f, 22f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                moveTo(10f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                moveTo(10f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _FileDocumentMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocumentMultipleOutline: ImageVector? = null
