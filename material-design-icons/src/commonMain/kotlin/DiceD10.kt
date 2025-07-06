package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiceD10: ImageVector
    get() {
        if (_DiceD10 != null) {
            return _DiceD10!!
        }
        _DiceD10 = ImageVector.Builder(
            name = "DiceD10",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(11.5f, 2f, 11f, 2.19f, 10.59f, 2.59f)
                lineTo(2.59f, 10.59f)
                curveTo(1.8f, 11.37f, 1.8f, 12.63f, 2.59f, 13.41f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.2f, 12.63f, 22.2f, 13.41f, 21.41f)
                lineTo(21.41f, 13.41f)
                curveTo(22.2f, 12.63f, 22.2f, 11.37f, 21.41f, 10.59f)
                lineTo(13.41f, 2.59f)
                curveTo(13f, 2.19f, 12.5f, 2f, 12f, 2f)
                moveTo(14.07f, 8.21f)
                curveTo(15.5f, 8.21f, 16.64f, 9.36f, 16.64f, 10.78f)
                verticalLineTo(13.42f)
                curveTo(16.64f, 14.84f, 15.5f, 16f, 14.07f, 16f)
                curveTo(12.64f, 16f, 11.5f, 14.84f, 11.5f, 13.42f)
                verticalLineTo(10.78f)
                curveTo(11.5f, 9.36f, 12.65f, 8.21f, 14.07f, 8.21f)
                moveTo(10.36f, 8.41f)
                horizontalLineTo(10.5f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(10.21f)
                lineTo(7.22f, 10.76f)
                verticalLineTo(9.53f)
                lineTo(10.36f, 8.41f)
                moveTo(14.06f, 9.65f)
                curveTo(13.47f, 9.65f, 13f, 10.13f, 13f, 10.71f)
                verticalLineTo(13.5f)
                curveTo(13f, 14.07f, 13.47f, 14.54f, 14.06f, 14.54f)
                curveTo(14.64f, 14.54f, 15.14f, 14.06f, 15.14f, 13.5f)
                verticalLineTo(10.71f)
                curveTo(15.14f, 10.12f, 14.64f, 9.65f, 14.06f, 9.65f)
                close()
            }
        }.build()

        return _DiceD10!!
    }

@Suppress("ObjectPropertyName")
private var _DiceD10: ImageVector? = null
