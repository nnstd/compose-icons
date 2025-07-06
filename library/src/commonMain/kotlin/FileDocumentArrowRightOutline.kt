package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocumentArrowRightOutline: ImageVector
    get() {
        if (_FileDocumentArrowRightOutline != null) {
            return _FileDocumentArrowRightOutline!!
        }
        _FileDocumentArrowRightOutline = ImageVector.Builder(
            name = "FileDocumentArrowRightOutline",
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
                moveTo(13.8f, 22f)
                horizontalLineTo(6f)
                curveTo(4.9f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(13.1f)
                curveTo(19.7f, 13f, 19.3f, 13f, 19f, 13f)
                reflectiveCurveTo(18.3f, 13f, 18f, 13.1f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(13.1f)
                curveTo(13.2f, 20.7f, 13.5f, 21.4f, 13.8f, 22f)
                moveTo(8f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(13.8f)
                curveTo(15.9f, 13.9f, 15.8f, 13.9f, 15.7f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                moveTo(8f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _FileDocumentArrowRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocumentArrowRightOutline: ImageVector? = null
