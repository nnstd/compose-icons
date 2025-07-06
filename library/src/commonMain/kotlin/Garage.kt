package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Garage: ImageVector
    get() {
        if (_Garage != null) {
            return _Garage!!
        }
        _Garage = ImageVector.Builder(
            name = "Garage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 20f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                lineTo(12f, 5f)
                lineTo(19f, 9f)
                verticalLineTo(20f)
                moveTo(8f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                moveTo(8f, 15f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                moveTo(16f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Garage!!
    }

@Suppress("ObjectPropertyName")
private var _Garage: ImageVector? = null
