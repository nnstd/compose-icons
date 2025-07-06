package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocumentMultiple: ImageVector
    get() {
        if (_FileDocumentMultiple != null) {
            return _FileDocumentMultiple!!
        }
        _FileDocumentMultiple = ImageVector.Builder(
            name = "FileDocumentMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(24f)
                horizontalLineTo(4f)
                curveTo(2.9f, 24f, 2f, 23.1f, 2f, 22f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                moveTo(15f, 7f)
                horizontalLineTo(20.5f)
                lineTo(15f, 1.5f)
                verticalLineTo(7f)
                moveTo(8f, 0f)
                horizontalLineTo(16f)
                lineTo(22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 19.11f, 21.11f, 20f, 20f, 20f)
                horizontalLineTo(8f)
                curveTo(6.89f, 20f, 6f, 19.1f, 6f, 18f)
                verticalLineTo(2f)
                curveTo(6f, 0.89f, 6.89f, 0f, 8f, 0f)
                moveTo(17f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                moveTo(20f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _FileDocumentMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocumentMultiple: ImageVector? = null
