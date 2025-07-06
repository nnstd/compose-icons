package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleTonicPlus: ImageVector
    get() {
        if (_BottleTonicPlus != null) {
            return _BottleTonicPlus!!
        }
        _BottleTonicPlus = ImageVector.Builder(
            name = "BottleTonicPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                horizontalLineTo(11f)
                lineTo(10f, 2f)
                horizontalLineTo(14f)
                lineTo(13f, 4f)
                moveTo(14f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                curveTo(7.24f, 8f, 5f, 10.24f, 5f, 13f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                curveTo(19f, 10.24f, 16.76f, 8f, 14f, 8f)
                moveTo(16f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _BottleTonicPlus!!
    }

@Suppress("ObjectPropertyName")
private var _BottleTonicPlus: ImageVector? = null
