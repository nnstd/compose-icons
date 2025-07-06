package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FloorLampTorchiereOutline: ImageVector
    get() {
        if (_FloorLampTorchiereOutline != null) {
            return _FloorLampTorchiereOutline!!
        }
        _FloorLampTorchiereOutline = ImageVector.Builder(
            name = "FloorLampTorchiereOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 4f)
                lineTo(12.7f, 7f)
                horizontalLineTo(11.3f)
                lineTo(10f, 4f)
                horizontalLineTo(14f)
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                lineTo(10f, 9f)
                horizontalLineTo(14f)
                lineTo(17f, 2f)
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

        return _FloorLampTorchiereOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FloorLampTorchiereOutline: ImageVector? = null
