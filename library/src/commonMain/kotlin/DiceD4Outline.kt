package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiceD4Outline: ImageVector
    get() {
        if (_DiceD4Outline != null) {
            return _DiceD4Outline!!
        }
        _DiceD4Outline = ImageVector.Builder(
            name = "DiceD4Outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.43f, 15.15f)
                horizontalLineTo(14.29f)
                verticalLineTo(16.36f)
                horizontalLineTo(13.43f)
                verticalLineTo(18f)
                horizontalLineTo(11.92f)
                verticalLineTo(16.36f)
                horizontalLineTo(8.82f)
                lineTo(8.75f, 15.41f)
                lineTo(11.91f, 10.42f)
                horizontalLineTo(13.43f)
                verticalLineTo(15.15f)
                moveTo(10.25f, 15.15f)
                horizontalLineTo(11.92f)
                verticalLineTo(12.47f)
                lineTo(10.25f, 15.15f)
                moveTo(22f, 21f)
                horizontalLineTo(2f)
                curveTo(1.64f, 21f, 1.31f, 20.81f, 1.13f, 20.5f)
                curveTo(0.95f, 20.18f, 0.96f, 19.79f, 1.15f, 19.5f)
                lineTo(11.15f, 3f)
                curveTo(11.5f, 2.38f, 12.5f, 2.38f, 12.86f, 3f)
                lineTo(22.86f, 19.5f)
                curveTo(23.04f, 19.79f, 23.05f, 20.18f, 22.87f, 20.5f)
                curveTo(22.69f, 20.81f, 22.36f, 21f, 22f, 21f)
                moveTo(3.78f, 19f)
                horizontalLineTo(20.23f)
                lineTo(12f, 5.43f)
                lineTo(3.78f, 19f)
                close()
            }
        }.build()

        return _DiceD4Outline!!
    }

@Suppress("ObjectPropertyName")
private var _DiceD4Outline: ImageVector? = null
