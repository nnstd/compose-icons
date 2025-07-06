package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocumentRemoveOutline: ImageVector
    get() {
        if (_FileDocumentRemoveOutline != null) {
            return _FileDocumentRemoveOutline!!
        }
        _FileDocumentRemoveOutline = ImageVector.Builder(
            name = "FileDocumentRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                lineTo(21.12f, 15.46f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.46f)
                lineTo(15.46f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.46f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                moveTo(6f, 2f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(13.81f)
                curveTo(13.45f, 21.38f, 13.2f, 20.7f, 13.08f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(13.08f)
                curveTo(18.33f, 13.03f, 18.67f, 13f, 19f, 13f)
                curveTo(19.34f, 13f, 19.67f, 13.03f, 20f, 13.08f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(8f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                moveTo(8f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _FileDocumentRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocumentRemoveOutline: ImageVector? = null
