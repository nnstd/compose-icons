package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FloorLampTorchiere: ImageVector
    get() {
        if (_FloorLampTorchiere != null) {
            return _FloorLampTorchiere!!
        }
        _FloorLampTorchiere = ImageVector.Builder(
            name = "FloorLampTorchiere",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                lineTo(10f, 9f)
                horizontalLineTo(14f)
                lineTo(17f, 2f)
                horizontalLineTo(7f)
                moveTo(13f, 20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _FloorLampTorchiere!!
    }

@Suppress("ObjectPropertyName")
private var _FloorLampTorchiere: ImageVector? = null
