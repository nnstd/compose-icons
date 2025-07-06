package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocumentAlert: ImageVector
    get() {
        if (_FileDocumentAlert != null) {
            return _FileDocumentAlert!!
        }
        _FileDocumentAlert = ImageVector.Builder(
            name = "FileDocumentAlert",
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
                horizontalLineTo(20f)
                moveTo(11f, 9f)
                horizontalLineTo(16.5f)
                lineTo(11f, 3.5f)
                verticalLineTo(9f)
                moveTo(4f, 2f)
                horizontalLineTo(12f)
                lineTo(18f, 8f)
                verticalLineTo(20f)
                curveTo(18f, 21.11f, 17.11f, 22f, 16f, 22f)
                horizontalLineTo(4f)
                curveTo(2.89f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(4f)
                curveTo(2f, 2.89f, 2.89f, 2f, 4f, 2f)
                moveTo(13f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                moveTo(16f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _FileDocumentAlert!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocumentAlert: ImageVector? = null
