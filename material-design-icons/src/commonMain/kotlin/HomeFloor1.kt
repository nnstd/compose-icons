package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeFloor1: ImageVector
    get() {
        if (_HomeFloor1 != null) {
            return _HomeFloor1!!
        }
        _HomeFloor1 = ImageVector.Builder(
            name = "HomeFloor1",
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
                moveTo(10f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _HomeFloor1!!
    }

@Suppress("ObjectPropertyName")
private var _HomeFloor1: ImageVector? = null
