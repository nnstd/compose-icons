package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FloorLamp: ImageVector
    get() {
        if (_FloorLamp != null) {
            return _FloorLamp!!
        }
        _FloorLamp = ImageVector.Builder(
            name = "FloorLamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                lineTo(17f, 9f)
                horizontalLineTo(7f)
                lineTo(9f, 2f)
                moveTo(11f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _FloorLamp!!
    }

@Suppress("ObjectPropertyName")
private var _FloorLamp: ImageVector? = null
