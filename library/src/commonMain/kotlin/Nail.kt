package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Nail: ImageVector
    get() {
        if (_Nail != null) {
            return _Nail!!
        }
        _Nail = ImageVector.Builder(
            name = "Nail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 5f)
                verticalLineTo(16f)
                lineTo(12f, 22f)
                lineTo(10.5f, 16f)
                verticalLineTo(5f)
                horizontalLineTo(13.5f)
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _Nail!!
    }

@Suppress("ObjectPropertyName")
private var _Nail: ImageVector? = null
