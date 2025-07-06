package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleTonicOutline: ImageVector
    get() {
        if (_BottleTonicOutline != null) {
            return _BottleTonicOutline!!
        }
        _BottleTonicOutline = ImageVector.Builder(
            name = "BottleTonicOutline",
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
                moveTo(19f, 13f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                curveTo(5f, 10.24f, 7.24f, 8f, 10f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                curveTo(16.76f, 8f, 19f, 10.24f, 19f, 13f)
                moveTo(17f, 13f)
                curveTo(17f, 11.35f, 15.65f, 10f, 14f, 10f)
                horizontalLineTo(10f)
                curveTo(8.35f, 10f, 7f, 11.35f, 7f, 13f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _BottleTonicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BottleTonicOutline: ImageVector? = null
