package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiceD8Outline: ImageVector
    get() {
        if (_DiceD8Outline != null) {
            return _DiceD8Outline!!
        }
        _DiceD8Outline = ImageVector.Builder(
            name = "DiceD8Outline",
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
                moveTo(12f, 4f)
                lineTo(20f, 12f)
                lineTo(12f, 20f)
                lineTo(4f, 12f)
                moveTo(12f, 8.25f)
                curveTo(13.31f, 8.25f, 14.38f, 9.2f, 14.38f, 10.38f)
                curveTo(14.38f, 11.07f, 14f, 11.68f, 13.44f, 12.07f)
                curveTo(14.14f, 12.46f, 14.6f, 13.13f, 14.6f, 13.9f)
                curveTo(14.6f, 15.12f, 13.44f, 16.1f, 12f, 16.1f)
                curveTo(10.56f, 16.1f, 9.4f, 15.12f, 9.4f, 13.9f)
                curveTo(9.4f, 13.13f, 9.86f, 12.46f, 10.56f, 12.07f)
                curveTo(10f, 11.68f, 9.63f, 11.07f, 9.63f, 10.38f)
                curveTo(9.63f, 9.2f, 10.69f, 8.25f, 12f, 8.25f)
                moveTo(12f, 12.65f)
                curveTo(11.39f, 12.65f, 10.9f, 13.14f, 10.9f, 13.75f)
                curveTo(10.9f, 14.36f, 11.39f, 14.85f, 12f, 14.85f)
                curveTo(12.61f, 14.85f, 13.1f, 14.36f, 13.1f, 13.75f)
                curveTo(13.1f, 13.14f, 12.61f, 12.65f, 12f, 12.65f)
                moveTo(12f, 9.5f)
                curveTo(11.5f, 9.5f, 11.1f, 9.95f, 11.1f, 10.5f)
                curveTo(11.1f, 11.05f, 11.5f, 11.5f, 12f, 11.5f)
                curveTo(12.5f, 11.5f, 12.9f, 11.05f, 12.9f, 10.5f)
                curveTo(12.9f, 9.95f, 12.5f, 9.5f, 12f, 9.5f)
            }
        }.build()

        return _DiceD8Outline!!
    }

@Suppress("ObjectPropertyName")
private var _DiceD8Outline: ImageVector? = null
