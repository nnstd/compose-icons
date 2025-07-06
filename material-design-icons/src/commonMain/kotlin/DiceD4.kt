package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiceD4: ImageVector
    get() {
        if (_DiceD4 != null) {
            return _DiceD4!!
        }
        _DiceD4 = ImageVector.Builder(
            name = "DiceD4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 15.15f)
                lineTo(11.92f, 12.47f)
                verticalLineTo(15.15f)
                horizontalLineTo(10.25f)
                moveTo(21.92f, 21f)
                horizontalLineTo(2.08f)
                curveTo(1.24f, 21f, 0.72f, 20.08f, 1.16f, 19.36f)
                lineTo(11.08f, 3.13f)
                curveTo(11.5f, 2.44f, 12.5f, 2.44f, 12.92f, 3.13f)
                lineTo(22.84f, 19.36f)
                curveTo(23.28f, 20.08f, 22.76f, 21f, 21.92f, 21f)
                moveTo(14.29f, 15.15f)
                horizontalLineTo(13.43f)
                verticalLineTo(10.42f)
                horizontalLineTo(11.91f)
                lineTo(8.75f, 15.41f)
                lineTo(8.82f, 16.36f)
                horizontalLineTo(11.92f)
                verticalLineTo(18f)
                horizontalLineTo(13.43f)
                verticalLineTo(16.36f)
                horizontalLineTo(14.29f)
                verticalLineTo(15.15f)
                close()
            }
        }.build()

        return _DiceD4!!
    }

@Suppress("ObjectPropertyName")
private var _DiceD4: ImageVector? = null
