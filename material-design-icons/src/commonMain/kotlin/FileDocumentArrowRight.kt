package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocumentArrowRight: ImageVector
    get() {
        if (_FileDocumentArrowRight != null) {
            return _FileDocumentArrowRight!!
        }
        _FileDocumentArrowRight = ImageVector.Builder(
            name = "FileDocumentArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 19f)
                lineTo(20f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                lineTo(23f, 19f)
                moveTo(13f, 19f)
                curveTo(13f, 18.7f, 13f, 18.3f, 13.1f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(13.8f)
                curveTo(14.3f, 15.2f, 14.9f, 14.5f, 15.7f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(13.1f)
                curveTo(18.3f, 13f, 18.7f, 13f, 19f, 13f)
                reflectiveCurveTo(19.7f, 13f, 20f, 13.1f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(13.8f)
                curveTo(13.3f, 21.1f, 13f, 20.1f, 13f, 19f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                close()
            }
        }.build()

        return _FileDocumentArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocumentArrowRight: ImageVector? = null
