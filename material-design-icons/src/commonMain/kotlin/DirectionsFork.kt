package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DirectionsFork: ImageVector
    get() {
        if (_DirectionsFork != null) {
            return _DirectionsFork!!
        }
        _DirectionsFork = ImageVector.Builder(
            name = "DirectionsFork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                verticalLineTo(12.5f)
                lineTo(6f, 9.5f)
                lineTo(9f, 13f)
                curveTo(10f, 14f, 10f, 15f, 10f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                curveTo(14f, 14f, 14f, 13f, 13.47f, 12f)
                curveTo(12.94f, 11f, 12f, 10f, 12f, 10f)
                lineTo(9f, 6.58f)
                lineTo(11.5f, 4f)
                moveTo(18f, 4f)
                lineTo(13.54f, 8.47f)
                lineTo(14f, 9f)
                curveTo(14f, 9f, 14.93f, 10f, 15.47f, 11f)
                curveTo(15.68f, 11.4f, 15.8f, 11.79f, 15.87f, 12.13f)
                lineTo(21f, 7f)
            }
        }.build()

        return _DirectionsFork!!
    }

@Suppress("ObjectPropertyName")
private var _DirectionsFork: ImageVector? = null
