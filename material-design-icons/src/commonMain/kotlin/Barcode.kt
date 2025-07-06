package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Barcode: ImageVector
    get() {
        if (_Barcode != null) {
            return _Barcode!!
        }
        _Barcode = ImageVector.Builder(
            name = "Barcode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                moveTo(5f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                moveTo(7f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                moveTo(11f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                moveTo(14f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                moveTo(17f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                moveTo(21f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _Barcode!!
    }

@Suppress("ObjectPropertyName")
private var _Barcode: ImageVector? = null
