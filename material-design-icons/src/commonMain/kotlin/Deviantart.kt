package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Deviantart: ImageVector
    get() {
        if (_Deviantart != null) {
            return _Deviantart!!
        }
        _Deviantart = ImageVector.Builder(
            name = "Deviantart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 6f)
                horizontalLineTo(12f)
                lineTo(14f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                lineTo(14.5f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                lineTo(10f, 22f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                lineTo(9.5f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _Deviantart!!
    }

@Suppress("ObjectPropertyName")
private var _Deviantart: ImageVector? = null
