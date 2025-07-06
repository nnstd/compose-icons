package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FloorLampOutline: ImageVector
    get() {
        if (_FloorLampOutline != null) {
            return _FloorLampOutline!!
        }
        _FloorLampOutline = ImageVector.Builder(
            name = "FloorLampOutline",
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
                moveTo(13.6f, 4f)
                horizontalLineTo(10.4f)
                lineTo(9.55f, 7f)
                horizontalLineTo(14.45f)
                moveTo(11f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _FloorLampOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FloorLampOutline: ImageVector? = null
