package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeFloorNegative1: ImageVector
    get() {
        if (_HomeFloorNegative1 != null) {
            return _HomeFloorNegative1!!
        }
        _HomeFloorNegative1 = ImageVector.Builder(
            name = "HomeFloorNegative1",
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
                moveTo(11f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(15f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _HomeFloorNegative1!!
    }

@Suppress("ObjectPropertyName")
private var _HomeFloorNegative1: ImageVector? = null
