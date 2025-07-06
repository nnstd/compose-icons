package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeFloorL: ImageVector
    get() {
        if (_HomeFloorL != null) {
            return _HomeFloorL!!
        }
        _HomeFloorL = ImageVector.Builder(
            name = "HomeFloorL",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                lineTo(12f, 3f)
                moveTo(9f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _HomeFloorL!!
    }

@Suppress("ObjectPropertyName")
private var _HomeFloorL: ImageVector? = null
