package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ocr: ImageVector
    get() {
        if (_Ocr != null) {
            return _Ocr!!
        }
        _Ocr = ImageVector.Builder(
            name = "Ocr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                curveTo(10.89f, 17f, 10f, 16.11f, 10f, 15f)
                verticalLineTo(9f)
                curveTo(10f, 7.89f, 10.89f, 7f, 12f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                moveTo(14f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                moveTo(14f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                moveTo(14f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                moveTo(5f, 7f)
                horizontalLineTo(7f)
                curveTo(8.11f, 7f, 9f, 7.89f, 9f, 9f)
                verticalLineTo(15f)
                curveTo(9f, 16.11f, 8.11f, 17f, 7f, 17f)
                horizontalLineTo(5f)
                curveTo(3.89f, 17f, 3f, 16.11f, 3f, 15f)
                verticalLineTo(9f)
                curveTo(3f, 7.89f, 3.89f, 7f, 5f, 7f)
                moveTo(17f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(23f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                moveTo(5f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(19f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _Ocr!!
    }

@Suppress("ObjectPropertyName")
private var _Ocr: ImageVector? = null
