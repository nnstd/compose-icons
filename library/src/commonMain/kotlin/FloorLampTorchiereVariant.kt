package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FloorLampTorchiereVariant: ImageVector
    get() {
        if (_FloorLampTorchiereVariant != null) {
            return _FloorLampTorchiereVariant!!
        }
        _FloorLampTorchiereVariant = ImageVector.Builder(
            name = "FloorLampTorchiereVariant",
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
                moveTo(15.92f, 22f)
                lineTo(13f, 15f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                lineTo(8.08f, 22f)
                horizontalLineTo(5.92f)
                lineTo(10.92f, 10f)
                horizontalLineTo(13.08f)
                lineTo(18.08f, 22f)
                horizontalLineTo(15.92f)
                close()
            }
        }.build()

        return _FloorLampTorchiereVariant!!
    }

@Suppress("ObjectPropertyName")
private var _FloorLampTorchiereVariant: ImageVector? = null
