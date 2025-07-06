package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextRecognition: ImageVector
    get() {
        if (_TextRecognition != null) {
            return _TextRecognition!!
        }
        _TextRecognition = ImageVector.Builder(
            name = "TextRecognition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                moveTo(22f, 20f)
                curveTo(22f, 21.11f, 21.11f, 22f, 20f, 22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                moveTo(4f, 22f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                moveTo(20f, 2f)
                curveTo(21.11f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                moveTo(9f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _TextRecognition!!
    }

@Suppress("ObjectPropertyName")
private var _TextRecognition: ImageVector? = null
