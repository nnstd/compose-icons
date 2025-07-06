package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Barn: ImageVector
    get() {
        if (_Barn != null) {
            return _Barn!!
        }
        _Barn = ImageVector.Builder(
            name = "Barn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(3f, 8.2f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                lineTo(11.9f, 18f)
                lineTo(15f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(8.2f)
                lineTo(12f, 3f)
                moveTo(7.9f, 20f)
                verticalLineTo(14f)
                lineTo(10.9f, 17f)
                lineTo(7.9f, 20f)
                moveTo(8.9f, 13f)
                horizontalLineTo(14.9f)
                lineTo(11.9f, 16f)
                lineTo(8.9f, 13f)
                moveTo(15.9f, 20f)
                lineTo(12.9f, 17f)
                lineTo(15.9f, 14f)
                verticalLineTo(20f)
                moveTo(15f, 11f)
                horizontalLineTo(8.8f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _Barn!!
    }

@Suppress("ObjectPropertyName")
private var _Barn: ImageVector? = null
