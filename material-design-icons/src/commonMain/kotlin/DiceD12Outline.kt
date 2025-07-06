package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiceD12Outline: ImageVector
    get() {
        if (_DiceD12Outline != null) {
            return _DiceD12Outline!!
        }
        _DiceD12Outline = ImageVector.Builder(
            name = "DiceD12Outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(1.5f, 9.64f)
                lineTo(5.5f, 22f)
                horizontalLineTo(18.5f)
                lineTo(22.5f, 9.64f)
                lineTo(12f, 2f)
                moveTo(17f, 20f)
                horizontalLineTo(7f)
                lineTo(3.85f, 10.4f)
                lineTo(12f, 4.47f)
                lineTo(20.15f, 10.4f)
                lineTo(17f, 20f)
                moveTo(17f, 15.75f)
                verticalLineTo(17f)
                horizontalLineTo(11.66f)
                verticalLineTo(15.91f)
                curveTo(11.66f, 15.91f, 15.23f, 12.45f, 15.23f, 11.4f)
                curveTo(15.23f, 10.12f, 14.18f, 10.25f, 14.18f, 10.25f)
                curveTo(13.5f, 10.3f, 13f, 10.87f, 13f, 11.55f)
                horizontalLineTo(11.44f)
                curveTo(11.5f, 10.09f, 12.72f, 8.94f, 14.27f, 9f)
                curveTo(16.74f, 9f, 16.77f, 10.85f, 16.77f, 11.3f)
                curveTo(16.77f, 13.07f, 13.58f, 15.77f, 13.58f, 15.77f)
                lineTo(17f, 15.75f)
                moveTo(10.5f, 17f)
                horizontalLineTo(8.89f)
                verticalLineTo(10.89f)
                lineTo(7f, 11.47f)
                verticalLineTo(10.19f)
                lineTo(10.31f, 9f)
                horizontalLineTo(10.5f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _DiceD12Outline!!
    }

@Suppress("ObjectPropertyName")
private var _DiceD12Outline: ImageVector? = null
