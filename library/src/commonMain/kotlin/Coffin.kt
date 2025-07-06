package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Coffin: ImageVector
    get() {
        if (_Coffin != null) {
            return _Coffin!!
        }
        _Coffin = ImageVector.Builder(
            name = "Coffin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 22f)
                lineTo(5f, 8f)
                lineTo(8f, 2f)
                horizontalLineTo(16f)
                lineTo(19f, 8f)
                lineTo(16f, 22f)
                horizontalLineTo(8f)
                moveTo(11f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _Coffin!!
    }

@Suppress("ObjectPropertyName")
private var _Coffin: ImageVector? = null
